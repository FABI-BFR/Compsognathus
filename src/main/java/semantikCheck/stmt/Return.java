package semantikCheck.stmt;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.checker.Checker;
import semantikCheck.interfaces.IExpr;
import semantikCheck.Type;
import semantikCheck.interfaces.IStmt;
import semantikCheck.interfaces.IVar;

import java.util.List;

public class Return implements IStmt {
    private IExpr expression;
    private Type type;

    public Return (IExpr expression) {
        this.expression = expression;
    }

    public IExpr getExpression() {
        return expression;
    }

    public void setExpression(IExpr expression) {
        this.expression = expression;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void semCheck(List<IVar> vars, List<Class> classes, Class currentClass) {
        if (expression == null) {
            type = new Type ("void");
            return;
        }
        expression.semCheck(vars, classes, currentClass);
        type = expression.getType();
    }

    public String toString(String indent){
        String returnStmt = indent +"Return: {\n";
        returnStmt += (type == null || type.getType().equals("")) ? "" : (indent + "Type: "+type.getType() + "\n");
        returnStmt += indent + "Expression: \n"
                + expression.toString(indent +"\t");
        return returnStmt + indent+"}\n";
    }
}
