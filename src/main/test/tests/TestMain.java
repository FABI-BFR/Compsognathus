
import bytecode.ByteCodeGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import semantikCheck.Program;
import semantikCheck.checker.Checker;

import java.io.File;
import java.util.List;
@RunWith(Parameterized.class)
public class TestMain {

//    public static void main(String[] args){
//        TestInitializer ti = new TestInitializer();
//        ti.initialize();
//    }
    @Parameterized.Parameters
    public static List<File> data(){
        return new TestHelper().listFilesInFolder("src/main/test/files/input");
    }
    private File file;
    public TestMain(File f){
        this.file = f;
    }

    @Test
    public void testFile(){
        TestHelper th = new TestHelper();
        Program pg = th.convertFileToProgram(file);
        Assert.assertEquals(th.getFileContent(file,"input","untyped"),pg.toString(""));
        Checker checker = new Checker();
        checker.check(pg);
        Assert.assertTrue(checker.getErrors().isEmpty());
        Assert.assertEquals(th.getFileContent(file,"input","typed"),pg.toString(""));
        tryByteCode(pg);
    }
    public void tryByteCode(Program pg){
        try {
            ByteCodeGenerator bcg = new ByteCodeGenerator();
            bcg.generate(pg);
        }catch (Exception e){
            Assert.fail("This file couldn't be compiled into Bytecode and has thrown the error: \n"+e.getMessage());
        }
    }
}
