// Generated from java-escape by ANTLR 4.11.1
package antlr/parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Compiler_GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Compiler_GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#compilationunit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationunit(Compiler_GrammarParser.CompilationunitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#classdeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdeclarations(Compiler_GrammarParser.ClassdeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#classdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdeclaration(Compiler_GrammarParser.ClassdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#accessmodifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessmodifier(Compiler_GrammarParser.AccessmodifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#classbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassbody(Compiler_GrammarParser.ClassbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(Compiler_GrammarParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#classbodydeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassbodydeclarations(Compiler_GrammarParser.ClassbodydeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#classbodydeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassbodydeclaration(Compiler_GrammarParser.ClassbodydeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#fielddeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFielddeclaration(Compiler_GrammarParser.FielddeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Compiler_GrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#primitivetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivetype(Compiler_GrammarParser.PrimitivetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#referencetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencetype(Compiler_GrammarParser.ReferencetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(Compiler_GrammarParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#qualifiedname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedname(Compiler_GrammarParser.QualifiednameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#simplename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplename(Compiler_GrammarParser.SimplenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#variabledeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledeclarators(Compiler_GrammarParser.VariabledeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#variabledeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledeclarator(Compiler_GrammarParser.VariabledeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#variabledeclaratorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledeclaratorid(Compiler_GrammarParser.VariabledeclaratoridContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#variableinitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableinitializer(Compiler_GrammarParser.VariableinitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Compiler_GrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#assignmentexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentexpression(Compiler_GrammarParser.AssignmentexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Compiler_GrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#lefthandside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLefthandside(Compiler_GrammarParser.LefthandsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#assignmentoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentoperator(Compiler_GrammarParser.AssignmentoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#conditionalorexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalorexpression(Compiler_GrammarParser.ConditionalorexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#conditionalandexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalandexpression(Compiler_GrammarParser.ConditionalandexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#constructordeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructordeclaration(Compiler_GrammarParser.ConstructordeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#methoddeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethoddeclaration(Compiler_GrammarParser.MethoddeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#methodheader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodheader(Compiler_GrammarParser.MethodheaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#methodbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodbody(Compiler_GrammarParser.MethodbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#methoddeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethoddeclarator(Compiler_GrammarParser.MethoddeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#formalparameterlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalparameterlist(Compiler_GrammarParser.FormalparameterlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#formalparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalparameter(Compiler_GrammarParser.FormalparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#constructordeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructordeclarator(Compiler_GrammarParser.ConstructordeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#constructorbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorbody(Compiler_GrammarParser.ConstructorbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#argumentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentlist(Compiler_GrammarParser.ArgumentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveorexpression(Compiler_GrammarParser.InclusiveorexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveorexpression(Compiler_GrammarParser.ExclusiveorexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#andexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndexpression(Compiler_GrammarParser.AndexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#equalityexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityexpression(Compiler_GrammarParser.EqualityexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#relationalexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalexpression(Compiler_GrammarParser.RelationalexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#relationaloperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationaloperator(Compiler_GrammarParser.RelationaloperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#shiftexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftexpression(Compiler_GrammarParser.ShiftexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#additiveexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveexpression(Compiler_GrammarParser.AdditiveexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeexpression(Compiler_GrammarParser.MultiplicativeexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#unaryexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryexpression(Compiler_GrammarParser.UnaryexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#unaryexpressionnotplusminus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryexpressionnotplusminus(Compiler_GrammarParser.UnaryexpressionnotplusminusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Compiler_GrammarParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#castexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastexpression(Compiler_GrammarParser.CastexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Compiler_GrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#blockstatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockstatements(Compiler_GrammarParser.BlockstatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#localvariabledeclarationstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalvariabledeclarationstatement(Compiler_GrammarParser.LocalvariabledeclarationstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Compiler_GrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#statementwithouttrailingsubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementwithouttrailingsubstatement(Compiler_GrammarParser.StatementwithouttrailingsubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#expressionstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionstatement(Compiler_GrammarParser.ExpressionstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#statementexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementexpression(Compiler_GrammarParser.StatementexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#methodinvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodinvocation(Compiler_GrammarParser.MethodinvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#classinstancecreationexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassinstancecreationexpression(Compiler_GrammarParser.ClassinstancecreationexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#classtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasstype(Compiler_GrammarParser.ClasstypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#returnstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstatement(Compiler_GrammarParser.ReturnstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Compiler_GrammarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#ifthenstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthenstatement(Compiler_GrammarParser.IfthenstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#ifthenelsestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthenelsestatement(Compiler_GrammarParser.IfthenelsestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#whilestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestatement(Compiler_GrammarParser.WhilestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#statementnoshortif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementnoshortif(Compiler_GrammarParser.StatementnoshortifContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#ifthenelsestatementnoshortif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthenelsestatementnoshortif(Compiler_GrammarParser.IfthenelsestatementnoshortifContext ctx);
	/**
	 * Visit a parse tree produced by {@link Compiler_GrammarParser#whilestatementnoshortif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestatementnoshortif(Compiler_GrammarParser.WhilestatementnoshortifContext ctx);
}