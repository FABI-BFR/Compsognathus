package semantikCheck;

import semantikCheck.checker.Checker;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.SemChecker;
import semantikCheck.stmt.Block;

import java.util.ArrayList;
import java.util.List;

public class Method implements SemChecker {

    private Type type;
    private String name;
    private List<Parameter> parameter;
    private Block statement;
    private Access access;

    public Method (Type type, String name, List<Parameter> parameter, Block statement) {
        this(type, name, parameter, statement, Access.PUBLIC);
    }

    public Method (Type type, String name, List<Parameter> parameter, Block statement, Access access) {
        this.type = type;
        this.name = name;
        this.parameter = new ArrayList<>();
        if (parameter != null && !parameter.isEmpty()) {
            this.parameter.addAll(parameter);
        }
        this.statement = statement;
        if (access == null) {
            access = Access.PUBLIC;
        }
        else
        {
            this.access = access;
        }
    }

    public Type getType()
    {
        return type;
    }

    public void setType(Type type)
    {
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Parameter> getParameter()
    {
        return parameter;
    }

    public void setParameter(List<Parameter> parameter)
    {
        this.parameter = parameter;
    }

    public Block getStatement()
    {
        return statement;
    }

    public void setStatement(Block statement)
    {
        this.statement = statement;
    }

    public Access getAccess()
    {
        return access;
    }

    public void setAccess(Access access)
    {
        this.access = access;
    }

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {
        if (statement != null) {
            var temp = new ArrayList<>(parameters);
            temp.addAll(this.parameter);
            statement.semCheck(temp, classes, currentClass);
            if(!type.getType().equals(statement.getType().getType())) {
                Checker.addIncompatibleTypeError(currentClass.getName(), type, statement.getType());
            }
        }
    }
}
