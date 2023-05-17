package semantikCheck.stmtexpr;
import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.checker.Checker;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmtExpr;

import java.util.List;


public class Assign implements IStmtExpr {

    public LeftSideExpr leftSideExpr;
    public IExpr expression;

    private Type type;


    public Assign(LeftSideExpr leftSideExpr, IExpr expression) {
        this.leftSideExpr = leftSideExpr;
        this.expression = expression;
    }


    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
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
        leftSideExpr.expression.semCheck(parameters, classes, currentClass);
        expression.semCheck(parameters, classes, currentClass);
        type = expression.getType();

        if (!Checker.upperBound(leftSideExpr.expression.getType(), expression.getType()).equals(leftSideExpr.expression.getType())) {
            Checker.addIncompatibleTypeError(currentClass.getName(), leftSideExpr.expression.getType(), expression.getType());
        }
    }
}
