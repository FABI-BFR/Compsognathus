package semantikCheck;

import bytecode.MethodGenerator;
import semantikCheck.interfaces.IVar;
import semantikCheck.interfaces.SemChecker;
import java.util.ArrayList;
import semantikCheck.checker.Checker;
import semantikCheck.stmt.Block;

import java.util.Collection;
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
        this.constructors = constructors;
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
    public void semCheck(List<IVar> vars, List<Class> classes, Class currentClass) {

        for(int i = 0; i < methods.size()-1; i++){
            for(int j = i + 1; j < methods.size(); j++){
                Method m1 = methods.get(i);
                Method m2 = methods.get(j);
                if(m1.getName().equals(m2.getName()) && Checker.checkParam(m1.getParameter(), m2.getParameter())){
                    Checker.addDuplicateSymbolError(currentClass.getName(), m1.getName(), "method");
                }
            }
        }

        for(int i = 0; i < fields.size()-1; i++){
            for(int j = i + 1; j < fields.size(); j++){
                Field f1 = fields.get(i);
                Field f2 = fields.get(j);
                if(f1.getName().equals(f2.getName())){
                    Checker.addDuplicateSymbolError(currentClass.getName(), f1.getName(), "field");
                }
            }
        }
        vars.addAll(fields);

        for (Method m : methods) {
            m.semCheck(vars, classes, this);
        }
    }

    public String toString(String indent){
        String program = indent +"Class: {\n";
        program += indent + "Name: " + name + "\n";
        program += indent + "Access: " + access.toString(indent+"\t") + "\n";
        program += indent+ "Fields: [" + "\n";
        for(Field f : fields){
            program += f.toString(indent+"\t");
        }
        program += indent + "]\n";
        program += indent+ "Methods: [" + "\n";
        for(Method m : methods){
            program += m.toString(indent+"\t");
        }
        program += indent + "]\n";
        program += indent+ "Constructors: [" + "\n";
        for(Constructor c : constructors){
            program += c.toString(indent+"\t");
        }
        return program + indent +"]\n"+indent +"}\n";
    }
}
