import bytecode.ByteCodeGenerator;
import bytecode.ClassFile;
import semantikCheck.Program;
import semantikCheck.checker.Checker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TestInitializer {
    TestHelper th = new TestHelper();
    String pathToFolder = "src/main/test/files/";

    public void initialize() {
        String inputPath = "input";
        String untypedPath = "untyped";
        String typedPath = "typed";
        Checker checker = new Checker();
        ByteCodeGenerator bcg = new ByteCodeGenerator();
        int uncompilableFiles = 0;
        for (File f : th.listFilesInFolder(pathToFolder + inputPath)) {
            Program p = th.convertFileToProgram(f);
            writeFile(f, p.toString(""), inputPath, untypedPath);
            checker.check(p);
            checker.getErrors().forEach(System.out::println);
            writeFile(f, p.toString(""), inputPath, typedPath);
            try {
                saveClassFiles(f, bcg.generate(p));
            }catch (Exception e){
                System.out.println("File: " + f.getPath() + " couldn't be compiled into bytecode, as:\n"+
                        e.getMessage() + "\n");
                uncompilableFiles++;
            }
        }
        System.out.println("\n\n"+uncompilableFiles + " files didn't compile.");
    }

    public void writeFile(File file, String generatedFile, String inputFolder, String targetFolder) {
        String newPath = file.getPath().replace(inputFolder, targetFolder);
        newPath = newPath.replace(".java", ".txt");
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

    public void saveClassFiles(File file, List<ClassFile> classFiles) {
        String path = file.getPath().replace("input","bytecode");
        if (classFiles.size() == 1) {
            path = path.replace(".java", ".class");
            writeClassFile(new File(path), classFiles.get(0).getBytecode());
            return;
        }
        path = path.replace(".java", "/");
        for (ClassFile cf: classFiles){
            writeClassFile(new File(path+cf.getFileName()),cf.getBytecode());
        }
    }

    public void writeClassFile(File f, byte[] content) {
        try {
            Files.createDirectories(f.getParentFile().toPath());
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(content);
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
