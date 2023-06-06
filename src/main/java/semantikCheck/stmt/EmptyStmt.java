package semantikCheck.stmt;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IStmt;

import java.util.List;

public class EmptyStmt implements IStmt {
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
        type = new Type("null");

    }

    public String toString(String indent) {
        return indent + "EmptyStatement: {\n"
                + indent + "Type: " + type.toString(indent + "\t") + "\n"
                + indent + "}\n";
    }
}
