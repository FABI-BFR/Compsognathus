package semantikCheck.expr;


import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.checker.Checker;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IVar;

import java.util.List;

public class Binary implements IExpr {


    public String operator;
    public IExpr exprLeft;
    public IExpr exprRight;
    public boolean isBoolOperation ;
    private Type type;

    public Binary(String operator, IExpr exprLeft, IExpr exprRight) {
        this.operator = operator;
        this.exprLeft = exprLeft;
        this.exprRight = exprRight;

    }

    public boolean checkBoolOperator (String operator){
        switch (operator) {
            case "==":
            case "!=":
            case "&&":
            case "||":
            case "<":
            case ">":
            case "<=":
            case ">=":
                return true;
            default:
                return false;
        }
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
    public void semCheck(List<IVar> vars, List<Class> classes, Class currentClass) {
        exprLeft.semCheck(vars, classes, currentClass);
        exprRight.semCheck(vars, classes, currentClass);

        if(!Checker.upperBound(exprLeft.getType(), exprRight.getType()).equals(exprLeft.getType().getType())) {
            Checker.addBinaryExpressionError(currentClass.getName(), exprLeft.getType().getType(), exprRight.getType().getType(), operator);
        }


        if(checkBoolOperator(operator)){
            type = new Type ("boolean");
        }else{
            type = exprLeft.getType();
        }


    }

    public String toString(String indent) {
        String binary = indent + "Binary: {\n";
        binary += (type == null || type.getType().equals("")) ? "" : (indent + "Type: "+type.getType() + "\n");
        binary += indent + "Operator: " + operator + "\n";
        binary += indent + "Leftside: {\n"
                + exprLeft.toString(indent + "\t")
                + indent + "}\n";
        binary += indent + "Rightside: {\n"
                + exprRight.toString(indent + "\t")
                + indent + "}\n";
        return binary + indent + "}\n";
    }
}
