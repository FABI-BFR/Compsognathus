package semantikCheck.interfaces;

import semantikCheck.Type;

public interface IStmt extends SemChecker {
    Type getType();

    void setType(Type type);
}
