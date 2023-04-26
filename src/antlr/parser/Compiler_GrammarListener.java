// Generated from java-escape by ANTLR 4.11.1
package antlr/parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Compiler_GrammarParser}.
 */
public interface Compiler_GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#compilationunit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationunit(Compiler_GrammarParser.CompilationunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#compilationunit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationunit(Compiler_GrammarParser.CompilationunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#classdeclarations}.
	 * @param ctx the parse tree
	 */
	void enterClassdeclarations(Compiler_GrammarParser.ClassdeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#classdeclarations}.
	 * @param ctx the parse tree
	 */
	void exitClassdeclarations(Compiler_GrammarParser.ClassdeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#classdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassdeclaration(Compiler_GrammarParser.ClassdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#classdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassdeclaration(Compiler_GrammarParser.ClassdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#accessmodifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessmodifier(Compiler_GrammarParser.AccessmodifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#accessmodifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessmodifier(Compiler_GrammarParser.AccessmodifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#classbody}.
	 * @param ctx the parse tree
	 */
	void enterClassbody(Compiler_GrammarParser.ClassbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#classbody}.
	 * @param ctx the parse tree
	 */
	void exitClassbody(Compiler_GrammarParser.ClassbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(Compiler_GrammarParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(Compiler_GrammarParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#classbodydeclarations}.
	 * @param ctx the parse tree
	 */
	void enterClassbodydeclarations(Compiler_GrammarParser.ClassbodydeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#classbodydeclarations}.
	 * @param ctx the parse tree
	 */
	void exitClassbodydeclarations(Compiler_GrammarParser.ClassbodydeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#classbodydeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassbodydeclaration(Compiler_GrammarParser.ClassbodydeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#classbodydeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassbodydeclaration(Compiler_GrammarParser.ClassbodydeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#fielddeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFielddeclaration(Compiler_GrammarParser.FielddeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#fielddeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFielddeclaration(Compiler_GrammarParser.FielddeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Compiler_GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Compiler_GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#primitivetype}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivetype(Compiler_GrammarParser.PrimitivetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#primitivetype}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivetype(Compiler_GrammarParser.PrimitivetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#referencetype}.
	 * @param ctx the parse tree
	 */
	void enterReferencetype(Compiler_GrammarParser.ReferencetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#referencetype}.
	 * @param ctx the parse tree
	 */
	void exitReferencetype(Compiler_GrammarParser.ReferencetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(Compiler_GrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(Compiler_GrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#qualifiedname}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedname(Compiler_GrammarParser.QualifiednameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#qualifiedname}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedname(Compiler_GrammarParser.QualifiednameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#simplename}.
	 * @param ctx the parse tree
	 */
	void enterSimplename(Compiler_GrammarParser.SimplenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#simplename}.
	 * @param ctx the parse tree
	 */
	void exitSimplename(Compiler_GrammarParser.SimplenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#variabledeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariabledeclarators(Compiler_GrammarParser.VariabledeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#variabledeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariabledeclarators(Compiler_GrammarParser.VariabledeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#variabledeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariabledeclarator(Compiler_GrammarParser.VariabledeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#variabledeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariabledeclarator(Compiler_GrammarParser.VariabledeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#variabledeclaratorid}.
	 * @param ctx the parse tree
	 */
	void enterVariabledeclaratorid(Compiler_GrammarParser.VariabledeclaratoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#variabledeclaratorid}.
	 * @param ctx the parse tree
	 */
	void exitVariabledeclaratorid(Compiler_GrammarParser.VariabledeclaratoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#variableinitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableinitializer(Compiler_GrammarParser.VariableinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#variableinitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableinitializer(Compiler_GrammarParser.VariableinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Compiler_GrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Compiler_GrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentexpression(Compiler_GrammarParser.AssignmentexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentexpression(Compiler_GrammarParser.AssignmentexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Compiler_GrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Compiler_GrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#lefthandside}.
	 * @param ctx the parse tree
	 */
	void enterLefthandside(Compiler_GrammarParser.LefthandsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#lefthandside}.
	 * @param ctx the parse tree
	 */
	void exitLefthandside(Compiler_GrammarParser.LefthandsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentoperator(Compiler_GrammarParser.AssignmentoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentoperator(Compiler_GrammarParser.AssignmentoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#conditionalorexpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalorexpression(Compiler_GrammarParser.ConditionalorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#conditionalorexpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalorexpression(Compiler_GrammarParser.ConditionalorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#conditionalandexpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalandexpression(Compiler_GrammarParser.ConditionalandexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#conditionalandexpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalandexpression(Compiler_GrammarParser.ConditionalandexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#constructordeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructordeclaration(Compiler_GrammarParser.ConstructordeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#constructordeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructordeclaration(Compiler_GrammarParser.ConstructordeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#methoddeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethoddeclaration(Compiler_GrammarParser.MethoddeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#methoddeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethoddeclaration(Compiler_GrammarParser.MethoddeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#methodheader}.
	 * @param ctx the parse tree
	 */
	void enterMethodheader(Compiler_GrammarParser.MethodheaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#methodheader}.
	 * @param ctx the parse tree
	 */
	void exitMethodheader(Compiler_GrammarParser.MethodheaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#methodbody}.
	 * @param ctx the parse tree
	 */
	void enterMethodbody(Compiler_GrammarParser.MethodbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#methodbody}.
	 * @param ctx the parse tree
	 */
	void exitMethodbody(Compiler_GrammarParser.MethodbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#methoddeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethoddeclarator(Compiler_GrammarParser.MethoddeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#methoddeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethoddeclarator(Compiler_GrammarParser.MethoddeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#formalparameterlist}.
	 * @param ctx the parse tree
	 */
	void enterFormalparameterlist(Compiler_GrammarParser.FormalparameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#formalparameterlist}.
	 * @param ctx the parse tree
	 */
	void exitFormalparameterlist(Compiler_GrammarParser.FormalparameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#formalparameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalparameter(Compiler_GrammarParser.FormalparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#formalparameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalparameter(Compiler_GrammarParser.FormalparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#constructordeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructordeclarator(Compiler_GrammarParser.ConstructordeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#constructordeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructordeclarator(Compiler_GrammarParser.ConstructordeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#constructorbody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorbody(Compiler_GrammarParser.ConstructorbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#constructorbody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorbody(Compiler_GrammarParser.ConstructorbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void enterArgumentlist(Compiler_GrammarParser.ArgumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void exitArgumentlist(Compiler_GrammarParser.ArgumentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveorexpression(Compiler_GrammarParser.InclusiveorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveorexpression(Compiler_GrammarParser.InclusiveorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveorexpression(Compiler_GrammarParser.ExclusiveorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveorexpression(Compiler_GrammarParser.ExclusiveorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void enterAndexpression(Compiler_GrammarParser.AndexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void exitAndexpression(Compiler_GrammarParser.AndexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityexpression(Compiler_GrammarParser.EqualityexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityexpression(Compiler_GrammarParser.EqualityexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalexpression(Compiler_GrammarParser.RelationalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalexpression(Compiler_GrammarParser.RelationalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationaloperator(Compiler_GrammarParser.RelationaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationaloperator(Compiler_GrammarParser.RelationaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftexpression(Compiler_GrammarParser.ShiftexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftexpression(Compiler_GrammarParser.ShiftexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveexpression(Compiler_GrammarParser.AdditiveexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveexpression(Compiler_GrammarParser.AdditiveexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeexpression(Compiler_GrammarParser.MultiplicativeexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeexpression(Compiler_GrammarParser.MultiplicativeexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpression(Compiler_GrammarParser.UnaryexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpression(Compiler_GrammarParser.UnaryexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#unaryexpressionnotplusminus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpressionnotplusminus(Compiler_GrammarParser.UnaryexpressionnotplusminusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#unaryexpressionnotplusminus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpressionnotplusminus(Compiler_GrammarParser.UnaryexpressionnotplusminusContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(Compiler_GrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(Compiler_GrammarParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#castexpression}.
	 * @param ctx the parse tree
	 */
	void enterCastexpression(Compiler_GrammarParser.CastexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#castexpression}.
	 * @param ctx the parse tree
	 */
	void exitCastexpression(Compiler_GrammarParser.CastexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Compiler_GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Compiler_GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#blockstatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockstatements(Compiler_GrammarParser.BlockstatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#blockstatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockstatements(Compiler_GrammarParser.BlockstatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#localvariabledeclarationstatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalvariabledeclarationstatement(Compiler_GrammarParser.LocalvariabledeclarationstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#localvariabledeclarationstatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalvariabledeclarationstatement(Compiler_GrammarParser.LocalvariabledeclarationstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Compiler_GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Compiler_GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#statementwithouttrailingsubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementwithouttrailingsubstatement(Compiler_GrammarParser.StatementwithouttrailingsubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#statementwithouttrailingsubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementwithouttrailingsubstatement(Compiler_GrammarParser.StatementwithouttrailingsubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionstatement(Compiler_GrammarParser.ExpressionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionstatement(Compiler_GrammarParser.ExpressionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#statementexpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementexpression(Compiler_GrammarParser.StatementexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#statementexpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementexpression(Compiler_GrammarParser.StatementexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#methodinvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodinvocation(Compiler_GrammarParser.MethodinvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#methodinvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodinvocation(Compiler_GrammarParser.MethodinvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#classinstancecreationexpression}.
	 * @param ctx the parse tree
	 */
	void enterClassinstancecreationexpression(Compiler_GrammarParser.ClassinstancecreationexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#classinstancecreationexpression}.
	 * @param ctx the parse tree
	 */
	void exitClassinstancecreationexpression(Compiler_GrammarParser.ClassinstancecreationexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#classtype}.
	 * @param ctx the parse tree
	 */
	void enterClasstype(Compiler_GrammarParser.ClasstypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#classtype}.
	 * @param ctx the parse tree
	 */
	void exitClasstype(Compiler_GrammarParser.ClasstypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnstatement(Compiler_GrammarParser.ReturnstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnstatement(Compiler_GrammarParser.ReturnstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Compiler_GrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Compiler_GrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#ifthenstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfthenstatement(Compiler_GrammarParser.IfthenstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#ifthenstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfthenstatement(Compiler_GrammarParser.IfthenstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#ifthenelsestatement}.
	 * @param ctx the parse tree
	 */
	void enterIfthenelsestatement(Compiler_GrammarParser.IfthenelsestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#ifthenelsestatement}.
	 * @param ctx the parse tree
	 */
	void exitIfthenelsestatement(Compiler_GrammarParser.IfthenelsestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatement(Compiler_GrammarParser.WhilestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatement(Compiler_GrammarParser.WhilestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#statementnoshortif}.
	 * @param ctx the parse tree
	 */
	void enterStatementnoshortif(Compiler_GrammarParser.StatementnoshortifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#statementnoshortif}.
	 * @param ctx the parse tree
	 */
	void exitStatementnoshortif(Compiler_GrammarParser.StatementnoshortifContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#ifthenelsestatementnoshortif}.
	 * @param ctx the parse tree
	 */
	void enterIfthenelsestatementnoshortif(Compiler_GrammarParser.IfthenelsestatementnoshortifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#ifthenelsestatementnoshortif}.
	 * @param ctx the parse tree
	 */
	void exitIfthenelsestatementnoshortif(Compiler_GrammarParser.IfthenelsestatementnoshortifContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_GrammarParser#whilestatementnoshortif}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatementnoshortif(Compiler_GrammarParser.WhilestatementnoshortifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_GrammarParser#whilestatementnoshortif}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatementnoshortif(Compiler_GrammarParser.WhilestatementnoshortifContext ctx);
}