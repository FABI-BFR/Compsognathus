package semantikCheck.expr;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmt;

import java.util.List;

public class InstVar implements IExpr, IStmt {

    public String varName;
    public IExpr expression;
    public Type type;


    public InstVar(String varName, IExpr expression, Type type) {
        this.varName = varName;
        this.expression = expression;
        this.type = type;
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

    }
}
