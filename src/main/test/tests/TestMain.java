
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

    @Parameterized.Parameters
    public static List<File> data(){
        return new TestHelper().listFilesInFolder("src/main/test/files/input");
    }
    private File file;
    TestHelper th = new TestHelper();
    public TestMain(File f){
        this.file = f;
    }

    @Test
    public void untyped(){
        Program p = th.convertFileToProgram(file);
        Assert.assertEquals(th.getFileContent(file,"input","untyped"),p.toString(""));
    }
    @Test
    public void typed(){
        Program p = th.convertFileToProgram(file);
        Checker checker = new Checker();
        checker.check(p);
        Assert.assertTrue(checker.getErrors().isEmpty());
        Assert.assertEquals(th.getFileContent(file,"input","typed"),p.toString(""));
    }
    @Test
    public void byteCode(){
        try {
            Program p = th.convertFileToProgram(file);
            Checker checker = new Checker();
            checker.check(p);
            ByteCodeGenerator bcg = new ByteCodeGenerator();
            bcg.generate(p);
        }catch (Exception e){
            Assert.fail("This file couldn't be compiled into Bytecode and has thrown the error: \n"+e.getMessage());
        }
    }
}
