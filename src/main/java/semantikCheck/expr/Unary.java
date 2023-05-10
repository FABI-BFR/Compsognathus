package semantikCheck.expr;
import  semantikCheck.interfaces.IExpr;

public class Unary implements IExpr {

    public String operator;

    public IExpr expression;

    public Unary(String operator, IExpr expression){

        this.operator = operator;
        this.expression = expression;

    }
}
