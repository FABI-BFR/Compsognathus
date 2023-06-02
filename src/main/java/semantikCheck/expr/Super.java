package semantikCheck.expr;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;

import java.util.List;

public class Super implements IExpr {

    private Type type;

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {

    }

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {
        type = new Type("java.lang.Object");

    }

    public String toString(String indent) {
        return indent + "Type" + type.toString(indent+"\t");
    }
}
