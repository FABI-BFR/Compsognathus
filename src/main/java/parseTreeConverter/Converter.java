package parseTreeConverter;

import antlr.Compiler_grammarParser;
import semantikCheck.*;
import semantikCheck.Class;

import java.util.ArrayList;

import java.util.List;

public class Converter
{
    public static Program convertToProgram(Compiler_grammarParser.CompilationunitContext parseTree){
        return new Program(convertToClassList(parseTree.classdeclarations()));
    }
    public static List<Class> convertToClassList(Compiler_grammarParser.ClassdeclarationsContext parseClasses){
        List<Class> classes = new ArrayList<>();
        for(Compiler_grammarParser.ClassdeclarationContext context : parseClasses.classdeclaration()){
            classes.add(convertToClass(context));
        }
        return classes;
    }
    public static Class convertToClass(Compiler_grammarParser.ClassdeclarationContext classContext){
        List<Method> methods = new ArrayList<>();
        List<Field> fields = new ArrayList<>();
        if(classContext.accessmodifier().isEmpty()){
            return new Class(classContext.CLASSIDENTIFIER().getText(),
                    fields,
                    methods);
        }else{
            Access ac = Access.PUBLIC;
            switch (classContext.accessmodifier().getText()){
                case "private": ac = Access.PRIVATE;
                break;
                case "protected":ac = Access.PROTECTED;
                break;
                case "public":ac = Access.PUBLIC;
            }
            return new Class(classContext.CLASSIDENTIFIER().getText(),
                    fields,
                    methods,
                    ac);
        }
    }
}
