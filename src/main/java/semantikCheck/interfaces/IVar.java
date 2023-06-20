package semantikCheck.interfaces;

import semantikCheck.Type;

public interface IVar extends SemChecker{
    Type getType();
    void setType(Type type);
    String getName();
    void setName(String name);


}
