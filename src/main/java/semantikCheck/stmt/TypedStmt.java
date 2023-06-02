package semantikCheck.stmt;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IStmt;

import java.util.List;

public class TypedStmt implements IStmt {
    private Type type;
    public IStmt statement;

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
        statement.semCheck(parameters, classes, currentClass);
    }

    public IStmt getStatement() {
        return statement;
    }

    public void setStatement(IStmt statement) {
        this.statement = statement;
    }

    public String toString(String indent){
        String typedStmt = "";
        typedStmt += indent + "Type: " + type.toString(indent+"\t") + "\n";
        typedStmt += indent + "Statement:" + statement.toString(indent+"\t") + "\n";

        return typedStmt;
    }
}
