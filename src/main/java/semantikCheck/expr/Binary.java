package semantikCheck.expr;


import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.checker.Checker;
import semantikCheck.interfaces.IExpr;

import java.util.List;

public class Binary implements IExpr {


    public String operator;
    public IExpr exprLeft;
    public IExpr exprRight;
    private Type type;

    public Binary(String operator, IExpr exprLeft, IExpr exprRight) {
        this.operator = operator;
        this.exprLeft = exprLeft;
        this.exprRight = exprRight;

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
        exprLeft.semCheck(parameters, classes, currentClass);
        exprRight.semCheck(parameters, classes, currentClass);
        if (!Checker.upperBound(exprLeft.getType(), exprRight.getType()).equals(exprLeft.getType())) {
            Checker.addBinaryExpressionError(currentClass.getName(), exprLeft.getType().toString(), exprRight.getType().toString(), operator);
        }
    }

    public String toString(String indent) {
        String binary = "";
        binary += indent +"Type" + type + "\n";
        binary += indent + "Operator:"+operator + "\n";
        binary += indent + "Leftside:\n"
                + exprLeft.toString(indent+"\t");
        binary += indent + "Rightside:\n"
                + exprRight.toString(indent+"\t");
        return binary;
    }
}
