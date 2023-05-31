package parseTreeConverter;

import antlr.Compiler_grammarParser;
import semantikCheck.*;
import semantikCheck.Class;
import semantikCheck.expr.*;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmt;
import semantikCheck.interfaces.IStmtExpr;
import semantikCheck.stmt.Block;
import semantikCheck.stmt.If;
import semantikCheck.stmt.While;
import semantikCheck.stmtexpr.Assign;
import semantikCheck.stmtexpr.LeftSideExpr;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Converter {
    public static Program convertToProgram(Compiler_grammarParser.CompilationunitContext parseTree) {
        return new Program(convertToClassList(parseTree.classdeclarations()));
    }

    private static List<Class> convertToClassList(Compiler_grammarParser.ClassdeclarationsContext parseClasses) {
        List<Class> classes = new ArrayList<>();
        for (Compiler_grammarParser.ClassdeclarationContext context : parseClasses.classdeclaration()) {
            classes.add(convertToClass(context));
        }
        return classes;
    }

    private static Class convertToClass(Compiler_grammarParser.ClassdeclarationContext classContext) {
        List<Method> methods = new ArrayList<>();
        List<Field> fields = new ArrayList<>();
        List<Constructor> constructors = new ArrayList<>();
        if (!classContext.classbody().isEmpty()) {
            classContext.classbody()
                    .classbodydeclarations()
                    .classbodydeclaration()
                    .forEach(classbodydeclarationContext -> {
                        if (!classbodydeclarationContext.isEmpty()) {
                            if (classbodydeclarationContext.methoddeclaration() != null) {
                                methods.add(convertToMethod(classbodydeclarationContext.methoddeclaration()));
                            } else if (classbodydeclarationContext.fielddeclaration() != null) {
                                fields.addAll(convertToFields(classbodydeclarationContext.fielddeclaration()));
                            } else if(classbodydeclarationContext.constructordeclaration() != null) {
                                constructors.add(convertToConstructor(classbodydeclarationContext.constructordeclaration()));
                            }
                        }
                    });
        }else if(classContext.classbody().isEmpty()){
            return new Class(classContext.CLASSIDENTIFIER().getText(),
                    null,
                    null,
                    null);
        }
        if (constructors.isEmpty()) {
            constructors.add(createDefaultConstructor(classContext.CLASSIDENTIFIER().getText()));
        }
        if (classContext.accessmodifier().isEmpty()) {
            return new Class(classContext.CLASSIDENTIFIER().getText(),
                    constructors,
                    fields,
                    methods);
        } else {
            return new Class(classContext.CLASSIDENTIFIER().getText(),
                    constructors,
                    fields,
                    methods,
                    getForAccessModifier(classContext.accessmodifier()));
        }
    }

    private static Constructor createDefaultConstructor(String _className) {
        Block block = new Block(new ArrayList<>());
        List<Parameter> parameter = new ArrayList<>();

        return new Constructor(_className, parameter, block);
    }

    private static Constructor convertToConstructor(Compiler_grammarParser.ConstructordeclarationContext constructordeclaration) {
        var body = constructordeclaration.constructorbody();
        var head = constructordeclaration.constructordeclarator();
        String name = head.CLASSIDENTIFIER().getText();

        Access access = Access.PUBLIC;
        if(constructordeclaration.accessmodifier() != null){
            access = Access.valueOf(constructordeclaration.accessmodifier().getText().toUpperCase());
        }

        List<Parameter> parameters = getParameter(head.formalparameterlist());

        //Todo Block
        //Block block = getBlock(body.block());
        Block  block = new Block(new ArrayList<>());

        return new Constructor(name,parameters,block,access);
    }

    private static Block getBlock(Compiler_grammarParser.BlockContext blockContext)
    {
        List<IStmt> blockStmts = new ArrayList<>();

        Compiler_grammarParser.BlockstatementsContext stmts = blockContext.blockstatements();
        while(stmts!= null){

        }
        Collections.reverse(blockStmts);
        return new Block(blockStmts);
    }


    private static List<Parameter> getParameter(Compiler_grammarParser.FormalparameterlistContext formalparameterlist)
    {
        List<Parameter> parameters = new ArrayList<>();
        while(formalparameterlist != null){
            var par = formalparameterlist.formalparameter();
            parameters.add(new Parameter(getType(par.type()),par.IDENTIFIER().getText()));
        }
        Collections.reverse(parameters);
        return parameters;
    }

    private static Method convertToMethod(Compiler_grammarParser.MethoddeclarationContext methodcontext) {

        Compiler_grammarParser.MethodheaderContext header = methodcontext.methodheader();

        String methodName = header.methoddeclarator().IDENTIFIER().getText();

        Access ac;
        if (header.accessmodifier().isEmpty()) ac = Access.PUBLIC;
        else ac = getForAccessModifier(header.accessmodifier());


        List<Parameter> parameters = new ArrayList<>();

        if (header.methoddeclarator().formalparameterlist() != null) {
            parameters.addAll(convertToParameters(header.methoddeclarator().formalparameterlist()));
        }
        Block body = new Block(new ArrayList<IStmt>());
        if (methodcontext.methodbody().isEmpty()) {
            body = convertToBlock(methodcontext.methodbody().block());
        }
        if (header.type() == null) {
            return new Method(new Type("void"), methodName, parameters, body, ac);
        }
        return new Method(new Type(header.type().getText()), methodName, parameters, body, ac);
    }

    private static Block convertToBlock(Compiler_grammarParser.BlockContext blockContext) {
        List<IStmt> stmts = new ArrayList<>();
        if (blockContext.blockstatements() == null) return new Block(new ArrayList<IStmt>());
        blockContext.blockstatements().blockstatement().forEach(blockstatementContext -> {
                if(blockstatementContext.localvariabledeclaration() != null){
                    stmts.addAll(convertToLocalVarDecls(blockstatementContext.localvariabledeclaration()));
                }
                if(blockstatementContext.statement() != null){
                    stmts.addAll(convertToStatement(blockstatementContext.statement()));
                }
            }
        );
        return new Block(stmts);
    }

    private static IStmt convertToStatement(Compiler_grammarParser.StatementContext statementContext){
        if(statementContext.ifstatement() != null){
            return convertToIfStatement(statementContext.ifstatement());
        }
        if(statementContext.ifelsestatement() != null){
            return convertToIfElseStatement(statementContext.ifelsestatement());
        }
        if(statementContext.whilestatement() != null){
            return convertToWhileStatement(statementContext.whilestatement());
        }
        else{ //statementwithoutrailingsubstatement

        }

    }

    private static IStmt convertToIfStatement(Compiler_grammarParser.IfstatementContext ifstatementContext){
        return new If(convertToCompareExpression(ifstatementContext.compareexpression()) , convertToStatement(ifstatementContext.statement()) , null);
    }

    private static IStmt convertToIfElseStatement(Compiler_grammarParser.IfelsestatementContext ifelsestatementContext){
        return new If(convertToCompareExpression(ifelsestatementContext.compareexpression()), convertToStatementNoShortIf(ifelsestatementContext.statementnoshortif()), convertToStatement(ifelsestatementContext.statement()));
    }

    private static IStmt convertToWhileStatement(Compiler_grammarParser.WhilestatementContext whilestatementContext){
        return new While(convertToCompareExpression(whilestatementContext.compareexpression()), convertToStatement(whilestatementContext.statement());
    }

    private static IExpr convertToCompareExpression(Compiler_grammarParser.CompareexpressionContext compareexpressionContext){
        if(compareexpressionContext.name() != null){
            if(compareexpressionContext.logicaloperator() != null){

            }else{
                return convertToLocalOrFieldVar(compareexpressionContext.name());
            }
        }
        if(compareexpressionContext.BOOLLITERAL() != null){
            if(compareexpressionContext.logicaloperator() != null){

            }else{

            }
        }
        if(compareexpressionContext.IDENTIFIER() != null){
            if(compareexpressionContext.logicaloperator() != null){

            }else{

            }
        }
        if(compareexpressionContext.name() != null){
            if(compareexpressionContext.logicaloperator() != null){

            }else{

            }
        }
        if(compareexpressionContext.methodcallexpression() != null){
            if(compareexpressionContext.logicaloperator() != null){

            }else{
            }
        }
        else{ //expression
            if(compareexpressionContext.logicaloperator() !=null){

            }else{

            }
        }
    }

    private static List<IStmt> convertToLocalVarDecls(Compiler_grammarParser.LocalvariabledeclarationContext localVarContext) {
        if(localVarContext.variabledeclarators() == null) return new ArrayList<IStmt>();
        Type type = getType(localVarContext.type());
        return convertToLocalVarDecls(localVarContext.variabledeclarators(),type);
    }

    private static List<IStmt> convertToLocalVarDecls(Compiler_grammarParser.VariabledeclaratorsContext variabledeclarators,Type type) {
        List<IStmt> stmts = new ArrayList<>();
        stmts.add(convertToLocalVarDecl(variabledeclarators.variabledeclarator(),type));
        if(variabledeclarators.variabledeclarators() == null) return stmts;
        stmts.addAll(convertToLocalVarDecls(variabledeclarators.variabledeclarators(),type));
        return stmts;
    }
    private static IStmt convertToLocalVarDecl(Compiler_grammarParser.VariabledeclaratorContext variabledeclaratorContext,Type type){
        String name = variabledeclaratorContext.IDENTIFIER().getText();
        if(variabledeclaratorContext.assignmentexpression() == null) return new LocalOrFieldVar(type,name);
        IExpr stmtExpr = convertToAssignExpr(variabledeclaratorContext.assignmentexpression());
        return new Assign(new LeftSideExpr(new LocalOrFieldVar(type,name)),stmtExpr);
    }

    private static IExpr convertToAssignExpr(Compiler_grammarParser.AssignmentexpressionContext assignmentexpressionContext) {
        if(assignmentexpressionContext.expression() != null){
            return convertToExpression(assignmentexpressionContext.expression());
        }
        if(assignmentexpressionContext.preincrementexpression() != null){
            return new Binary("+",new IntegerLit(1),
                    new LocalOrFieldVar(new Type("int"),assignmentexpressionContext.preincrementexpression().name().getText()));
        }
        if(assignmentexpressionContext.predecrementexpression() != null){
            return new Binary("-",
                    new LocalOrFieldVar(new Type("int"),assignmentexpressionContext.predecrementexpression().name().getText()),new IntegerLit(1));
        }
        if(assignmentexpressionContext.postincrementexpression() != null){
            return new Binary("+",new IntegerLit(1),
                    new LocalOrFieldVar(new Type("int"),assignmentexpressionContext.postincrementexpression().name().getText()));
        }
        if(assignmentexpressionContext.postdecrementexpression() != null){
            return new Binary("-",
                    new LocalOrFieldVar(new Type("int"),assignmentexpressionContext.postdecrementexpression().name().getText()),new IntegerLit(1));
        }
        if(assignmentexpressionContext.methodcallexpression() != null){
            //@TODO Method Call überarbeiten
        }
        else{ //assignmentexpressionContext.newexpression() != null

        }
    }

    private static IExpr convertToExpression(Compiler_grammarParser.ExpressionContext expression) {
        if(expression.IDENTIFIER() != null){
            if(expression.PLUS() != null) return new Binary("+",
                    new LocalOrFieldVar(new Type(""),expression.IDENTIFIER().getText()),
                    convertToExpression(expression.expression()));

            if(expression.MINUS() != null) return new Binary("-",
                    new LocalOrFieldVar(new Type(""),expression.IDENTIFIER().getText()),
                    convertToExpression(expression.expression()));

            if(expression.MUL() != null) return new Binary("*",
                    new LocalOrFieldVar(new Type(""),expression.IDENTIFIER().getText()),
                    convertToExpression(expression.expression()));

            if(expression.DIV() != null) return new Binary("/",
                    new LocalOrFieldVar(new Type(""),expression.IDENTIFIER().getText()),
                    convertToExpression(expression.expression()));

            if(expression.MOD() != null) return new Binary("%",
                    new LocalOrFieldVar(new Type(""),expression.IDENTIFIER().getText()),
                    convertToExpression(expression.expression()));

            return new LocalOrFieldVar(new Type(""),expression.IDENTIFIER().getText());
        }
        //expression.literal() != null
        if(expression.PLUS() != null) return new Binary("+",
                convertToLiteral(expression.literal()),
                convertToExpression(expression.expression()));

        if(expression.MINUS() != null) return new Binary("-",
                convertToLiteral(expression.literal()),
                convertToExpression(expression.expression()));

        if(expression.MUL() != null) return new Binary("*",
                convertToLiteral(expression.literal()),
                convertToExpression(expression.expression()));

        if(expression.DIV() != null) return new Binary("/",
                convertToLiteral(expression.literal()),
                convertToExpression(expression.expression()));

        if(expression.MOD() != null) return new Binary("%",
                convertToLiteral(expression.literal()),
                convertToExpression(expression.expression()));
        return new Unary("",convertToLiteral(expression.literal()));
    }

    private static IExpr convertToLiteral(Compiler_grammarParser.LiteralContext literal) {
        if(literal.INTLITERAL() != null) return new IntegerLit(Integer.parseInt(literal.INTLITERAL().getText()));
        if(literal.BOOLLITERAL() != null) return new BoolLit(literal.BOOLLITERAL().getText().equals("true"));
        if(literal.CHARLITERAL() != null) return new CharLit(literal.CHARLITERAL().getText().charAt(0));
        if(literal.STRINGLITERAL() != null) return new StringLit(literal.STRINGLITERAL().getText());
        return new JNull();
    }

    private static List<Parameter> convertToParameters(Compiler_grammarParser.FormalparameterlistContext parameterListContext) {
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(convertToParameter(parameterListContext.formalparameter()));
        if (parameterListContext.formalparameterlist() == null) return parameters;
        parameters.addAll(convertToParameters(parameterListContext.formalparameterlist()));
        return parameters;
    }

    private static Parameter convertToParameter(Compiler_grammarParser.FormalparameterContext parameterContext) {
        return new Parameter(getType(parameterContext.type()), parameterContext.IDENTIFIER().getText());
    }

    private static List<Field> convertToFields(Compiler_grammarParser.FielddeclarationContext fieldcontext) {
        Type type = getType(fieldcontext.type());

        Access access = Access.PUBLIC;
        if (fieldcontext.accessmodifier() != null) {
            access = getForAccessModifier(fieldcontext.accessmodifier());
        }
        return convertToFields(fieldcontext.variabledeclarators(), access, type);
    }

    private static List<Field> convertToFields(Compiler_grammarParser.VariabledeclaratorsContext variableDeclarators, Access access, Type type) {
        List<Field> fields = new ArrayList<>();
        fields.add(convertToField(variableDeclarators.variabledeclarator(), access, type));

        if (variableDeclarators.variabledeclarators() == null) return fields;

        fields.addAll(convertToFields(variableDeclarators.variabledeclarators(), access, type));

        return fields;
    }

    private static Field convertToField(Compiler_grammarParser.VariabledeclaratorContext variableContext, Access access, Type type) {
        return new Field(type, variableContext.IDENTIFIER().getText(), access);
    }


    private static Access getForAccessModifier(Compiler_grammarParser.AccessmodifierContext acc) {
        return switch (acc.getText()) {
            case "private" -> Access.PRIVATE;
            case "protected" -> Access.PROTECTED;
            default -> Access.PUBLIC;
        };
    }

    private static Type getType(Compiler_grammarParser.TypeContext typeContext) {
        if (typeContext.primitivetype() != null) {
            if (typeContext.primitivetype().INT() != null) {
                return new Type("int");
            } else if (typeContext.primitivetype().CHAR() != null) {
                return new Type("char");
            } else if (typeContext.primitivetype().BOOLEAN() != null) {
                return new Type("boolean");
            }
        } else if (typeContext.abstracttype() != null) {
            if (typeContext.abstracttype().name() != null) {
                return new Type(typeContext.abstracttype().name().getText());
            } else if (typeContext.abstracttype().STRING() != null) {
                return new Type("java.lang.String");
            }
        }
        return new Type("");
    }
}
