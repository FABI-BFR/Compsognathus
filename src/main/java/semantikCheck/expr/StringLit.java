package semantikCheck.expr;

import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;

public class StringLit implements IExpr {

    public String value;
    private Type type;

    public StringLit(String value){
        this.value = value;
    }

    @Override
    public Type getType() {
        type.setType("java.lang.String");
        return type;
    }

    @Override
    public void setType(Type type) {

    }
}
