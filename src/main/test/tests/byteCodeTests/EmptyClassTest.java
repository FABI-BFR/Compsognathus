package byteCodeTests;

import control.CompsognathusCompiler;
import jsonConverter.JsonConverter;
import org.junit.Test;
import org.junit.Assert;
import parseTreeConverter.Converter;
import semantikCheck.Access;
import semantikCheck.Class;
import semantikCheck.Program;

import java.util.ArrayList;
import java.util.List;


public class EmptyClassTest {
    @Test
    public void testEmptyClass(){
        List<Class> classes = new ArrayList<>();
        classes.add(new Class("EmptyClass",null,null, null,Access.PUBLIC));
        Program shouldbeAST = new Program(classes);
        Program actual = Converter.convertToProgram(CompsognathusCompiler.parse("src/main/test/exampleClasses/emptyClass/EmptyClass.java"));
        Assert.assertEquals(JsonConverter.convertToJson(shouldbeAST),JsonConverter.convertToJson(actual));
    }
}
