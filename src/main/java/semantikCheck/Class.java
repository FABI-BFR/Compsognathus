package semantikCheck;

import bytecode.MethodGenerator;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String name;
    private List<Field> fields;
    private List<Method> methods;
    private Access access;

    public Class(String parName, List<Field> parFields, List<Method> parMethod)
    {
        this(parName, parFields, parMethod, Access.PUBLIC);
    }
    public Class(String name, List<Field> fields, List<Method> methods, Access parAccess){
        this.name = name;
        this.fields = new ArrayList<>();
        if(fields != null && !fields.isEmpty()){
            this.fields.addAll(fields);
        }
        this.methods = new ArrayList<>();
        if(methods != null && !methods.isEmpty()){
            this.methods.addAll(methods);
        }
        if(parAccess == null ){
            access = Access.PUBLIC;
        }else {
            access = parAccess;
        }
    }
}
