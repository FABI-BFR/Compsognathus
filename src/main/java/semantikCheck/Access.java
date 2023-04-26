package semantikCheck;

public enum Access {
    PUBLIC("public"),
    PRIVATE("private");

    public final String sAccess;
    Access(String s) {
        sAccess = s;
    }
}
