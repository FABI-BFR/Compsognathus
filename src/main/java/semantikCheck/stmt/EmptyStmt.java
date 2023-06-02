package semantikCheck.stmt;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IStmt;

import java.util.List;

public class EmptyStmt implements IStmt {
    final Type type;
    @Override
    public Type getType() {
        return type ;
    }

    @Override
    public void setType(Type type) {

    }
    public EmptyStmt(){
        this.type = new Type("null");
    }
    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {

    }

    public String toString(String indent){
        return indent + "Type" + type.toString(indent+"\t");
    }
}
