package semantikCheck;

import bytecode.MethodGenerator;
import semantikCheck.interfaces.SemChecker;
import java.util.ArrayList;
import java.util.List;

public class Class implements SemChecker {
    private String name;
    private List<Field> fields;
    private List<Method> methods;

    private List<Constructor> constructors;
    private Access access;

    public Class(String parName,List<Constructor> constructors, List<Field> parFields, List<Method> parMethod)
    {
        this(parName,constructors, parFields, parMethod, Access.PUBLIC);
    }
    public Class(String name,List<Constructor> constructors, List<Field> fields, List<Method> methods, Access parAccess){
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

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Field> getFields()
    {
        return fields;
    }

    public void setFields(List<Field> fields)
    {
        this.fields = fields;
    }

    public List<Method> getMethods()
    {
        return methods;
    }

    public void setMethods(List<Method> methods)
    {
        this.methods = methods;
    }

    public Access getAccess()
    {
        return access;
    }

    public void setAccess(Access access)
    {
        this.access = access;
    }

    public List<Constructor> getConstructors()
    {
        return constructors;
    }

    public void setConstructors(List<Constructor> constructors)
    {
        this.constructors = constructors;
    }

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {

    }
}
