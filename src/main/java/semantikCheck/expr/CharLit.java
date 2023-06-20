package semantikCheck.expr;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IVar;

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
    public void semCheck(List<IVar> vars, List<Class> classes, Class currentClass) {
        type = new Type("char");

    }
    public String toString(String indent) {
        String charlit = indent + "CharLit: {\n";
        charlit += indent + "Type: Char\n";
        charlit += indent + "Value: " + value + "\n";
        return charlit + indent+"}\n";
    }
}
