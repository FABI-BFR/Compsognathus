import semantikCheck.Program;
import semantikCheck.checker.Checker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestInitializer {
    TestHelper th = new TestHelper();
    String pathToFolder = "src/main/test/files/";
    public void initialize(){
        String inputPath = "input";
        String untypedPath = "untyped";
        String typedPath = "typed";
        Checker checker = new Checker();
        for(File f : th.listFilesInFolder(pathToFolder+inputPath)){
            Program p = th.convertFileToProgram(f);
            writeFile(f,p.toString(""),inputPath,untypedPath);
            checker.check(p);
            checker.getErrors().forEach(System.out::println);
            writeFile(f,p.toString(""),inputPath,typedPath);
        }
    }
    public void writeFile(File file, String generatedFile,String inputFolder,String targetFolder) {
        String newPath = file.getPath().replace(inputFolder, targetFolder);
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
}
