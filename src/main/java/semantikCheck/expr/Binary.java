package semantikCheck.expr;


import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;

import java.util.List;
public class Binary implements IExpr{


    public String operator;
    public IExpr exprLeft;
    public  IExpr exprRight;
    private Type type;

    public Binary(String operator, IExpr exprLeft, IExpr exprRight){
        this.operator = operator;
        this.exprLeft = exprLeft;
        this.exprRight = exprRight;

    }


    @Override
    public Type getType()
    {
        return type;
    }

    @Override
    public void setType(Type type)
    {
        this.type = type;
    }

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {

    }
}
