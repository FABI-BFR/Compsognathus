package bytecode;

import bytecode.exceptions.InvalidExpressionException;
import bytecode.exceptions.InvalidStatementException;
import bytecode.exceptions.InvalidStatementExpressionException;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import org.objectweb.asm.*;
import semantikCheck.*;
import semantikCheck.Class;
import semantikCheck.Type;
import semantikCheck.expr.*;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmt;
import semantikCheck.interfaces.IStmtExpr;
import semantikCheck.stmt.*;
import semantikCheck.stmtexpr.Assign;
import semantikCheck.stmtexpr.LeftSideExpr;
import semantikCheck.stmtexpr.MethodCall;
import semantikCheck.stmtexpr.New;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class ByteCodeGenerator
{

    public List<ClassFile> generate (@NotNull Program _program)
    {

        List<ClassFile> classFiles = new ArrayList<>();

        List<Class> classes = _program.getClasses();
        for (Class c : classes)
        {
            ClassGenerator classGenerator = new ClassGenerator(
                    new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS),
                    c.getName().replace('.', '/'));

            classGenerator.getClassWriter().visit(Opcodes.V1_4, // Java Version (Mini Java is v1.4
                    parseVisibility(c.getAccess()),             // Visibility
                    classGenerator.getName(),                   // Classname
                    null,                               // Signature (no generics/interfaces)
                    "java/lang/Object",
                    null);


            //Visit constructor
            for (Constructor constructor : c.getConstructors()) {
                String name = "<init>";
                String type = "()V";

                MethodVisitor mv = classGenerator.getClassWriter().visitMethod(
                        parseVisibility(constructor.getAccess()), // Visibility
                        name,                                     // Methodname
                        type,                                     // Type
                        null,
                        null);
                mv.visitCode();


                MethodGenerator method = new MethodGenerator(mv, constructor.getParameter(), constructor.getName(), classGenerator);
                visitBlockStmt(method, constructor.getStatement(), true);

                mv.visitMaxs(0, 0);
                mv.visitEnd();
            }

            //Visit methods
            for (Method m : c.getMethods()) {
                String name = m.getName();
                String type = parseMethodType(m.getType(), m.getParameter());

                MethodVisitor mv = classGenerator.getClassWriter().visitMethod(
                        parseVisibility(m.getAccess()), // Visibility
                        name,                           // Methodname
                        type,                           // Type
                        null,
                        null);
                mv.visitCode();

                MethodGenerator method = new MethodGenerator(mv, m.getParameter(), m.getName(), classGenerator);
                visitBlockStmt(method, m.getStatement(), false);

                //return of method
                mv.visitInsn(parseReturnType(m.getType()));

                mv.visitMaxs(0,0);
                mv.visitEnd();
            }

            // Visit fields
            for(Field f : c.getFields()){
                String fieldName = f.getName();
                String type = parseType(f.getType());

                classGenerator.getFields().put(fieldName, type);
                FieldVisitor fv = classGenerator.getClassWriter().visitField(
                        parseVisibility(f.getAccess()), // Visibility
                        fieldName,                      // Fieldname
                        type,                           // Type
                        null,
                        null);
                fv.visitEnd();
            }

            classGenerator.getClassWriter().visitEnd();
            classFiles.add(new ClassFile(c.getName(), classGenerator.getClassWriter().toByteArray()));
        }
        return classFiles;
    }

    /**
     * Parse a visibility modifier to Opcode
     * @param _acces visibility modifier
     * @return Opcode
     */
    private int parseVisibility(@NotNull Access _acces){
        int result = Opcodes.ACC_PUBLIC;
        switch (_acces)
        {
            case PUBLIC -> result = Opcodes.ACC_PUBLIC;
            case PRIVATE -> result = Opcodes.ACC_PRIVATE;
            case PROTECTED -> result = Opcodes.ACC_PROTECTED;
            default -> {
            }
        }
        return result;
    }


    /**
     * Parses a type to a JVM Type Signature
     * @param _type Type name
     * @return JVM Type Signature
     */
    private String parseType(@NotNull Type _type){
        String type = _type.getType().replace('.','/');

        StringBuilder result = new StringBuilder();

        boolean isArray = type.endsWith("[]");
        if(isArray){
            result.append("[");
            type = type.substring(0, type.length() - 3);
        }

        switch (type)
        {
            case "boolean" -> result.append("Z");
            case "byte" -> result.append("B");
            case "char" -> result.append("C");
            case "short" -> result.append("S");
            case "int" -> result.append("I");
            case "long" -> result.append("J");
            case "float" -> result.append("F");
            case "double" -> result.append("D");
            case "void" -> result.append("V");
            default -> result.append("L").append(type).append(";");
        }

        return result.toString();
    }

    /**
     * Parses a method type to a JVM Type Singanture
     * @return Method type
     */
    private String parseMethodType(@NotNull Type _type,
                                   @NotNull List<Parameter> _parameters){
        StringBuilder result = new StringBuilder();

        // Parse arguments
        result.append("(");
        for (Parameter par : _parameters) {
            result.append(parseType(par.getType()));
        }
        result.append(")");

        // Parse return type
        result.append(parseType(_type));

        return result.toString();
    }

    /**
     * Parses Return type to Opcode
     * @param _type Return type
     * @return Type as Opcode
     */
    @Contract(pure = true)
    private int parseReturnType(@NotNull Type _type)
    {
        String type = _type.getType();

        return switch (type)
                {
                    case "boolean", "byte", "char", "short", "int" -> Opcodes.IRETURN;
                    case "long" -> Opcodes.LRETURN;
                    case "float" -> Opcodes.FRETURN;
                    case "double" -> Opcodes.DRETURN;
                    case "void" -> Opcodes.RETURN;
                    default -> Opcodes.ARETURN;
                };
    }

    /**
     * Parses the type of a variable to an Opcode
     * @param _type Variable type
     * @return Typa as Opcode
     */
    private int parseVarType(@NotNull Type _type){
        String type = _type.getType();

        return switch (type)
                {
                    case "boolean", "byte", "char", "short", "int" -> Opcodes.INTEGER;
                    case "long" -> Opcodes.LONG;
                    case "float" -> Opcodes.FLOAT;
                    case "double" -> Opcodes.DOUBLE;
                    default -> -1;
                };
    }


    /**
     * Resolves a block statement
     * @param _method Object containing method stuff
     * @param _block statement to resolve
     * @param _isConstructor Is the block constructor
     */
    private void visitBlockStmt(@NotNull MethodGenerator _method,
                                  @NotNull Block _block,
                                  boolean _isConstructor){
        if(_isConstructor){
            _method.getMethodVisitor().visitVarInsn(Opcodes.ALOAD,0);
            _method.getMethodVisitor().visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>","()V", false);
        }

        for(IStmt stmt : _block.getStatements()){
            resolveStmt(_method, stmt);
        }
    }

    /**
     * Resolves a Bool Expression
     * @param _method Object containing method stuff
     * @param _boolExpr Expression to resolve
     */
    private void visitBoolExpr(@NotNull MethodGenerator _method,
                               @NotNull BoolLit _boolExpr)
    {
        if (_boolExpr.value) {
            _method.getMethodVisitor().visitInsn(Opcodes.ICONST_1);
        } else {
            _method.getMethodVisitor().visitInsn(Opcodes.ICONST_0);
        }
    }

    /**
     * Resolves a Char Expression
     * @param _method Object containing method stuff
     * @param _charExpr Expression to resolve
     */
    private void visitCharExpr(@NotNull MethodGenerator _method,
                               @NotNull CharLit _charExpr)
    {
        _method.getMethodVisitor().visitIntInsn(Opcodes.BIPUSH, Character.getNumericValue(_charExpr.value));
    }

    /**
     * Resolves an Integer Expression
     * @param _method Object containing method stuff
     * @param _intExpr Expression to resolve
     */
    private void visitIntExpr(@NotNull MethodGenerator _method,
                              @NotNull IntegerLit _intExpr)
    {
        _method.getMethodVisitor().visitIntInsn(Opcodes.SIPUSH, _intExpr.value);
    }


    /**
     * Resolves a Null Expression
     * @param _method Object containing method stuff
     * @param _nullExpr Expression to resolve
     */
    private void visitNullExpr(@NotNull MethodGenerator _method,
                               @NotNull JNull _nullExpr)
    {
        _method.getMethodVisitor().visitInsn(Opcodes.ACONST_NULL);
    }

    /**
     * Resolves a String Expression
     * @param _method Object containing method stuff
     * @param _stringExpr Expression to resolve
     */
    private void visitStringExpr(@NotNull MethodGenerator _method,
                                 @NotNull StringLit _stringExpr)
    {
        _method.getMethodVisitor().visitLdcInsn(_stringExpr.value);
    }

    /**
     * Resolves a Super Expression
     * @param _method Object containing method stuff
     * @param _super Expression to resolve
     */
    private void visitSuper(@NotNull MethodGenerator _method,
                            @NotNull Super _super)
    {
        //TODO Implementieren
    }

    /**
     * Resolves a This Expression
     * @param _method Object containing method stuff
     * @param _this Expression to resolve
     */
    private void visitThis(@NotNull MethodGenerator _method,
                           @NotNull This _this)
    {
        _method.getMethodVisitor().visitVarInsn(Opcodes.ALOAD, 0);
    }

    /**
     * Resolves a While Statement
     * @param _method Object containg mehtod stuff
     * @param _stmt Statement to resolve
     */
    private void visitWhile(MethodGenerator _method, While _stmt)
    {
        Label loop = new Label();
        _method.getMethodVisitor().visitLabel(loop);
        resolveExpr(_method, _stmt.getExpression());
        Label end = new Label();
        _method.getMethodVisitor().visitJumpInsn(Opcodes.IFNE, end);
        resolveStmt(_method, _stmt.getStatement());
        _method.getMethodVisitor().visitJumpInsn(Opcodes.GOTO, loop);
        _method.getMethodVisitor().visitLabel(end);
    }

    /**
     * Resolves a Typed Statement
     * @param method Object containing method stuff
     * @param stmt Statement to resolve
     */
    private void visitTypedStmt(MethodGenerator method, TypedStmt stmt)
    {
        //Todo implementieren
    }

    /**
     * Resolves a Return Statement
     * @param method Object containing method stuff
     * @param stmt Statement to resolve
     */
    private void visitReturn(MethodGenerator method, Return stmt)
    {
        resolveExpr(method, stmt.getExpression());
        method.getMethodVisitor().visitInsn(parseReturnType(stmt.getType()));
    }

    /**
     * Resolves a If Statement
     * @param _method Object containing method stuff
     * @param _stmt Statement to resolve
     */
    private void visitIfStmt(MethodGenerator _method, If _stmt) {
        resolveExpr(_method,_stmt.getExpression());
        Label elseLabel = new Label();
        _method.getMethodVisitor().visitJumpInsn(Opcodes.IFNE, elseLabel);
        resolveStmt(_method, _stmt.getIfStmt());
        Label end = new Label();
        _method.getMethodVisitor().visitJumpInsn(Opcodes.GOTO, end);
        _method.getMethodVisitor().visitLabel(elseLabel);
        resolveStmt(_method,_stmt.getElseStmt());
        _method.getMethodVisitor().visitLabel(end);
    }

    private void visitInstVar(@NotNull MethodGenerator _method,
                              @NotNull InstVar _instVar){
        //Todo implementieren
        resolveExpr(_method,_instVar.expression);
    }

    private void visitAssign(@NotNull MethodGenerator _method,
                             @NotNull Assign _assign){
        //Todo implementieren

    }

    private void visitMethodCall(@NotNull MethodGenerator _method,
                                 @NotNull MethodCall _methodCall){
        resolveExpr(_method, _methodCall);
    }

    private void visitLocalOrFieldVar(@NotNull MethodGenerator _method,
                                      @NotNull LocalOrFieldVar _localOrFieldVar){
        //Todo implementieren

        switch (_localOrFieldVar.getType().getType()){
            case "boolean":
                break;
            case "byte":
                break;
            case "char":
                break;
            case "int":
                break;
            case "short":
                break;
            case "long":
                break;
            case "float":
                break;
            case "double":
                break;
        }


    }

    private void visitNew(@NotNull MethodGenerator _method,
                          @NotNull New _new) {
        //Todo implementieren
        _method.getMethodVisitor().visitTypeInsn(Opcodes.NEW, _new.getType().getType());
        _method.getMethodVisitor().visitInsn(Opcodes.DUP);

    }

    /**
     * resolves a binary expression
     * @param _method Objetct containging method stuff
     * @param _binary expression to resolve
     */
    private void visitBinary(@NotNull MethodGenerator _method,
                             @NotNull Binary _binary){
        boolean isComparison = false;
        int opcode = -1;
        switch (_binary.operator)
        {
            case "+" -> {
                resolveExpr(_method, _binary.exprLeft);
                resolveExpr(_method, _binary.exprRight);
                _method.getMethodVisitor().visitInsn(Opcodes.IADD);
            }
            case "-" -> {
                resolveExpr(_method, _binary.exprLeft);
                resolveExpr(_method, _binary.exprRight);
                _method.getMethodVisitor().visitInsn(Opcodes.ISUB);
            }
            case "*" -> {
                resolveExpr(_method, _binary.exprLeft);
                resolveExpr(_method, _binary.exprRight);
                _method.getMethodVisitor().visitInsn(Opcodes.IMUL);
            }
            case "/" -> {
                resolveExpr(_method, _binary.exprLeft);
                resolveExpr(_method, _binary.exprRight);
                _method.getMethodVisitor().visitInsn(Opcodes.IDIV);
            }
            case "%" -> {
                resolveExpr(_method, _binary.exprLeft);
                resolveExpr(_method, _binary.exprRight);
                _method.getMethodVisitor().visitInsn(Opcodes.IREM);
            }
            case "<<" -> {
                resolveExpr(_method, _binary.exprLeft);
                resolveExpr(_method, _binary.exprRight);
                _method.getMethodVisitor().visitInsn(Opcodes.ISHL);
            }
            case ">>" -> {
                resolveExpr(_method, _binary.exprLeft);
                resolveExpr(_method, _binary.exprRight);
                _method.getMethodVisitor().visitInsn(Opcodes.ISHR);
            }
            case ">>>" -> {
                resolveExpr(_method, _binary.exprLeft);
                resolveExpr(_method, _binary.exprRight);
                _method.getMethodVisitor().visitInsn(Opcodes.IUSHR);
            }
            case "&" -> {
                resolveExpr(_method, _binary.exprLeft);
                resolveExpr(_method, _binary.exprRight);
                _method.getMethodVisitor().visitInsn(Opcodes.IAND);
            }
            case "|" -> {
                resolveExpr(_method, _binary.exprLeft);
                resolveExpr(_method, _binary.exprRight);
                _method.getMethodVisitor().visitInsn(Opcodes.IOR);
            }
            case "^" -> {
                resolveExpr(_method, _binary.exprLeft);
                resolveExpr(_method, _binary.exprRight);
                _method.getMethodVisitor().visitInsn(Opcodes.IXOR);
            }
            case "<" -> {
                resolveExpr(_method, _binary.exprLeft);
                resolveExpr(_method, _binary.exprRight);
                isComparison = true;
                opcode = Opcodes.IF_ICMPLT;
            }
            case "<=" -> {
                resolveExpr(_method, _binary.exprLeft);
                resolveExpr(_method, _binary.exprRight);
                isComparison = true;
                opcode = Opcodes.IF_ICMPLE;
            }
            case ">" -> {
                resolveExpr(_method, _binary.exprLeft);
                resolveExpr(_method, _binary.exprRight);
                isComparison = true;
                opcode = Opcodes.IF_ICMPGT;
            }
            case ">=" -> {
                resolveExpr(_method, _binary.exprLeft);
                resolveExpr(_method, _binary.exprRight);
                isComparison = true;
                opcode = Opcodes.IF_ICMPGE;
            }
            case "==" -> {
                resolveExpr(_method, _binary.exprLeft);
                resolveExpr(_method, _binary.exprRight);
                isComparison = true;
                opcode = Opcodes.IF_ICMPEQ;
            }
            case "&&" -> {
                resolveExpr(_method, _binary.exprLeft);
                Label returnFalse = new Label();
                _method.getMethodVisitor().visitJumpInsn(Opcodes.IFNE, returnFalse);
                resolveExpr(_method, _binary.exprRight);
                _method.getMethodVisitor().visitJumpInsn(Opcodes.IFNE, returnFalse);
                _method.getMethodVisitor().visitInsn(Opcodes.ICONST_0);
                Label end = new Label();
                _method.getMethodVisitor().visitJumpInsn(Opcodes.GOTO, end);
                _method.getMethodVisitor().visitLabel(returnFalse);
                _method.getMethodVisitor().visitInsn(Opcodes.ICONST_1);
                _method.getMethodVisitor().visitLabel(end);
            }
            case "||" -> {
                resolveExpr(_method, _binary.exprLeft);
                Label returnTrue = new Label();
                _method.getMethodVisitor().visitJumpInsn(Opcodes.IFEQ, returnTrue);
                resolveExpr(_method, _binary.exprRight);
                _method.getMethodVisitor().visitJumpInsn(Opcodes.IFEQ, returnTrue);
                _method.getMethodVisitor().visitInsn(Opcodes.ICONST_0);
                Label end2 = new Label();
                _method.getMethodVisitor().visitJumpInsn(Opcodes.GOTO, end2);
                _method.getMethodVisitor().visitLabel(returnTrue);
                _method.getMethodVisitor().visitInsn(Opcodes.ICONST_1);
                _method.getMethodVisitor().visitLabel(end2);
            }
        }


    }

    /**
     * resolves an unary expression
     * @param _method Ovject containing method stuff
     * @param _unary expression to resolve
     */
    private void visitUnary(@NotNull MethodGenerator _method,
                            @NotNull Unary _unary){
        switch (_unary.operator){
            case "~":
                resolveExpr(_method, _unary.expression);
                _method.getMethodVisitor().visitInsn(Opcodes.ICONST_M1);
                _method.getMethodVisitor().visitInsn(Opcodes.IXOR);
                break;
            case "!":
                //Todo fertig implementieren
                resolveExpr(_method, _unary.expression);
                Label exprIsTrue = new Label();
                Label endIf = new Label();

                _method.getMethodVisitor().visitJumpInsn(Opcodes.IFEQ, exprIsTrue);
                _method.getMethodVisitor().visitInsn(Opcodes.ICONST_0);
                _method.getMethodVisitor().visitJumpInsn(Opcodes.IFEQ, endIf);
                _method.getMethodVisitor().visitLabel(exprIsTrue);

                Object[] objects = new Object[_method.getVariables().size() + 1];
                objects[0] = _method.getClassGenerator().getName();

                _method.getMethodVisitor().visitInsn(Opcodes.ICONST_1);
                _method.getMethodVisitor().visitLabel(endIf);
                break;
        }
    }


    /**
     * resolves a statement
     * @param _method Object containing method stuff
     * @param _stmt statement to resolve
     */
    private void resolveStmt(@NotNull MethodGenerator _method,
                             @NotNull IStmt _stmt){
        //TODO check for statements and visit them
        if(_stmt instanceof Block){
            visitBlockStmt(_method, (Block)_stmt,false);
        }else if(_stmt instanceof If){
            visitIfStmt(_method,(If)_stmt);
        } else if(_stmt instanceof Return){
            visitReturn(_method,(Return)_stmt);
        } else if(_stmt instanceof TypedStmt){
            visitTypedStmt(_method,(TypedStmt)_stmt);
        }else if(_stmt instanceof While){
            visitWhile(_method,(While)_stmt);
        } else {
            throw new InvalidStatementException(_stmt.toString() + " is not a valid Statement!");
        }
    }

    /**
     * resolves an expression
     * @param _method Object containing method stuff
     * @param _expr expression to resolve
     */
    private void resolveExpr(@NotNull MethodGenerator _method,
                             @NotNull IExpr _expr){
        //Todo imlpementieren

        if(_expr instanceof Binary){
            visitBinary(_method, (Binary) _expr);
        } else if(_expr instanceof BoolLit){
            visitBoolExpr(_method, (BoolLit) _expr);
        } else if(_expr instanceof CharLit){
            visitCharExpr(_method, (CharLit) _expr);
        } else if (_expr instanceof InstVar){
            visitInstVar(_method, (InstVar) _expr);
        } else if (_expr instanceof IntegerLit){
            visitIntExpr(_method, (IntegerLit) _expr);
        } else if (_expr instanceof JNull){
            visitNullExpr(_method, (JNull) _expr);
        } else if(_expr instanceof LocalOrFieldVar){
            visitLocalOrFieldVar(_method, (LocalOrFieldVar) _expr);
        } else if(_expr instanceof StringLit){
            visitStringExpr(_method, (StringLit) _expr);
        } else if(_expr instanceof Super){
            visitSuper(_method, (Super) _expr);
        } else if(_expr instanceof This){
            visitThis(_method, (This) _expr);
        } else if(_expr instanceof Unary){
            visitUnary(_method, (Unary) _expr);
        } else {
            throw new InvalidExpressionException(_expr.toString() + " is not a valid Expression!");
        }
    }

    private void resolveStmtExpr(@NotNull MethodGenerator _method,
                                 @NotNull IStmtExpr _stmtExpr){
        if(_stmtExpr instanceof Assign){
            visitAssign(_method, (Assign) _stmtExpr);
        } else if (_stmtExpr instanceof MethodCall){
            visitMethodCall(_method, (MethodCall) _stmtExpr);
        } else if(_stmtExpr instanceof New){
            visitNew(_method, (New) _stmtExpr);
        } else {
            throw new InvalidStatementExpressionException(_stmtExpr.toString() + " is not a valid Statementexpression!");
        }
    }





}
