package control;

import antlr.AntlrParser;
import antlr.Compiler_grammarParser;
import bytecode.ByteCodeGenerator;
import bytecode.ClassFile;
import parseTreeConverter.Converter;
import semantikCheck.Program;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

public class CompsognathusCompiler
{
    public static void main(String[] args)
    {
       if (args != null && args.length >= 1) {
            for (String arg : args) {
            if (arg.endsWith(".java")) {

                // Parser
                Compiler_grammarParser.CompilationunitContext parseTree = parse(arg);
                if (parseTree.exception != null) {
                    System.out.println("Das Java-File konnte nicht geparsed werden");
                    return;
                }
                // Converter
                Program generatedProgram = Converter.convertToProgram(parseTree);
                // Semantic check


                // Bytecode generation
                List<ClassFile> myClassFiles =generateBytecode(generatedProgram);


                // Saving class files
                String direcotry = "src/main/Output/";
                for(ClassFile classFile: myClassFiles){
                    File tmpFile = new File(direcotry + classFile.getFileName());
                    storeDataInFile(tmpFile, classFile.getBytecode());
                }

            } else {
                System.out.println("Ungültige Java Klasse: " + arg);
                return;
            }
        }
        } else {
            System.out.println("Die Parameterübergabe sind ungültig.");
            return;
        }
    }
    public static Compiler_grammarParser.CompilationunitContext parse(String fileLink){
        AntlrParser parser = new AntlrParser();
        //File file = new File("C:/Users/Fabian/Desktop/Compsognathus/src/main/test/exampleClasses/emptyClass/EmptyClass.java");
        File file = new File(fileLink);
        Compiler_grammarParser.CompilationunitContext parseTree =
                parser.parse(new File(file.getAbsolutePath()));
        return parseTree;
    }
    public static List<ClassFile>generateBytecode(Program generatedProgram){
        ByteCodeGenerator generator = new ByteCodeGenerator();
        return generator.generate(generatedProgram);
    }

    private static void storeDataInFile(File myClassFile, byte[] contentInBytes)
    {
        FileOutputStream fop = null;
        try {
            fop = new FileOutputStream(myClassFile);

            // if file doesn't exist, then create it
            if (!myClassFile.exists()) {
                myClassFile.createNewFile();
            }

            fop.write(contentInBytes);
            fop.flush();
            fop.close();
        } catch (Exception ex) {

        }
    }
}
