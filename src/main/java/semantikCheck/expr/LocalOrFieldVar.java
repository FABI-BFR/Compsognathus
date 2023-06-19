package semantikCheck.expr;

import com.sun.jdi.Field;
import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.checker.Checker;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmt;
import semantikCheck.interfaces.IStmtExpr;

import java.util.List;

public class LocalOrFieldVar implements IStmtExpr {
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
        local = !(tempParameter instanceof Field);
        type = tempParameter.getType();
    }
    public String toString(String indent) {
        String localOrFieldVar = indent+"LocalOrFieldVar: {\n";
        if(type.getType() != "")localOrFieldVar += indent + "Type:"
                + type.toString(indent+"\t" )+ "\n";
        localOrFieldVar += indent + "Name: " + name + "\n";
        return localOrFieldVar + indent+"}\n";
    }
}
