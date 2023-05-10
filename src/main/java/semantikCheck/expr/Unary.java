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

    }
}
