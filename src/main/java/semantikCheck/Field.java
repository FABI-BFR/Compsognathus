package semantikCheck;

import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmtExpr;

public class Field {
    private Type type;
    private String name;
    private Access access;

    private String value;

    private IExpr expression;

    public Field(Type type, String name) {
        this(type, name, Access.PUBLIC);
    }

    public Field (Type type, String name, IExpr expression){this(type, name, Access.PUBLIC, expression,null);}
    public Field (Type type, String name, Access access) {
        this.type = type;
        this.name = name;
        if (access == null) {
            access = Access.PUBLIC;
        } else {
            this.access = access;
        }
    }

    public Field (Type type, String name, Access access, IExpr expression, String value){
        this.type = type;
        this.name = name;
        if (access == null) {
            this.access = Access.PUBLIC;
        } else {
            this.access = access;
        }
        this.expression = expression;
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public IExpr getExpression() {
        return expression;
    }

    public void setExpression(IExpr expression) {
        this.expression = expression;
    }
    public String toString(String indent) {
        String program = indent + "Field: {\n";
        program += indent + "Type: " + type.toString(indent + "\t") + "\n";
        program += indent + "Name: " + name + "\n";
        program += indent + "Access: " + access.toString(indent + "\t") + "\n";
        program += expression == null ? "" : indent + "Expression: {\n" + expression.toString(indent + "\t") + indent + "}\n";
        return program + indent + "}\n";
    }
}
