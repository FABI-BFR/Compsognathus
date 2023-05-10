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
                            } else{
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

        List<Parameter> parameters = new ArrayList<>();

        Block body = null;//@TODO nicht nullen, und parameter checken

        return new Method(new Type(header.type().getText()), header.methoddeclarator().IDENTIFIER().getText(), parameters, body);
    }

    private static Field convertToField(Compiler_grammarParser.FielddeclarationContext fieldcontext) {
        //@TODO implement

        Type type = null;
        type.setType(getType(fieldcontext.type()));



        Access access = Access.PUBLIC;
        if(fieldcontext.accessmodifier() != null){
            String modifier = fieldcontext.accessmodifier().getText().toUpperCase();
            access = Access.valueOf(modifier);
        }

        return  null;
    }

    private static Access getForAccessModifier(Compiler_grammarParser.AccessmodifierContext acc) {
        return switch (acc.getText())
                {
                    case "private" -> Access.PRIVATE;
                    case "protected" -> Access.PROTECTED;
                    case "public" -> Access.PUBLIC;
                    default -> Access.PUBLIC;
                };
    }

    private static String getType (Compiler_grammarParser.TypeContext typeContext){
        if(typeContext.primitivetype() != null){
            if(typeContext.primitivetype().INT() != null){
                return "int";
            } else if (typeContext.primitivetype().CHAR() != null){
                return "char";
            } else if(typeContext.primitivetype() != null){
                return "java.lang.String";
            }
        }
        return "";
    }
}
