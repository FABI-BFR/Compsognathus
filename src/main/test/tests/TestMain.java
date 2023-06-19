

import antlr.Compiler_grammarLexer;
import antlr.Compiler_grammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parseTreeConverter.Converter;
import semantikCheck.Program;
import semantikCheck.checker.Checker;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) throws IOException {

        /*CharStream input = CharStreams.fromFileName("src/main/test/exampleClasses/OneMethod/OneParameters/MethodWithBoolParameter.java");
        Compiler_grammarLexer lexer = new Compiler_grammarLexer(input);
        CommonTokenStream token = new CommonTokenStream(lexer);
        String tokens = token.toString();
        Compiler_grammarParser parser = new Compiler_grammarParser(token);
        Compiler_grammarParser.CompilationunitContext tree = parser.compilationunit();
        Program pg = Converter.convertToProgram(tree);*/

        String folderpath = "src/main/test/exampleClasses";
        List<File> fileList = listFilesInFolder(folderpath);
        //List<File> fileList = new ArrayList<>();
        //fileList.add(new File("src/main/test/exampleClasses/newClass.java"));
        Compiler_grammarLexer lexer;
        CommonTokenStream token;
        Compiler_grammarParser parser;
        Program pg;
        Checker checker = new Checker();
        Compiler_grammarParser.CompilationunitContext tree;
        for (File file : fileList) {
            lexer = new Compiler_grammarLexer(CharStreams.fromFileName(file.getPath()));
            token = new CommonTokenStream(lexer);
            parser = new Compiler_grammarParser(token);
            tree = parser.compilationunit();
            pg = Converter.convertToProgram(tree);
            //pg.toString("\t");
            //pg = checker.check(pg);
            //writeFile(file,tests.JsonConverter.convertToJson(pg));
            writeFile(file,pg.toString(""));

        }
        var errors = checker.getErrors();
        if(errors != null && errors.size() > 0) {
            for (String error : errors ) {
                System.out.println(error);
            }
            return;
        }
    }

    public static void writeFile(File file, String generatedFile) {
        String newPath = file.getPath().replace("exampleClasses", "generatedString");
        newPath = newPath.replace(".java",".txt");
        File newFile = new File(newPath);
        String directory = newFile.getParentFile().getPath();
        FileWriter writer;
        try {
            Files.createDirectories(Paths.get(directory));
            newFile.createNewFile();
            writer = new FileWriter(newFile);
            writer.write(generatedFile);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<File> listFilesInFolder(String folderPath) {
        List<File> fileList = new ArrayList<>();
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fileList.add(file);
                } else if (file.isDirectory()) {
                    fileList.addAll(listFilesInFolder(folderPath + "/" + file.getName()));
                }
            }
        }
        return fileList;
    }
}
