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
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#classbodydeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassbodydeclarations(Compiler_grammarParser.ClassbodydeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#classbodydeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassbodydeclaration(Compiler_grammarParser.ClassbodydeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#constructordeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructordeclaration(Compiler_grammarParser.ConstructordeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#constructordeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructordeclarator(Compiler_grammarParser.ConstructordeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#constructorbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorbody(Compiler_grammarParser.ConstructorbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#explicitconstructorinovacation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitconstructorinovacation(Compiler_grammarParser.ExplicitconstructorinovacationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#argumentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentlist(Compiler_grammarParser.ArgumentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#fielddeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFielddeclaration(Compiler_grammarParser.FielddeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Compiler_grammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#primitivetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivetype(Compiler_grammarParser.PrimitivetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#abstracttype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstracttype(Compiler_grammarParser.AbstracttypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#referencetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencetype(Compiler_grammarParser.ReferencetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#classorinterfacetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassorinterfacetype(Compiler_grammarParser.ClassorinterfacetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(Compiler_grammarParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#simplename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplename(Compiler_grammarParser.SimplenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#variabledeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledeclarators(Compiler_grammarParser.VariabledeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#variabledeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledeclarator(Compiler_grammarParser.VariabledeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Compiler_grammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#methoddeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethoddeclaration(Compiler_grammarParser.MethoddeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#methodheader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodheader(Compiler_grammarParser.MethodheaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#methoddeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethoddeclarator(Compiler_grammarParser.MethoddeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#methodbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodbody(Compiler_grammarParser.MethodbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Compiler_grammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#blockstatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockstatements(Compiler_grammarParser.BlockstatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#blockstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockstatement(Compiler_grammarParser.BlockstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#localvariabledeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalvariabledeclaration(Compiler_grammarParser.LocalvariabledeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Compiler_grammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(Compiler_grammarParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#ifelsestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelsestatement(Compiler_grammarParser.IfelsestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#whilestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestatement(Compiler_grammarParser.WhilestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#compareexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareexpression(Compiler_grammarParser.CompareexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#compareoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareoperator(Compiler_grammarParser.CompareoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#statementwithoutrailingsubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementwithoutrailingsubstatement(Compiler_grammarParser.StatementwithoutrailingsubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#emptystatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptystatement(Compiler_grammarParser.EmptystatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#expressionstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionstatement(Compiler_grammarParser.ExpressionstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#returnstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstatement(Compiler_grammarParser.ReturnstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#statementnoshortif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementnoshortif(Compiler_grammarParser.StatementnoshortifContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#ifelsestatementnoshortif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelsestatementnoshortif(Compiler_grammarParser.IfelsestatementnoshortifContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#whilestatementnoshortif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestatementnoshortif(Compiler_grammarParser.WhilestatementnoshortifContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#statementexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementexpression(Compiler_grammarParser.StatementexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#lefthandside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLefthandside(Compiler_grammarParser.LefthandsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#assignmentoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentoperator(Compiler_grammarParser.AssignmentoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#preincrementexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreincrementexpression(Compiler_grammarParser.PreincrementexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#predecrementexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredecrementexpression(Compiler_grammarParser.PredecrementexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#postincrementexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostincrementexpression(Compiler_grammarParser.PostincrementexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#postdecrementexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostdecrementexpression(Compiler_grammarParser.PostdecrementexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#methodcallexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodcallexpression(Compiler_grammarParser.MethodcallexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Compiler_grammarParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#fieldaccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldaccess(Compiler_grammarParser.FieldaccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#newexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewexpression(Compiler_grammarParser.NewexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_grammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Compiler_grammarParser.LiteralContext ctx);
}