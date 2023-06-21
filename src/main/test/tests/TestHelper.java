import antlr.Compiler_grammarLexer;
import antlr.Compiler_grammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parseTreeConverter.Converter;
import semantikCheck.Program;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestHelper {
    public Program convertFileToProgram(File f){
        try {
            return Converter.convertToProgram(new Compiler_grammarParser(
                    new CommonTokenStream(
                            new Compiler_grammarLexer(CharStreams.fromFileName(f.getPath()))
                    )
            ).compilationunit());
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public List<File> listFilesInFolder(String folderPath) {
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
    public String getFileContent(File f, String original, String replacement){
        String newPath = f.getPath().replace(original, replacement);
        newPath = newPath.replace(".java",".txt");
        File newFile = new File(newPath);
        return getFileContent(newFile);
    }
    public String getFileContent(File f){
        try{
            return CharStreams.fromFileName(f.getPath()).toString();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
