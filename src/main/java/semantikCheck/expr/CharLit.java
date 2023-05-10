package semantikCheck.expr;

import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;

public class CharLit implements IExpr {

    public char value;
    private Type type;

    public CharLit(char value) {
        this.value = value;
    }

    @Override
    public Type getType() {
        type.setType("char");
        return type;
    }

    @Override
    public void setType(Type type) {

    }
}
