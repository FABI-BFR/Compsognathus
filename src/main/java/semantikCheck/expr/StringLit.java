package semantikCheck.expr;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;

import java.util.List;

public class StringLit implements IExpr {

    public String value;
    private Type type;

    public StringLit(String value){
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
        type = new Type("java.lang.String");

    }
    public String toString(String indent) {
        String Stringlit = indent + "StringLit: {\n";
        Stringlit += indent + "Type: String\n";
        Stringlit += indent + "Value: " + value + "\n";
        return Stringlit + indent+"}\n";
    }
}
