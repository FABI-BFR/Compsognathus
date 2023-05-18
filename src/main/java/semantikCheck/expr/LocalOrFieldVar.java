package semantikCheck.expr;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.checker.Checker;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmt;

import java.util.List;

public class LocalOrFieldVar implements IExpr {
    public Type type;
    public String name;

    //Boolean zur Überprüfung ob Variable gespeichert oder geladen wird
    public boolean store;
    //Boolean zur Überprüfung ob Variable local oder fieldvariable ist
    public boolean local;

    public LocalOrFieldVar(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    public boolean isStore(){
        return this.store;
    }

    public boolean isLocal(){
        return this.local;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;

    }

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {
        Parameter tempParameter = null;
        for (Parameter p : parameters) {
            if (p.getName().equals(name)) {
                tempParameter = p;
                break;
            }
        }
        if (tempParameter == null) {
            Checker.addSymbolNotFoundError(currentClass.getName(), name);
        }
    }
}
