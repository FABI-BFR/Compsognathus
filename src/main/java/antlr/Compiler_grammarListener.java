// Generated from C:/Users/Tobias Hahn/IdeaProjects/Compsognathus/src/main/java/antlr\Compiler_grammar.g4 by ANTLR 4.12.0
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
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#classbodydeclarations}.
	 * @param ctx the parse tree
	 */
	void enterClassbodydeclarations(Compiler_grammarParser.ClassbodydeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#classbodydeclarations}.
	 * @param ctx the parse tree
	 */
	void exitClassbodydeclarations(Compiler_grammarParser.ClassbodydeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#classbodydeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassbodydeclaration(Compiler_grammarParser.ClassbodydeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#classbodydeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassbodydeclaration(Compiler_grammarParser.ClassbodydeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#constructordeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructordeclaration(Compiler_grammarParser.ConstructordeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#constructordeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructordeclaration(Compiler_grammarParser.ConstructordeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#constructordeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructordeclarator(Compiler_grammarParser.ConstructordeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#constructordeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructordeclarator(Compiler_grammarParser.ConstructordeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#constructorbody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorbody(Compiler_grammarParser.ConstructorbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#constructorbody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorbody(Compiler_grammarParser.ConstructorbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#explicitconstructorinovacation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitconstructorinovacation(Compiler_grammarParser.ExplicitconstructorinovacationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#explicitconstructorinovacation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitconstructorinovacation(Compiler_grammarParser.ExplicitconstructorinovacationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void enterArgumentlist(Compiler_grammarParser.ArgumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void exitArgumentlist(Compiler_grammarParser.ArgumentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#fielddeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFielddeclaration(Compiler_grammarParser.FielddeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#fielddeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFielddeclaration(Compiler_grammarParser.FielddeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Compiler_grammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Compiler_grammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#primitivetype}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivetype(Compiler_grammarParser.PrimitivetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#primitivetype}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivetype(Compiler_grammarParser.PrimitivetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#abstracttype}.
	 * @param ctx the parse tree
	 */
	void enterAbstracttype(Compiler_grammarParser.AbstracttypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#abstracttype}.
	 * @param ctx the parse tree
	 */
	void exitAbstracttype(Compiler_grammarParser.AbstracttypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(Compiler_grammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(Compiler_grammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#simplename}.
	 * @param ctx the parse tree
	 */
	void enterSimplename(Compiler_grammarParser.SimplenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#simplename}.
	 * @param ctx the parse tree
	 */
	void exitSimplename(Compiler_grammarParser.SimplenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#qualifiedname}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedname(Compiler_grammarParser.QualifiednameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#qualifiedname}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedname(Compiler_grammarParser.QualifiednameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#variabledeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariabledeclarators(Compiler_grammarParser.VariabledeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#variabledeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariabledeclarators(Compiler_grammarParser.VariabledeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#variabledeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariabledeclarator(Compiler_grammarParser.VariabledeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#variabledeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariabledeclarator(Compiler_grammarParser.VariabledeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Compiler_grammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Compiler_grammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#methoddeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethoddeclaration(Compiler_grammarParser.MethoddeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#methoddeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethoddeclaration(Compiler_grammarParser.MethoddeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#methodheader}.
	 * @param ctx the parse tree
	 */
	void enterMethodheader(Compiler_grammarParser.MethodheaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#methodheader}.
	 * @param ctx the parse tree
	 */
	void exitMethodheader(Compiler_grammarParser.MethodheaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#methoddeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethoddeclarator(Compiler_grammarParser.MethoddeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#methoddeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethoddeclarator(Compiler_grammarParser.MethoddeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#formalparameterlist}.
	 * @param ctx the parse tree
	 */
	void enterFormalparameterlist(Compiler_grammarParser.FormalparameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#formalparameterlist}.
	 * @param ctx the parse tree
	 */
	void exitFormalparameterlist(Compiler_grammarParser.FormalparameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#formalparameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalparameter(Compiler_grammarParser.FormalparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#formalparameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalparameter(Compiler_grammarParser.FormalparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#methodbody}.
	 * @param ctx the parse tree
	 */
	void enterMethodbody(Compiler_grammarParser.MethodbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#methodbody}.
	 * @param ctx the parse tree
	 */
	void exitMethodbody(Compiler_grammarParser.MethodbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Compiler_grammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Compiler_grammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#blockstatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockstatements(Compiler_grammarParser.BlockstatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#blockstatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockstatements(Compiler_grammarParser.BlockstatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#blockstatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockstatement(Compiler_grammarParser.BlockstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#blockstatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockstatement(Compiler_grammarParser.BlockstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#localvariabledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalvariabledeclaration(Compiler_grammarParser.LocalvariabledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#localvariabledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalvariabledeclaration(Compiler_grammarParser.LocalvariabledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Compiler_grammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Compiler_grammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(Compiler_grammarParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(Compiler_grammarParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#ifelsestatement}.
	 * @param ctx the parse tree
	 */
	void enterIfelsestatement(Compiler_grammarParser.IfelsestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#ifelsestatement}.
	 * @param ctx the parse tree
	 */
	void exitIfelsestatement(Compiler_grammarParser.IfelsestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatement(Compiler_grammarParser.WhilestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatement(Compiler_grammarParser.WhilestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#compareexpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareexpression(Compiler_grammarParser.CompareexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#compareexpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareexpression(Compiler_grammarParser.CompareexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#expression1}.
	 * @param ctx the parse tree
	 */
	void enterExpression1(Compiler_grammarParser.Expression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#expression1}.
	 * @param ctx the parse tree
	 */
	void exitExpression1(Compiler_grammarParser.Expression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterExpression2(Compiler_grammarParser.Expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitExpression2(Compiler_grammarParser.Expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#compareoperator}.
	 * @param ctx the parse tree
	 */
	void enterCompareoperator(Compiler_grammarParser.CompareoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#compareoperator}.
	 * @param ctx the parse tree
	 */
	void exitCompareoperator(Compiler_grammarParser.CompareoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#logicaloperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicaloperator(Compiler_grammarParser.LogicaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#logicaloperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicaloperator(Compiler_grammarParser.LogicaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#statementwithoutrailingsubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementwithoutrailingsubstatement(Compiler_grammarParser.StatementwithoutrailingsubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#statementwithoutrailingsubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementwithoutrailingsubstatement(Compiler_grammarParser.StatementwithoutrailingsubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#emptystatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptystatement(Compiler_grammarParser.EmptystatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#emptystatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptystatement(Compiler_grammarParser.EmptystatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionstatement(Compiler_grammarParser.ExpressionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionstatement(Compiler_grammarParser.ExpressionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnstatement(Compiler_grammarParser.ReturnstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnstatement(Compiler_grammarParser.ReturnstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#returnexpression}.
	 * @param ctx the parse tree
	 */
	void enterReturnexpression(Compiler_grammarParser.ReturnexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#returnexpression}.
	 * @param ctx the parse tree
	 */
	void exitReturnexpression(Compiler_grammarParser.ReturnexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#statementnoshortif1}.
	 * @param ctx the parse tree
	 */
	void enterStatementnoshortif1(Compiler_grammarParser.Statementnoshortif1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#statementnoshortif1}.
	 * @param ctx the parse tree
	 */
	void exitStatementnoshortif1(Compiler_grammarParser.Statementnoshortif1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#statementnoshortif2}.
	 * @param ctx the parse tree
	 */
	void enterStatementnoshortif2(Compiler_grammarParser.Statementnoshortif2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#statementnoshortif2}.
	 * @param ctx the parse tree
	 */
	void exitStatementnoshortif2(Compiler_grammarParser.Statementnoshortif2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#statementnoshortif}.
	 * @param ctx the parse tree
	 */
	void enterStatementnoshortif(Compiler_grammarParser.StatementnoshortifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#statementnoshortif}.
	 * @param ctx the parse tree
	 */
	void exitStatementnoshortif(Compiler_grammarParser.StatementnoshortifContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#ifelsestatementnoshortif}.
	 * @param ctx the parse tree
	 */
	void enterIfelsestatementnoshortif(Compiler_grammarParser.IfelsestatementnoshortifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#ifelsestatementnoshortif}.
	 * @param ctx the parse tree
	 */
	void exitIfelsestatementnoshortif(Compiler_grammarParser.IfelsestatementnoshortifContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#whilestatementnoshortif}.
	 * @param ctx the parse tree
	 */
	void enterWhilestatementnoshortif(Compiler_grammarParser.WhilestatementnoshortifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#whilestatementnoshortif}.
	 * @param ctx the parse tree
	 */
	void exitWhilestatementnoshortif(Compiler_grammarParser.WhilestatementnoshortifContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#statementexpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementexpression(Compiler_grammarParser.StatementexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#statementexpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementexpression(Compiler_grammarParser.StatementexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Compiler_grammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Compiler_grammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentexpression(Compiler_grammarParser.AssignmentexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentexpression(Compiler_grammarParser.AssignmentexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#preincrementexpression}.
	 * @param ctx the parse tree
	 */
	void enterPreincrementexpression(Compiler_grammarParser.PreincrementexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#preincrementexpression}.
	 * @param ctx the parse tree
	 */
	void exitPreincrementexpression(Compiler_grammarParser.PreincrementexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#predecrementexpression}.
	 * @param ctx the parse tree
	 */
	void enterPredecrementexpression(Compiler_grammarParser.PredecrementexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#predecrementexpression}.
	 * @param ctx the parse tree
	 */
	void exitPredecrementexpression(Compiler_grammarParser.PredecrementexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#postincrementexpression}.
	 * @param ctx the parse tree
	 */
	void enterPostincrementexpression(Compiler_grammarParser.PostincrementexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#postincrementexpression}.
	 * @param ctx the parse tree
	 */
	void exitPostincrementexpression(Compiler_grammarParser.PostincrementexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#postdecrementexpression}.
	 * @param ctx the parse tree
	 */
	void enterPostdecrementexpression(Compiler_grammarParser.PostdecrementexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#postdecrementexpression}.
	 * @param ctx the parse tree
	 */
	void exitPostdecrementexpression(Compiler_grammarParser.PostdecrementexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#methodcallexpression}.
	 * @param ctx the parse tree
	 */
	void enterMethodcallexpression(Compiler_grammarParser.MethodcallexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#methodcallexpression}.
	 * @param ctx the parse tree
	 */
	void exitMethodcallexpression(Compiler_grammarParser.MethodcallexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#newexpression}.
	 * @param ctx the parse tree
	 */
	void enterNewexpression(Compiler_grammarParser.NewexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#newexpression}.
	 * @param ctx the parse tree
	 */
	void exitNewexpression(Compiler_grammarParser.NewexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Compiler_grammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Compiler_grammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Compiler_grammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Compiler_grammarParser.LiteralContext ctx);
}