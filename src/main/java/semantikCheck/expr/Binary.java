package semantikCheck.expr;


import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;

import java.util.List;
public class Binary implements IExpr {

    public String operator;
    public IExpr exprLeft;
    public  IExpr exprRight;

    public Binary(String operator, IExpr exprLeft, IExpr exprRight){
        this.operator = operator;
        this.exprLeft = exprLeft;
        this.exprRight = exprRight;

    }


}
