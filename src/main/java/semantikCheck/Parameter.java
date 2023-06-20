package semantikCheck;

import semantikCheck.interfaces.IVar;
import semantikCheck.interfaces.SemChecker;

import java.util.List;

public class Parameter implements IVar {
    private Type type;
    private String name;

    public Parameter(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(String indent) {
        String parameter = indent + "Parameter: {\n";
        parameter += indent + "Type: "+type.toString(indent+"\t") + "\n";
        parameter += indent + "Name: "+name + "\n";
        return parameter + indent + "}\n";
    }

    @Override
    public void semCheck(List<IVar> vars, List<Class> classes, Class currentClass) {

    }
}
