package semantikCheck;

import semantikCheck.interfaces.SemChecker;
import semantikCheck.stmt.Block;

import java.util.ArrayList;
import java.util.List;

public class Constructor implements SemChecker {
    private String name;
    private List<Parameter> parameter;
    private Block statement;
    private Access access;

    public Constructor ( String name, List<Parameter> parameter, Block statement) {
        this( name, parameter, statement, Access.PUBLIC);
    }
    public Constructor ( String name, List<Parameter> parameter, Block statement, Access access) {
        this.name = name;
        this.parameter = new ArrayList<>();
        if (parameter != null && !parameter.isEmpty()) {
            this.parameter.addAll(parameter);
        }
        this.statement = statement;
        if (access == null) {
            this.access = Access.PUBLIC;
        }
        else
        {
            this.access = access;
        }
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

    }
}
