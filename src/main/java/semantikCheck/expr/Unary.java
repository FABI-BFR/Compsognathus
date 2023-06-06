package semantikCheck.expr;
import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import  semantikCheck.interfaces.IExpr;

import java.util.List;

public class Unary implements IExpr {

    public String operator;

    public IExpr expression;

    public Unary(String operator, IExpr expression) {

        this.operator = operator;
        this.expression = expression;

    }

    @Override
    public Type getType() {
        return expression.getType();
    }

    @Override
    public void setType(Type type) {

    }
    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {
        expression.semCheck(parameters, classes, currentClass);
    }
    public String toString(String indent) {
        String unary = indent + "Unary: {\n";
        unary += indent + "Operator: "+operator + "\n";
        unary += indent + "Expression: \n"
                + expression.toString(indent+"\t");
        return unary + indent+"}\n";
    }
}
