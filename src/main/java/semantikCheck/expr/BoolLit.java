package semantikCheck.expr;

import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;

public class BoolLit implements IExpr {

    public boolean value;
    private Type type;

    public BoolLit(boolean value) {
        this.value = value;
    }

    @Override
    public Type getType() {

        type.setType("boolean");
        return type;

    }

    @Override
    public void setType(Type type) {

    }
}
