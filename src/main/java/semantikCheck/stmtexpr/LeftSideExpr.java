package semantikCheck.stmtexpr;

import semantikCheck.interfaces.IExpr;

public class LeftSideExpr {

    public IExpr expression;

    public LeftSideExpr(IExpr expression) {
        this.expression = expression;
    }

    public String toString(String indent){
        return indent + "Expression: " + "\n"
                + expression.toString(indent + "\t");
    }
}
