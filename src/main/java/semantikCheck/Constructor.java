package semantikCheck;

import semantikCheck.checker.Checker;
import semantikCheck.interfaces.IVar;
import semantikCheck.interfaces.SemChecker;
import semantikCheck.stmt.Block;

import java.util.ArrayList;
import java.util.List;

public class Constructor implements SemChecker {
    private String name;
    private List<Parameter> parameter;
    private Block statement;
    private Access access;

    public Constructor(String name, List<Parameter> parameter, Block statement) {
        this(name, parameter, statement, Access.PUBLIC);
    }

    public Constructor(String name, List<Parameter> parameter, Block statement, Access access) {
        this.name = name;
        this.parameter = new ArrayList<>();
        if (parameter != null && !parameter.isEmpty()) {
            this.parameter.addAll(parameter);
        }
        this.statement = statement;
        if (access == null) {
            this.access = Access.PUBLIC;
        } else {
            this.access = access;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Parameter> getParameter() {
        return parameter;
    }

    public void setParameter(List<Parameter> parameter) {
        this.parameter = parameter;
    }

    public Block getStatement() {
        return statement;
    }

    public void setStatement(Block statement) {
        this.statement = statement;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    @Override
    public void semCheck(List<IVar> vars, List<Class> classes, Class currentClass) {
        if (statement != null) {
            var temp = new ArrayList<>(vars);
            temp.addAll(this.parameter);
            statement.semCheck(temp, classes, currentClass);
        }
    }

    public String toString(String indent) {
        String constructor = indent +"Constructor: {\n";
        constructor += indent + "Name: " + name + "\n";
        constructor += indent + "Access: " + access.toString(indent + "\t") + "\n";
        constructor += indent + "Parameter: [\n";
        for (Parameter p : parameter) {
            constructor += p.toString(indent + "\t");
        }
        constructor += indent + "]\n";
        constructor += indent + "Statement: \n"
                + statement.toString(indent + "\t");
        return constructor +indent+ "}\n";
    }
}
