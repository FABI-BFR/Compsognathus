package semantikCheck.expr;
import semantikCheck.interfaces.IExpr;

public class Assign {

    public LeftSideExpr leftSideExpr;
    public IExpr expression;

    public Assign(LeftSideExpr leftSideExpr, IExpr expression) {
        this.leftSideExpr = leftSideExpr;
        this.expression = expression;
    }
}
