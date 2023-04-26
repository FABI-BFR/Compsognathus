// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Compiler_grammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Compiler_grammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#compilationunit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationunit(Compiler_grammarParser.CompilationunitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#classdeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdeclarations(Compiler_grammarParser.ClassdeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#classdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdeclaration(Compiler_grammarParser.ClassdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#accessmodifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessmodifier(Compiler_grammarParser.AccessmodifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#classbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassbody(Compiler_grammarParser.ClassbodyContext ctx);
}