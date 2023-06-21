package semantikCheck.expr;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IVar;

import java.util.List;

public class BoolLit implements IExpr {

    public boolean value;
    private Type type;

    public BoolLit(boolean value) {
        this.value = value;
        type = new Type("boolean");
    }

    @Override
    public Type getType() {
        return type;

    }

    @Override
    public void setType(Type type) {

    }



    @Override
    public void semCheck(List<IVar> vars, List<Class> classes, Class currentClass) {
        type = new Type("boolean");
    }

    public String toString(String indent) {
        String boollit = indent + "BoolLit: {\n";
        boollit += indent + "Type: "+type.getType()+"\n";
        boollit += indent + "Value: " + value + "\n";
        return boollit + indent +"}\n";
    }
}
