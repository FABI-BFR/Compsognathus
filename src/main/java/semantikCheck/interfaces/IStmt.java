package semantikCheck.interfaces;

import semantikCheck.Type;

public interface IStmt {
    Type getType();

    void setType(Type type);
}
