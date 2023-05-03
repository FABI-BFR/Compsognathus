package semantikCheck.stmt;

import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmt;

public class While {
    private IExpr expression;
    private IStmt statement;

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
}
