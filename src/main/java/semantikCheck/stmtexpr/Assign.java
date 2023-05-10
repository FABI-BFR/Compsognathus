package semantikCheck.stmtexpr;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmtExpr;
import semantikCheck.stmtexpr.LeftSideExpr;

public class Assign implements IStmtExpr {

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
