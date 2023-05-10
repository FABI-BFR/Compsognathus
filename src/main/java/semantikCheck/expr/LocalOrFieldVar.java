package semantikCheck.expr;

import semantikCheck.Type;

public class LocalOrFieldVar {
    public Type type;
    public String name;

    public LocalOrFieldVar(Type type, String name) {
        this.type = type;
        this.name = name;
    }
}
