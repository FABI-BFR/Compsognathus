package semantikCheck.expr;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IVar;

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
    public void semCheck(List<IVar> vars, List<Class> classes, Class currentClass) {
        type = new Type("java.lang.Object");

    }

    public String toString(String indent) {
        return indent + "Super: {\n" +
                ((type == null || type.getType().equals("")) ? "" : (indent + "Type: "+type.getType() + "\n"))
                + indent + "Type: " + type.toString(indent + "\t") + "\n"
                + indent + "}\n";
    }
}
