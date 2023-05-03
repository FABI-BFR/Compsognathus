package semantikCheck;

import semantikCheck.interfaces.IExpr;
import semantikCheck.stmt.Block;

import java.util.ArrayList;
import java.util.List;

public class Method {

    private Type type;
    private String name;
    private List<IExpr> parameter;
    private Block statement;
    private Access access;

    public Method (Type type, String name, List<IExpr> parameter, Block statement) {
        this(type, name, parameter, statement, Access.PUBLIC);
    }

    public Method (Type type, String name, List<IExpr> parameter, Block statement, Access access) {
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


}
