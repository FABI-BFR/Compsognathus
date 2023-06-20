package semantikCheck.stmt;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.checker.Checker;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmt;
import semantikCheck.interfaces.IVar;

import java.util.List;

public class While implements IStmt {
    private IExpr expression;
    private IStmt statement;
    private Type type;

    public While (IExpr expression, IStmt statement) {
        this.expression = expression;
        this.statement = statement;
    }

    public IExpr getExpression() {
        return expression;
    }

    public void setExpression(IExpr expression) {
        this.expression = expression;
    }

    public IStmt getStatement() {
        return statement;
    }

    public void setStatement(IStmt statement) {
        this.statement = statement;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;

    }

    @Override
    public void semCheck(List<IVar> vars, List<Class> classes, Class currentClass) {
        expression.semCheck(vars, classes, currentClass);
        if(!expression.getType().getType().equals("boolean")) {
            Checker.addIncompatibleTypeError(currentClass.getName(), new Type("boolean"), expression.getType());
        }

        statement.semCheck(vars, classes, currentClass);
        type = statement.getType();
    }

    public String toString(String indent){
        String whileStmt = indent + "While: { \n";
        whileStmt += indent + "Expression: \n"
                + expression.toString(indent+"\t");
        whileStmt += indent + "Statement: \n" + statement.toString(indent+"\t");

        return whileStmt + indent+"}\n";
    }
}
