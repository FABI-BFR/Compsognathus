package semantikCheck.stmt;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmt;
import semantikCheck.interfaces.IStmtExpr;
import semantikCheck.interfaces.IVar;

import java.util.List;

public class StmtExprStmt implements IStmt {
    IExpr expression;
    Type type;
    public StmtExprStmt(IExpr expression){
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

    public IStmtExpr getExpression() {
        return (IStmtExpr)expression;
    }

    public void setExpression(IExpr expression) {
        this.expression = expression;
    }

    @Override
    public void semCheck(List<IVar> vars, List<Class> classes, Class currentClass) {
        expression.semCheck(vars,classes,currentClass);
        type = expression.getType();
    }

    public String toString(String indent){
        String stmtExprStmt = indent + "StmtExpr: { \n";
        stmtExprStmt += (type == null || type.getType().equals("")) ? "" : (indent + "Type: "+type.getType() + "\n");
        stmtExprStmt += expression.toString(indent+"\t");
        return stmtExprStmt + indent+"}\n";
    }
}
