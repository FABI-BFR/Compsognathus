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
        //if (args != null && args.length >= 1) {
           // for (String arg : args) {
                //if (arg.endsWith(".java")) {



                    // Parser
                    AntlrParser parser = new AntlrParser();
                    File file = new File("C:\\Users\\ENTE138\\Documents\\CompsognathusCompiler\\src\\main\\test\\exampleClasses\\emptyClass\\EmptyClass.java");
                    Compiler_grammarParser.CompilationunitContext parseTree =
                            parser.parse(new File(file.getAbsolutePath()));

                    if (parseTree.exception != null) {
                        System.out.println("Das Java-File konnte nicht geparsed werden");
                        return;
                    }


                    // Converter
                    Converter converter = new Converter();
                    Program generatedProgram = converter.convertToProgram(parseTree);

                    // Semantic check


                    // Bytecode generation
                    ByteCodeGenerator generator = new ByteCodeGenerator();
                    List<ClassFile> myClassFiles = generator.generate(generatedProgram);

                    // Saving class files
                    String direcotry = "C:\\Users\\ENTE138\\Documents\\CompsognathusCompiler";
                    for(ClassFile classFile: myClassFiles){
                        File tmpFile = new File(direcotry + classFile.getFileName());
                        storeDataInFile(tmpFile, classFile.getBytecode());
                    }



                //} else {
               //     System.out.println("Ungültige Java Klasse: " + arg);
             //       return;
           //     }
         //   }
       // } else {
           // System.out.println("Die Parameterübergabe ist ungültig.");
         //   return;
       // }
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
