package semantikCheck;

public enum Access {
    PUBLIC("public"),
    PRIVATE("private"),
    PROTECTED ("protected");

    public final String sAccess;
    Access(String s) {
        sAccess = s;
    }

    public String toString(String indent){
        return sAccess;
    }
}
