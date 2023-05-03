package semantikCheck;

public class Field {
    private String type;
    private String name;
    private Access access;

    public Field (String type, String name){
        this(type, name, Access.PUBLIC);
    }

    public Field (String type, String name, Access access) {
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
