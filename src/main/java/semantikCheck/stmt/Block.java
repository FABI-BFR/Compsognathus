package semantikCheck.stmt;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.checker.Checker;
import semantikCheck.interfaces.IStmt;

import java.util.ArrayList;
import java.util.List;

public class Block implements IStmt{
    private List<IStmt> statements;
    private Type type;

    public Block(List<IStmt> stmts) {
        this.statements = new ArrayList<>();
        if(stmts != null && !stmts.isEmpty()) {
            statements.addAll(stmts);
        }
    }

    public List<IStmt> getStatements() {
        return statements;
    }

    public void setStatements(List<IStmt> stmts){
        statements = stmts;
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

        for (IStmt statment : statements) {
            statment.semCheck(parameters, classes, currentClass);
        }

        type = new Type("void");
        if (statements.size() > 0) {
            for (int i = 0; i< statements.size(); i++) {
                if (!(statements.get(i) instanceof TypedStmt)) {
                    type.setType(Checker.upperBound(type, statements.get(i).getType()));
                }
            }
        }

    }
}
