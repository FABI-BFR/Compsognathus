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
                AntlrParser parser = new AntlrParser();
                //File file = new File("C:/Users/Fabian/Desktop/Compsognathus/src/main/test/exampleClasses/emptyClass/EmptyClass.java");
                File file = new File(arg);
                Compiler_grammarParser.CompilationunitContext parseTree =
                        parser.parse(new File(file.getAbsolutePath()));

                if (parseTree.exception != null) {
                    System.out.println("Das Java-File konnte nicht geparsed werden");
                    return;
                }

                // Converter
                Program generatedProgram = Converter.convertToProgram(parseTree);

                // Semantic check


                // Bytecode generation
                ByteCodeGenerator generator = new ByteCodeGenerator();
                List<ClassFile> myClassFiles = generator.generate(generatedProgram);

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


    private static void storeDataInFile(File myClassFile, byte[] contentInBytes)
    {
        FileOutputStream fop = null;
        try {
            fop = new FileOutputStream(myClassFile);

            // if file doesnt exists, then create it
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
