package control;

import antlr.AntlrParser;
import antlr.Compiler_grammarParser;
import bytecode.ByteCodeGenerator;
import bytecode.ClassFile;
import parseTreeConverter.Converter;
import semantikCheck.Program;
import semantikCheck.checker.Checker;

import javax.xml.validation.SchemaFactoryConfigurationError;
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
                    Checker checker =  new Checker();
                    generatedProgram = checker.check(generatedProgram);
                    var errors = checker.getErrors();
                    if(errors != null && errors.size() > 0) {
                        for (String error : errors ) {
                            System.out.println(error);
                        }
                        System.err.println("Failed to compile" + arg);
                        System.out.println("Fehler beim Typcheck.");
                        return;
                    }


                    // Bytecode generation
                    List<ClassFile> myClassFiles = generateBytecode(generatedProgram);


                    // Saving class files
                    String direcotry = "src/main/test/compiledClasses/";
                    for(ClassFile classFile: myClassFiles){
                        File tmpFile = new File(direcotry + classFile.getFileName());
                        storeDataInFile(tmpFile, classFile.getBytecode());
                    }

                } else {
                    System.out.println("Ungueltige Java Klasse: " + arg);
                    return;
                }
        }
        } else {
            System.out.println("Die Parameteruebergabe sind ungueltig.");
            return;
        }
    }

    public static Compiler_grammarParser.CompilationunitContext parse(String fileLink){
        AntlrParser parser = new AntlrParser();
        //File file = new File("C:/Users/Fabian/Desktop/Compsognathus/src/main/test/exampleClasses/emptyClass/EmptyClass.java");
        File file = new File(fileLink);
        return parser.parse(new File(file.getAbsolutePath()));
    }

    public static List<ClassFile>generateBytecode(Program generatedProgram){
        ByteCodeGenerator generator = new ByteCodeGenerator();
        return generator.generate(generatedProgram);
    }

    private static void storeDataInFile(File myClassFile, byte[] contentInBytes) {
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
            ex.printStackTrace();
        }
    }
}
