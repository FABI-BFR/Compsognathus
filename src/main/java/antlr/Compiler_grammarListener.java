// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Compiler_grammarParser}.
 */
public interface Compiler_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#compilationunit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationunit(Compiler_grammarParser.CompilationunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#compilationunit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationunit(Compiler_grammarParser.CompilationunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#classdeclarations}.
	 * @param ctx the parse tree
	 */
	void enterClassdeclarations(Compiler_grammarParser.ClassdeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#classdeclarations}.
	 * @param ctx the parse tree
	 */
	void exitClassdeclarations(Compiler_grammarParser.ClassdeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#classdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassdeclaration(Compiler_grammarParser.ClassdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#classdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassdeclaration(Compiler_grammarParser.ClassdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#accessmodifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessmodifier(Compiler_grammarParser.AccessmodifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#accessmodifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessmodifier(Compiler_grammarParser.AccessmodifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#classbody}.
	 * @param ctx the parse tree
	 */
	void enterClassbody(Compiler_grammarParser.ClassbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#classbody}.
	 * @param ctx the parse tree
	 */
	void exitClassbody(Compiler_grammarParser.ClassbodyContext ctx);
}