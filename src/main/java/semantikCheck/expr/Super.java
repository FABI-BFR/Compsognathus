package semantikCheck.expr;

import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;

public class Super implements IExpr {

    private Type type;
    @Override
    public Type getType() {
        type.setType("java.lang.Object");
        return type;
    }

    @Override
    public void setType(Type type) {

    }
    //SemantikCheck

}
