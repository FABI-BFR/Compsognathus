package semantikCheck.stmt;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.checker.Checker;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmt;

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
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {
        expression.semCheck(parameters,classes,currentClass);
        if(!expression.getType().equals("boolean")) {
            Checker.addIncompatibleTypeError(currentClass.getName(), new Type("boolean"), expression.getType());
        }

        type = new Type("void");
        if (ifStmt != null) {
            ifStmt.semCheck(parameters, classes, currentClass);
            type = ifStmt.getType();
            if(elseStmt != null) {
                elseStmt.semCheck(parameters, classes, currentClass);
                type.setType(Checker.upperBound(type, elseStmt.getType()));
            }
        }
    }

    public String toString(String indent){
        String ifstmt = "";
        ifstmt += indent + "Type: " + type.toString(indent+"\t") + "\n";
        ifstmt += indent + "Expression:" + expression.toString(indent+"\t") + "\n";
        ifstmt += indent + "IfStmt:" + ifStmt.toString(indent+"\t");
        ifstmt += indent + "ElseStmt:" + elseStmt.toString(indent+"\t") +"\n";

        return ifstmt;
    }
}
