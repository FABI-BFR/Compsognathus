package semantikCheck.stmt;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IStmtExpr;

import java.util.List;

public class LocalVarDecl implements IStmtExpr {
    private Type type;
    private String name;
    public Parameter localVar;

    public LocalVarDecl(Type type, String name){
        this.type = type;
        this.name = name;
        localVar = new Parameter(type, name);
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {

    }

    @Override
    public String toString(String indent) {
        return indent + "LocalVarDecl: { \n" +
                indent + "\tType: " + type.getType() + "\n"+
                indent + "\tName: " + name + "\n"+ indent + "}" + "\n";
    }

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {
        parameters.add(localVar);
    }
}
