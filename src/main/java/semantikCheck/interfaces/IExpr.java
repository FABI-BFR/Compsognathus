package semantikCheck.interfaces;

import semantikCheck.Type;

public interface IExpr extends SemChecker{
    Type getType();
    void setType(Type type);
}
