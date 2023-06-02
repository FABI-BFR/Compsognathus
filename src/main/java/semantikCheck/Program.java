package semantikCheck;

import semantikCheck.interfaces.SemChecker;

import java.util.ArrayList;
import java.util.List;

public class Program implements SemChecker
{

    List<Class> classes;


    public Program() {

        this(null);
    }
    public Program(List<Class> _classes){
        this.classes = new ArrayList<>();
        if(_classes != null){
             this.classes.addAll(_classes);
        }
    }

    public List<Class> getClasses()
    {
        return classes;
    }

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass)
    {

    }
    public String toString(String indent){
        String program = indent +"Program: {\n";
        program += indent + "Classes: [\n";
        for(Class c : classes){
            program += c.toString(indent+"\t");
        }
        return program +indent +"]\n"+indent +  "}\n";
    }
}
