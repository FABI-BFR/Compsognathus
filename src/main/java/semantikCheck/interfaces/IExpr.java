package semantikCheck.interfaces;

import semantikCheck.Type;

public interface IExpr {
    Type getType();
    void setType(Type type);
}
