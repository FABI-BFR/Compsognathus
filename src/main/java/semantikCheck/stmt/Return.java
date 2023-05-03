package semantikCheck.stmt;

import semantikCheck.interfaces.IExpr;
import semantikCheck.Type;

public class Return {
    private IExpr expression;
    private Type type;

    public Return (IExpr expression) {
        this.expression = expression;
    }

    public IExpr getExpression() {
        return expression;
    }

    public void setExpression(IExpr expression) {
        this.expression = expression;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
