package semantikCheck.expr;

import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;

public class IntegerLit implements IExpr {

    public int value;
    private Type type;

    public IntegerLit(int value) {
        this.value = value;
    }

    @Override
    public Type getType() {
        type.setType("int");
        return type;
    }

    @Override
    public void setType(Type type) {

    }
}
