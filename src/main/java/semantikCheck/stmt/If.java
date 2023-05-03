package semantikCheck.stmt;

import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmt;

public class If   {
    private IExpr expression;
    private IStmt ifStmt;
    private IStmt elseStmt;

    public If (IExpr expression, IStmt ifStmt, IStmt elseStmt ) {
        this.expression = expression;
        this.ifStmt = ifStmt;
        this.elseStmt = elseStmt;
    }

    public IExpr getExpression() {
        return expression;
    }

    public void setExpression(IExpr expression) {
        this.expression = expression;
    }

    public IStmt getIfStmt() {
        return ifStmt;
    }

    public void setIfStmt(IStmt ifStmt) {
        this.ifStmt = ifStmt;
    }

    public IStmt getElseStmt() {
        return elseStmt;
    }

    public void setElseStmt(IStmt elseStmt) {
        this.elseStmt = elseStmt;
    }
}
