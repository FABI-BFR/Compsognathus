package semantikCheck.interfaces;

import semantikCheck.Type;

public interface IStmtExpr extends IExpr,IStmt{

    Type getType();

    void setType(Type type);

    String toString(String indent);
}
