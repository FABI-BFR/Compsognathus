package parseTreeConverter;

import antlr.Compiler_grammarParser;
import semantikCheck.*;
import semantikCheck.Class;
import semantikCheck.interfaces.IStmt;
import semantikCheck.stmt.Block;
import semantikCheck.stmt.LocalVarDecl;

import java.util.ArrayList;

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
                            } else {
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
                    fields,
                    methods);
        } else {
            return new Class(classContext.CLASSIDENTIFIER().getText(),
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
        return null;
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
                    stmts.add(convertToLocalVarDecl(blockstatementContext));
                }
            }
        );
        return new Block(stmts);
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
