package semantikCheck.stmtexpr;

import semantikCheck.*;
import semantikCheck.Class;
import semantikCheck.checker.Checker;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmtExpr;

import java.util.ArrayList;
import java.util.List;

public class New implements IStmtExpr {

    private Type type;
    public List<IExpr> expressions;
    public boolean methodStored;
    public Method method;

    public New(Type type, List<IExpr> expressions, boolean methodStored) {
        this.type = type;
        this.expressions = expressions;
        this.methodStored = methodStored;
    }

    public New(Type type, List<IExpr> expressions) {
        this.type = type;
        this.expressions = expressions;
    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public void setType(Type type) {

    }

    public boolean isStored() {
        return methodStored;
    }

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {
        expressions.forEach(p -> p.semCheck(parameters, classes, currentClass));
        Class tempClass = null;
        for (Class c : classes) {
            if (c.getName().equals(type.toString())) {
                tempClass = c;
                break;
            }
        }

        if (tempClass == null) {
            Checker.addSymbolNotFoundError(currentClass.getName(), "class" + type);
        }

        List<Method> tempMethod = new ArrayList<>();
        for (Method m : tempClass.getMethods()) {
            if (m.getName().equals(type.toString())) {
                tempMethod.add(m);
            }
        }

        Method tempConstructor = null;
        for (Method m : tempMethod) {
            if (m.getAccess() == Access.PUBLIC && m.getParameter().size() == parameters.size() && Checker.checkArgument(expressions, m.getParameter())) {
                tempConstructor = m;
                break;
            }
        }

        if (tempConstructor == null) {
            Checker.addArgumentError(currentClass.getName(), "constructor" + type.toString());
        }

        method = tempConstructor;


    }
    public String toString(String indent) {
        String newS = "";
        newS += indent +"Type " + type + "\n";
        newS += indent + "Expressions: \n";
        for(IExpr e : expressions){
            newS += e.toString(indent+"\t")+ "\n";
        }
        return newS + "\n";
    }
}
