import org.junit.Assert;
import org.junit.Test;
import semantikCheck.Program;
import semantikCheck.checker.Checker;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TestMain {

    public static void main(String[] args) throws IOException {
        TestInitializer ti = new TestInitializer();
        ti.initialize();

    }
    @Test
    public void testFiles(){
        TestHelper th = new TestHelper();
        List<File> files = th.listFilesInFolder("src/main/test/files/input");
        Program pg;
        Checker checker = new Checker();
        for(File f : files){
            pg = th.convertFileToProgram(f);
            Assert.assertEquals(th.getFileContent(f,"input","untyped"),pg.toString(""));
            checker.check(pg);
            Assert.assertTrue(checker.getErrors().isEmpty());
            Assert.assertEquals(th.getFileContent(f,"input","typed"),pg.toString(""));
        }
    }
}
