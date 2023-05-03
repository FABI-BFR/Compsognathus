package antlr;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.File;
import java.io.IOException;

public class AntlrParser
{
    public Compiler_grammarParser.CompilationunitContext parse(File file) {
        Compiler_grammarParser.CompilationunitContext tree = null;
        boolean isFailed = false;
        try {
            ANTLRFileStream input = new ANTLRFileStream(file.getAbsolutePath());
            Compiler_grammarLexer lexer = new Compiler_grammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Compiler_grammarParser parser = new Compiler_grammarParser(tokens);
            tree = parser.compilationunit();

        } catch (IOException e) {
            isFailed = true;
            throw new ParseCancellationException(e.getMessage());
        }
        return isFailed ? null: tree;
    }
}
