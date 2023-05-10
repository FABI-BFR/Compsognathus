package semantikCheck.stmt;

import semantikCheck.Type;
import semantikCheck.interfaces.IStmt;

public class TypedStmt implements IStmt {
    private Type type;
    private IStmt statement;

    @Override
    public Type getType() {

        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }
}
