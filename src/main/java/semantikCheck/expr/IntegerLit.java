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
        return type;
    }

    @Override
    public void setType(Type type) {

    }

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {
        type = new Type("int");
    }
    public String toString(String indent) {
        String intlit = indent + "IntegerLit: {\n";
        intlit += indent + "Type: int\n";
        intlit += indent + "Value: " + value + "\n";
        return intlit + indent+"}\n";
    }
}
