package semantikCheck.expr;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;

import java.util.List;

public class CharLit implements IExpr {

    public char value;
    private Type type;

    public CharLit(char value) {
        this.value = value;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {

    }

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {
        type = new Type("char");

    }
}
