package parseTreeConverter;

import antlr.Compiler_grammarParser;
import com.sun.security.jgss.GSSUtil;
import semantikCheck.*;
import semantikCheck.Class;
import semantikCheck.expr.LocalOrFieldVar;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmt;
import semantikCheck.stmt.Block;
import semantikCheck.stmt.LocalVarDecl;
import semantikCheck.stmtexpr.Assign;

import java.util.*;
import java.util.ArrayList;

import java.util.Collection;
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
                            if (!classbodydeclarationContext.methoddeclaration().isEmpty()) {
                                methods.add(convertToMethod(classbodydeclarationContext.methoddeclaration()));
                            } else if(!classbodydeclarationContext.fielddeclaration().isEmpty()){
                                fields.add(convertToField(classbodydeclarationContext.fielddeclaration()));
                            }else {
                                constructors.add(convertToConstructor(classbodydeclarationContext.constructordeclaration()));
                            }
                        }
                    });
        }
        if (classContext.accessmodifier().isEmpty()) {
            return new Class(classContext.CLASSIDENTIFIER().getText(),
                    fields,
                    methods);
        } else {
            return new Class(classContext.CLASSIDENTIFIER().getText(),
                    fields,
                    methods,
                    getForAccessModifier(classContext.accessmodifier()));
        }
    }

    private static Constructor convertToConstructor(Compiler_grammarParser.ConstructordeclarationContext constructordeclaration) {
        return null;
    }

    private static Method convertToMethod(Compiler_grammarParser.MethoddeclarationContext methodcontext) {

        Compiler_grammarParser.MethodheaderContext header = methodcontext.methodheader();

        String methodName = header.methoddeclarator().IDENTIFIER().getText();

        Access ac;
        if (header.accessmodifier().isEmpty()) ac = Access.PUBLIC;
        else ac = getForAccessModifier(header.accessmodifier());


        List<Parameter> parameters = new ArrayList<>();

        if (!header.methoddeclarator().formalparameterlist().isEmpty()) {
            parameters.addAll(convertToParameters(header.methoddeclarator().formalparameterlist()));
        }
        Block body = null;//@TODO nicht nullen, und parameter checken

        if (header.type().isEmpty()) {
            return new Method(new Type("void"), methodName, parameters, body, ac);
        }
        return new Method(new Type(header.type().getText()), methodName, parameters, body, ac);
    }

    private static List<Parameter> convertToParameters(Compiler_grammarParser.FormalparameterlistContext parameterListContext) {
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(convertToParameter(parameterListContext.formalparameter()));
        if (parameterListContext.formalparameterlist().isEmpty()) return parameters;
        parameters.addAll(convertToParameters(parameterListContext.formalparameterlist()));
        return parameters;
    }

    private static Parameter convertToParameter(Compiler_grammarParser.FormalparameterContext parameterContext) {
        return new Parameter(getType(parameterContext.type()),parameterContext.IDENTIFIER().getText());
    }

    private static Field convertToField(Compiler_grammarParser.FielddeclarationContext fieldcontext) {
        //@TODO implement

        Type type = getType(fieldcontext.type());



        Access access = Access.PUBLIC;
        if(fieldcontext.accessmodifier() != null){
            String modifier = fieldcontext.accessmodifier().getText().toUpperCase();
            access = Access.valueOf(modifier);
        }

        return  null;
    }

    private static Access getForAccessModifier(Compiler_grammarParser.AccessmodifierContext acc) {
        return switch (acc.getText()) {
            case "private" -> Access.PRIVATE;
            case "protected" -> Access.PROTECTED;
            case "public" -> Access.PUBLIC;
            default -> Access.PUBLIC;
        };
    }

    private static Type getType (Compiler_grammarParser.TypeContext typeContext){
        if(typeContext.primitivetype() != null){
            if(typeContext.primitivetype().INT() != null){
                return new Type("int");
            } else if (typeContext.primitivetype().CHAR() != null){
                return new Type("char");
            } else if(typeContext.primitivetype() != null){
                return new Type("java.lang.String");
            }
        } else if(typeContext.abstracttype() != null){
            if(typeContext.abstracttype().name() != null){
                return new Type(typeContext.abstracttype().name().getText());
            } else if(typeContext.abstracttype().STRING() != null){
                return new Type("java.lang.String");
            }
        }
        return new Type("");
    }
}
