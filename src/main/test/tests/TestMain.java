import antlr.Compiler_grammarLexer;
import antlr.Compiler_grammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parseTreeConverter.Converter;
import semantikCheck.Program;

import java.io.IOException;

public class TestMain {
    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromFileName("src/main/test/exampleClasses/OneMethod/MultipleParameters/MethodIntBoolParameter.java");
        Compiler_grammarLexer lexer = new Compiler_grammarLexer(input);
        CommonTokenStream token = new CommonTokenStream(lexer);
        String tokens = token.toString();
        Compiler_grammarParser parser = new Compiler_grammarParser(token);
        Compiler_grammarParser.CompilationunitContext tree = parser.compilationunit();
        Program pg = Converter.convertToProgram(tree);
    }
}
