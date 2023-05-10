package semantikCheck.stmtexpr;
import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmtExpr;

import java.util.List;


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

    public LeftSideExpr getLeftSideExpr()
    {
        return leftSideExpr;
    }

    public void setLeftSideExpr(LeftSideExpr leftSideExpr)
    {
        this.leftSideExpr = leftSideExpr;
    }

    public IExpr getExpression()
    {
        return expression;
    }

    public void setExpression(IExpr expression)
    {
        this.expression = expression;
    }

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass)
    {

    }
}
