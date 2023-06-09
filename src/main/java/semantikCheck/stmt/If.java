package semantikCheck.stmt;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.checker.Checker;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmt;
import semantikCheck.interfaces.IVar;

import java.util.List;

public class If  implements IStmt {
    private IExpr expression;
    private IStmt ifStmt;
    private IStmt elseStmt;
    private Type type;

    public If (IExpr expression, IStmt ifStmt, IStmt elseStmt ) {
        this.expression = expression;
        this.ifStmt = ifStmt;
        this.elseStmt = elseStmt;
    }

    public IExpr getExpression() {
        return expression;
    }

    public void setExpression(IExpr expression) {
        this.expression = expression;
    }

    public IStmt getIfStmt() {
        return ifStmt;
    }

    public void setIfStmt(IStmt ifStmt) {
        this.ifStmt = ifStmt;
    }

    public IStmt getElseStmt() {
        return elseStmt;
    }

    public void setElseStmt(IStmt elseStmt) {
        this.elseStmt = elseStmt;
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
        expression.semCheck(vars,classes,currentClass);
        if(!expression.getType().getType().equals("boolean")) {
            Checker.addIncompatibleTypeError(currentClass.getName(), new Type("boolean"), expression.getType());
        }

        ifStmt.semCheck(vars, classes, currentClass);
        type = ifStmt.getType();
        if(elseStmt != null) {
            elseStmt.semCheck(vars, classes, currentClass);
            type.setType(Checker.upperBound(type, elseStmt.getType()));
            }
        }

    public String toString(String indent){
        String ifstmt = indent +"IfStatement: {\n";
        ifstmt += (type == null || type.getType().equals("")) ? "" : (indent + "Type: "+type.getType() + "\n");
        ifstmt +=  expression.toString(indent+"\t");
        ifstmt += indent + "IfBranch: {"  + "\n"
                + ifStmt.toString(indent+"\t")
                +indent+"}\n";
        if(elseStmt != null)ifstmt += indent + "ElseBranch: {\n"
                + elseStmt.toString(indent+"\t")
                +indent+"}\n";
        return ifstmt + indent+"}\n";
    }
}
