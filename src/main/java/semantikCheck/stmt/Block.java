package semantikCheck.stmt;

import semantikCheck.Type;
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
}
