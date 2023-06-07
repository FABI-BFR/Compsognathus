package semantikCheck.stmtexpr;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmtExpr;
import semantikCheck.interfaces.SemChecker;

import java.util.List;

public class LeftSideExpr implements IStmtExpr {

    public IExpr expression;
    private Type type;

    public LeftSideExpr(IExpr expression) {
        this.expression = expression;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    public String toString(String indent){
        return indent + "Expression: " + "\n"
                + expression.toString(indent + "\t");
    }

    public IExpr getExpression() {
        return expression;
    }

    public void setExpression(IExpr expression) {
        this.expression = expression;
    }

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {
        expression.semCheck(parameters, classes, currentClass);
        type = expression.getType();
    }
}
