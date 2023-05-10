package semantikCheck.expr;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;

import java.util.List;

public class IntegerLit implements IExpr {

    public int value;
    private Type type;

    public IntegerLit(int value) {
        this.value = value;
    }

    @Override
    public Type getType() {
        type.setType("int");
        return type;
    }

    @Override
    public void setType(Type type) {

    }

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {

    }
}
