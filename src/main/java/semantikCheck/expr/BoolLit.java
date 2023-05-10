package semantikCheck.expr;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;

import java.util.List;

public class BoolLit implements IExpr {

    public boolean value;
    private Type type;

    public BoolLit(boolean value) {
        this.value = value;
    }

    @Override
    public Type getType() {

        type.setType("boolean");
        return type;

    }

    @Override
    public void setType(Type type) {

    }

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {

    }
}
