package semantikCheck.checker;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Program;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;

import java.util.ArrayList;
import java.util.List;

public class Checker
{
    //Log für errors
    public static List<String> errors = new ArrayList<>();

    /**
     * Method to check a given programm
     * @param program given programm
     * @return a semantik checked program
     */
    public Program check(Program program){
        errors.clear();
        program.semCheck(new ArrayList<>(),program.getClasses(),null);
        return program;
    }

    public List<String> getErrors()
    {
        return errors;
    }

    //Just to be there(no usage)
    public static void setErrors(List<String> errors)
    {
        Checker.errors = errors;
    }

    public static String upperBound(Type _at, Type _bt)
    {

        String a = _at.toString();
        String b = _bt.toString();

        if ((a != null && a.equals(b)) || b == null || b.equals("void") || b.equals("null")) {
            return a;
        } else if (a == null || a.equals("void") || a.equals("null")) {
            return b;
        } else {
            return "java.lang.Object";
        }
    }

    public static boolean checkParam (List<Parameter> parameters, List<Parameter> arguments){
        for(int i=0; i< arguments.size(); i++){
            if (!Checker.upperBound(parameters.get(i).getType(), arguments.get(i).getType()).equals(arguments.get(i).getType())) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkArgument(List<IExpr> parameters, List<Parameter> arguments){
        for(int i=0; i<arguments.size(); i++){
            if (!Checker.upperBound(parameters.get(i).getType(), arguments.get(i).getType()).equals(arguments.get(i).getType())) {
                return false;
            }
        }
        return true;
    }

}
