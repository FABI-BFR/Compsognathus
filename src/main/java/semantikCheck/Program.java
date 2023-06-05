package semantikCheck;

import semantikCheck.checker.Checker;
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

    /*public Boolean compareProgramTypes(Program programType) {
        boolean result = true;
        int classIndex = programType.getClasses().size();
        for (int iClass = 0; iClass < classIndex; iClass++) {
            int methodIndex = programType.getClasses().get(iClass).getMethods().size();
            for(int jMehtod = 0; jMehtod < methodIndex; jMehtod++) {

                if(programType.getClasses().get(iClass).getMethods().get(jMehtod).getType() != this.getClasses().get(iClass).getMethods().get(jMehtod).getType()) return false;

                int parameterIndex = programType.getClasses().get(iClass).getMethods().get(jMehtod).getParameter().size();
                for (int kParameter = 0; kParameter < parameterIndex; kParameter++) {
                    if (programType.getClasses().get(iClass).getMethods().get(jMehtod).getParameter().get(kParameter).getType() != this.getClasses().get(iClass).getMethods().get(jMehtod).getParameter().get(kParameter).getType()) {
                        result = false;
                    }
                }

                if (programType.getClasses().get(iClass).getMethods().get(jMehtod).getStatement().getType() != this.getClasses().get(iClass).getMethods().get(jMehtod).getStatement().getType()) {
                    result = false;
                }

                int fieldIndex = programType.getClasses().get(iClass).getFields().size();
                for(int jField = 0; jField < fieldIndex; jField++ ) {
                    if(programType.getClasses().get(iClass).getFields().get(jField).getType() != this.getClasses().get(iClass).getFields().get(jField).getType()) {
                        result = false;
                    }
                }

            }
        }
        return result;
    }*/

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {

        for (int i = 0; i < classes.size() - 1; i++) {
            for (int j = i + 1; j < classes.size(); j++) {
                Class c1 = classes.get(i);
                Class c2 = classes.get(j);
                if (c1.getName().equals(c2.getName())) {
                    Checker.addDuplicateSymbolError(currentClass.getName(), c1.getName(), "class");
                }
            }
        }
        for (Class c : classes) {
            c.semCheck(parameters, classes, currentClass);
        }

    }
}
