package semantikCheck.stmt;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmt;
import semantikCheck.interfaces.IStmtExpr;

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
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {
        expression.semCheck(parameters,classes,currentClass);
    }

    public String toString(String indent){
        String stmtExprStmt = indent + "StmtExpr: { \n";
        stmtExprStmt += expression.toString(indent+"\t");
        return stmtExprStmt + indent+"}\n";
    }
}
