package semantikCheck.expr;

import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;

public class InstVar {

    public String varName;
    public IExpr expression;
    public Type type;


    public InstVar(String varName, IExpr expression, Type type) {
        this.varName = varName;
        this.expression = expression;
        this.type = type;
    }
}
