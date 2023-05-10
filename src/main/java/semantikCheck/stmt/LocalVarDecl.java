package semantikCheck.stmt;

import semantikCheck.Type;
import semantikCheck.interfaces.IStmt;

public class LocalVarDecl implements IStmt {
    private Type type;
    private String name;

    public LocalVarDecl(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
