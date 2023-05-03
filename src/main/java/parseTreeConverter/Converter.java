package parseTreeConverter;

import antlr.Compiler_grammarParser;
import semantikCheck.Class;
import semantikCheck.Program;

import java.util.ArrayList;

import java.util.List;

public class Converter
{
    public Program convert(Compiler_grammarParser.CompilationunitContext parseTree)
    {
        Compiler_grammarParser.ClassdeclarationsContext tmp = parseTree.classdeclarations();
        List<Class> classes = new ArrayList<>();

        Program program = new Program(classes);


        return program;
    }

    public Program convertToProgram(Compiler_grammarParser.CompilationunitContext parseTree){
        return new Program(convertToClassList(parseTree.classdeclarations()));
    }
    public List<Class> convertToClassList(Compiler_grammarParser.ClassdeclarationsContext parseClasses){
        List<Class> classes = new ArrayList<>();
        for(Compiler_grammarParser.ClassdeclarationContext context : parseClasses.classdeclaration()){
            classes.add(convertToClass(context));
        }
        return classes;
    }
    public Class convertToClass(Compiler_grammarParser.ClassdeclarationContext classContext){
        return new Class();
    }


}
