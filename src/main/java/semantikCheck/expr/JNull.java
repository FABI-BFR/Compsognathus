package semantikCheck.expr;

import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;

public class JNull implements IExpr {

    private Type type;
    @Override
    public Type getType() {
        type.setType("null");
        return type;
    }

    @Override
    public void setType(Type type) {

    }
    //SemantikCheck
}
