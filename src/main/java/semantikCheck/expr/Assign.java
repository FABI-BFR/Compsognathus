package semantikCheck.expr;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;

public class Assign implements IExpr {

    public LeftSideExpr leftSideExpr;
    public IExpr expression;

    public Assign(LeftSideExpr leftSideExpr, IExpr expression) {
        this.leftSideExpr = leftSideExpr;
        this.expression = expression;
    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public void setType(Type type) {

    }
}
