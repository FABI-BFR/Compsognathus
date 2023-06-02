package semantikCheck;

public class Field {
    private Type type;
    private String name;
    private Access access;

    public Field (Type type, String name){
        this(type, name, Access.PUBLIC);
    }

    public Field (Type type, String name, Access access) {
        this.type = type;
        this.name = name;
        if(access == null){
            access = Access.PUBLIC;
        }
        else {
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

    public Access getAccess()
    {
        return access;
    }

    public void setAccess(Access access)
    {
        this.access = access;
    }

    public String toString(String indent){
        String program = "";
        program += indent + "Type:" + type.toString(indent+"\t") + "\n";
        program += indent+ "Name" + name +"\n";
        program += indent + "Access" + access.toString(indent+"\t") + "\n";

        return program;
    }
}
