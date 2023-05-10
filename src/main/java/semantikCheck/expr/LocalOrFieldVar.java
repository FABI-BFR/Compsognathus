package semantikCheck.expr;

import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmt;

public class LocalOrFieldVar implements IExpr, IStmt {
    public Type type;
    public String name;

    public LocalOrFieldVar(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;

    }
}
