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

}
