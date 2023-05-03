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
}
