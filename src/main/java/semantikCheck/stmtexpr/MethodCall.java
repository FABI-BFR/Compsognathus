package semantikCheck.stmtexpr;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IStmtExpr;

import java.util.List;

public class MethodCall implements IStmtExpr {

    Type type;


    @Override
    public Type getType() {
        return null;
    }

    @Override
    public void setType(Type type) {

    }

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass)
    {

    }
}
