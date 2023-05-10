package parseTreeConverter;

import antlr.Compiler_grammarParser;
import semantikCheck.*;
import semantikCheck.Class;
import semantikCheck.expr.LocalOrFieldVar;
import semantikCheck.interfaces.IStmt;
import semantikCheck.interfaces.IStmtExpr;
import semantikCheck.stmt.Block;
import semantikCheck.stmtexpr.Assign;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Converter {
    public static Program convertToProgram(Compiler_grammarParser.CompilationunitContext parseTree) {
        return new Program(convertToClassList(parseTree.classdeclarations()));
    }

    private static List<Class> convertToClassList(Compiler_grammarParser.ClassdeclarationsContext parseClasses) {
        List<Class> classes = new ArrayList<>();
        for (Compiler_grammarParser.ClassdeclarationContext context : parseClasses.classdeclaration()) {
            classes.add(convertToClass(context));
        }
        return classes;
    }

    private static Class convertToClass(Compiler_grammarParser.ClassdeclarationContext classContext) {
        List<Method> methods = new ArrayList<>();
        List<Field> fields = new ArrayList<>();
        List<Constructor> constructors = new ArrayList<>();
        if (!classContext.classbody().isEmpty()) {
            classContext.classbody()
                    .classbodydeclarations()
                    .classbodydeclaration()
                    .forEach(classbodydeclarationContext -> {
                        if (!classbodydeclarationContext.isEmpty()) {
                            if (classbodydeclarationContext.methoddeclaration() != null) {
                                methods.add(convertToMethod(classbodydeclarationContext.methoddeclaration()));
                            } else if (classbodydeclarationContext.fielddeclaration() != null) {
                                fields.addAll(convertToFields(classbodydeclarationContext.fielddeclaration()));
                            } else if(classbodydeclarationContext.constructordeclaration() != null) {
                                constructors.add(convertToConstructor(classbodydeclarationContext.constructordeclaration()));
                            }
                        }
                    });
        }
        if (constructors.isEmpty()) {
            constructors.add(createDefaultConstructor(classContext.CLASSIDENTIFIER().getText()));
        }
        if (classContext.accessmodifier().isEmpty()) {
            return new Class(classContext.CLASSIDENTIFIER().getText(),
                    constructors,
                    fields,
                    methods);
        } else {
            return new Class(classContext.CLASSIDENTIFIER().getText(),
                    constructors,
                    fields,
                    methods,
                    getForAccessModifier(classContext.accessmodifier()));
        }
    }

    private static Constructor createDefaultConstructor(String _className) {
        Block block = new Block(new ArrayList<IStmt>());
        List<Parameter> parameter = new ArrayList<>();
        return new Constructor(_className, parameter, block);
    }

    private static Constructor convertToConstructor(Compiler_grammarParser.ConstructordeclarationContext constructordeclaration) {
        var body = constructordeclaration.constructorbody();
        var head = constructordeclaration.constructordeclarator();
        String name = head.CLASSIDENTIFIER().getText();

        Access access = Access.PUBLIC;
        if(constructordeclaration.accessmodifier() != null){
            access = Access.valueOf(constructordeclaration.accessmodifier().getText().toUpperCase());
        }

        List<Parameter> parameters = getParameter(head.formalparameterlist());

        Block block = getBlock(body.blockstatements());

        return new Constructor(name,parameters,block,access);
    }

    private static Block getBlock(Compiler_grammarParser.BlockstatementsContext blockstatements)
    {
        List<IStmt> blockStmts = new ArrayList<>();

        return new Block(blockStmts);
    }


    private static List<Parameter> getParameter(Compiler_grammarParser.FormalparameterlistContext formalparameterlist)
    {
        List<Parameter> parameters = new ArrayList<>();
        while(formalparameterlist != null){
            var par = formalparameterlist.formalparameter();
            parameters.add(new Parameter(getType(par.type()),par.IDENTIFIER().getText()));
        }
        Collections.reverse(parameters);
        return parameters;
    }

    private static Method convertToMethod(Compiler_grammarParser.MethoddeclarationContext methodcontext) {

        Compiler_grammarParser.MethodheaderContext header = methodcontext.methodheader();

        String methodName = header.methoddeclarator().IDENTIFIER().getText();

        Access ac;
        if (header.accessmodifier().isEmpty()) ac = Access.PUBLIC;
        else ac = getForAccessModifier(header.accessmodifier());


        List<Parameter> parameters = new ArrayList<>();

        if (header.methoddeclarator().formalparameterlist() != null) {
            parameters.addAll(convertToParameters(header.methoddeclarator().formalparameterlist()));
        }
        Block body = new Block(new ArrayList<IStmt>());
        if (methodcontext.methodbody().isEmpty()) {
            body = convertToBlock(methodcontext.methodbody().block());
        }
        if (header.type() == null) {
            return new Method(new Type("void"), methodName, parameters, body, ac);
        }
        return new Method(new Type(header.type().getText()), methodName, parameters, body, ac);
    }

    private static Block convertToBlock(Compiler_grammarParser.BlockContext blockContext) {
        List<IStmt> stmts = new ArrayList<>();
        if (blockContext.blockstatements() == null) return new Block(new ArrayList<IStmt>());
        blockContext.blockstatements().blockstatement().forEach(blockstatementContext -> {
                if(blockstatementContext.localvariabledeclaration() != null){
                    stmts.addAll(convertToLocalVarDecls(blockstatementContext.localvariabledeclaration()));
                }
            }
        );
        return new Block(stmts);
    }

    private static List<IStmt> convertToLocalVarDecls(Compiler_grammarParser.LocalvariabledeclarationContext localVarContext) {
        if(localVarContext.variabledeclarators() == null) return new ArrayList<IStmt>();
        Type type = getType(localVarContext.type());
        return convertToLocalVarDecls(localVarContext.variabledeclarators(),type);
    }

    private static List<IStmt> convertToLocalVarDecls(Compiler_grammarParser.VariabledeclaratorsContext variabledeclarators,Type type) {
        List<IStmt> stmts = new ArrayList<>();
        stmts.add(convertToLocalVarDecl(variabledeclarators.variabledeclarator(),type));
        if(variabledeclarators.variabledeclarators() == null) return stmts;
        stmts.addAll(convertToLocalVarDecls(variabledeclarators.variabledeclarators(),type));
        return stmts;
    }
    private static IStmt convertToLocalVarDecl(Compiler_grammarParser.VariabledeclaratorContext variabledeclaratorContext,Type type){
        String name = variabledeclaratorContext.IDENTIFIER().getText();
        if(variabledeclaratorContext.statementexpression() == null) return new LocalOrFieldVar(type,name);
        IStmtExpr stmtExpr = convertToStmtExpr(variabledeclaratorContext.statementexpression());

    }

    private static IStmtExpr convertToStmtExpr(Compiler_grammarParser.StatementexpressionContext statementexpression) {
    }

    private static List<Parameter> convertToParameters(Compiler_grammarParser.FormalparameterlistContext parameterListContext) {
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(convertToParameter(parameterListContext.formalparameter()));
        if (parameterListContext.formalparameterlist() == null) return parameters;
        parameters.addAll(convertToParameters(parameterListContext.formalparameterlist()));
        return parameters;
    }

    private static Parameter convertToParameter(Compiler_grammarParser.FormalparameterContext parameterContext) {
        return new Parameter(getType(parameterContext.type()), parameterContext.IDENTIFIER().getText());
    }

    private static List<Field> convertToFields(Compiler_grammarParser.FielddeclarationContext fieldcontext) {
        Type type = getType(fieldcontext.type());

        Access access = Access.PUBLIC;
        if (fieldcontext.accessmodifier() != null) {
            access = getForAccessModifier(fieldcontext.accessmodifier());
        }
        return convertToFields(fieldcontext, access, type);
    }

    private static List<Field> convertToFields(Compiler_grammarParser.FielddeclarationContext fieldcontext, Access access, Type type) {
        List<Field> fields = new ArrayList<>();
        fields.add(convertToField(fieldcontext, access, type));

        if (fieldcontext.variabledeclarators().isEmpty()) return fields;
        fields.addAll(convertToFields(fieldcontext, access, type));

        return fields;
    }

    private static Field convertToField(Compiler_grammarParser.FielddeclarationContext fielddeclarationContext, Access access, Type type) {
        return new Field(type, fielddeclarationContext.getText(), access);
    }


    private static Access getForAccessModifier(Compiler_grammarParser.AccessmodifierContext acc) {
        return switch (acc.getText()) {
            case "private" -> Access.PRIVATE;
            case "protected" -> Access.PROTECTED;
            case "public" -> Access.PUBLIC;
            default -> Access.PUBLIC;
        };
    }

    private static Type getType(Compiler_grammarParser.TypeContext typeContext) {
        if (typeContext.primitivetype() != null) {
            if (typeContext.primitivetype().INT() != null) {
                return new Type("int");
            } else if (typeContext.primitivetype().CHAR() != null) {
                return new Type("char");
            } else if (typeContext.primitivetype().BOOLEAN() != null) {
                return new Type("boolean");
            }
        } else if (typeContext.abstracttype() != null) {
            if (typeContext.abstracttype().name() != null) {
                return new Type(typeContext.abstracttype().name().getText());
            } else if (typeContext.abstracttype().STRING() != null) {
                return new Type("java.lang.String");
            }
        }
        return new Type("");
    }
}
