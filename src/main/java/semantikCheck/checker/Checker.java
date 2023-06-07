package semantikCheck.checker;

import semantikCheck.Class;
import semantikCheck.Parameter;
import semantikCheck.Program;
import semantikCheck.Type;
import semantikCheck.interfaces.IExpr;
import semantikCheck.stmt.TypedStmt;
import semantikCheck.stmtexpr.MethodCall;

import java.util.ArrayList;
import java.util.List;

public class Checker {
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

    public static String upperBound(Type _at, Type _bt) {
        if(_at == null || _bt == null){
            return "java.lang.Object";
        }
        String a = _at.getType();
        String b = _bt.getType();

        if (a.equals(b) || b == null || b.equals("void") || b.equals("null")) {
            return a;
        } else if (a == null || a.equals("void") || a.equals("null")) {
            return b;
        } else {
            return "java.lang.Object";
        }
    }

    public static boolean matchChecker(Type _at, Type _bt) {
        String bound = upperBound(_at,_bt);
        return bound.equals(_at);
    }

    public static boolean checkParam (List<Parameter> parameters, List<Parameter> arguments) {
        for(int i=0; i< arguments.size(); i++){
            if (!Checker.upperBound(parameters.get(i).getType(), arguments.get(i).getType()).equals(arguments.get(i).getType())) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkArgument(List<IExpr> parameters, List<Parameter> arguments) {
        for(int i=0; i<arguments.size(); i++){
            if (!Checker.upperBound(parameters.get(i).getType(), arguments.get(i).getType()).equals(arguments.get(i).getType())) {
                return false;
            }
        }
        return true;
    }

    public static void setStoredFlag(IExpr expr) {
        if (expr instanceof TypedStmt) {
            var temp = ((TypedStmt)expr).statement;
            if(temp instanceof MethodCall) {
            }
        }
    }

    public static void addIncompatibleTypeError(String classname, Type expectedType, Type currentType) {
        errors.add("Error in class " + classname + ": Incompatible types " + currentType.getType() + " cannot be converted to " + expectedType.getType());
    }

    public static void addSymbolNotFoundError(String className, String symbol) {
        errors.add("Error in class " + className + ": cannot find symbol: " + symbol);
    }

    public static void addAccessError (String className, String targetName) {
        errors.add("Error in class " + className + ": cannot access " + targetName);
    }

    public static void addArgumentError (String className, String methodName) {
        errors.add("Error in class " + className + ": method" + methodName + " cannot be applied to given types");
    }

    public static void addDuplicateSymbolError (String className, String symbolName, String symbol) {
        errors.add("Error in class " + className + ": " + symbol + " " + symbolName + " is already defined");
    }

    public static void addDereferenceError (String className, Type type) {
        errors.add("Error in class " + className + ": " + type.getType() + " cannot be dereferenced");
    }

    public static void addBinaryExpressionError (String className, String left, String right, String operator) {
        errors.add("Error in class " + className + ": bad operand types left:" + left + " right: " + right + " with " + operator);
    }

    public static void addNotAStatementError (String className) {
        errors.add("Error in class " + className + ": not a statement");
    }

}
