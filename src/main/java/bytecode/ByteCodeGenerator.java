package bytecode;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import org.objectweb.asm.*;
import semantikCheck.*;
import semantikCheck.Class;
import semantikCheck.Type;
import semantikCheck.expr.*;
import semantikCheck.interfaces.IStmt;
import semantikCheck.stmt.Block;

import java.util.ArrayList;
import java.util.List;


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

            // Visit fields
            /*
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
            }*/

            //Visit constructor
            for (Constructor constructor : c.getConstructors()){
                String name = "<init>";
                String type = "void";

                MethodVisitor mv = classGenerator.getClassWriter().visitMethod(
                        parseVisibility(constructor.getAccess()), // Visibility
                        name,                           // Methodname
                        type,                           // Type
                        null,
                        null);
                mv.visitCode();

                //
                MethodGenerator method = new MethodGenerator(mv, constructor.getParameter(), constructor.getName(), classGenerator);
                visitBlockStmt(method, constructor.getStatement(), true);

                mv.visitMaxs(0,0);
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
        switch (_acces){
            case PUBLIC:
                break;
            case PRIVATE:
                break;
            default:
                break;
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
     * @return
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

    private void visitBlockStmt(@NotNull MethodGenerator _method,
                                  @NotNull Block _block,
                                  boolean _isConstructor){
        if(_isConstructor){
            _method.getMethodVisitor().visitVarInsn(Opcodes.ALOAD,0);
            _method.getMethodVisitor().visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<int>","()V", false);
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


    private void resolveStmt(@NotNull MethodGenerator _method,
                             @NotNull IStmt _stmt){
        //TODO check for statements and visit them
    }

    //visitInstVar
    //visitLocalOrFieldVar
    //visitIfStatement
    //visitLocalVarDecl
    //visitStatementExpressionStatement
    //visitWhile
    //visitAssign
    //visitMethodCall
    //visitNew
    //visitBinary
    //resolve statementexpression
    //resolve expression
    //visitUnary

}
