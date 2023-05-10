package semantikCheck.expr;
import semantikCheck.Type;
import  semantikCheck.interfaces.IExpr;

public class Unary implements IExpr {

    public String operator;

    public IExpr expression;

    public Unary(String operator, IExpr expression) {

        this.operator = operator;
        this.expression = expression;

    }

    @Override
    public Type getType() {
        return expression.getType();
    }

    @Override
    public void setType(Type type) {

    }
}
