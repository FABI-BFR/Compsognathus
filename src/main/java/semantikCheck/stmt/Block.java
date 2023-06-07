package semantikCheck.stmt;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Type;
import semantikCheck.checker.Checker;
import semantikCheck.expr.LocalOrFieldVar;
import semantikCheck.interfaces.IStmt;
import semantikCheck.stmtexpr.MethodCall;

import java.util.ArrayList;
import java.util.List;

public class Block implements IStmt {
    private List<IStmt> statements;
    private Type type;

    public Block(List<IStmt> stmts) {
        this.statements = new ArrayList<>();
        if (stmts != null && !stmts.isEmpty()) {
            statements.addAll(stmts);
        }
    }

    public List<IStmt> getStatements() {
        return statements;
    }

    public void setStatements(List<IStmt> stmts) {
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

        for (IStmt statement : statements) {
            statement.semCheck(parameters, classes, currentClass);
        }

        type = new Type("void");
        for (int i = 0; i< statements.size(); i++) {
            if (!(statements.get(i) instanceof StmtExprStmt || statements.get(i) instanceof MethodCall || statements.get(i) instanceof LocalOrFieldVar)) {
                type.setType(Checker.upperBound(type, statements.get(i).getType()));
            }
        }
    }

    public String toString(String indent) {
        String block = indent + "Block: {\n";
        for (IStmt s : statements) {
            block += s.toString(indent + "\t");
        }
        return block + indent + "}" + "\n";
    }
}
