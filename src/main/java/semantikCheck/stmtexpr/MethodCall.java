package semantikCheck.stmtexpr;

import semantikCheck.*;
import semantikCheck.Class;
import semantikCheck.checker.Checker;
import semantikCheck.expr.LocalOrFieldVar;
import semantikCheck.expr.Super;
import semantikCheck.expr.This;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmtExpr;

import java.util.ArrayList;
import java.util.List;

public class MethodCall implements IStmtExpr {

    private Type type;
    public IExpr expression;
    public String name;
    public Method method;
    public boolean methodStored;
    public List<IExpr> parameters;

    public MethodCall(IExpr expression, String name, List<IExpr> parameters) {
        this.expression = expression;
        this.name = name;
        this.parameters = parameters;
    }

    public MethodCall(IExpr expression, String name, List<IExpr> parameters, boolean stored) {
        this.expression = expression;
        this.name = name;
        parameters = new ArrayList<>();
        if(parameters != null && !parameters.isEmpty()){
            this.parameters.addAll(parameters);
        }
        methodStored = stored;
    }

    public boolean isStored() {
        return methodStored;
    }


    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass)
    {
        if (expression == null) {
            expression = new This();
        }
        expression.semCheck(parameters, classes, currentClass);
        this.parameters.forEach(p -> p.semCheck(parameters, classes, currentClass));
        if (!(expression instanceof LocalOrFieldVar) || (expression instanceof This) || (expression instanceof Super)) {
            Checker.addDereferenceError(currentClass.getName(), type);
        }
        Type classType = expression.getType();
        Class tempClass = null;
        for(Class c : classes) {
            if(c.getName().equals(classType.toString())) {
                tempClass = c;
                break;
            }
        }
        if (tempClass == null) {
            Checker.addSymbolNotFoundError(currentClass.getName(), "class" + classType.toString());
        }

        List<Method> tempMethods = new ArrayList<>();
        for (Method m : tempClass.getMethods()) {
            if(m.getName().equals(name)) {
                tempMethods.add(m);
            }
        }

        if (tempMethods.isEmpty()) {
            Checker.addSymbolNotFoundError(currentClass.getName(), "method" + name);
        }

        List<Method> accessableMethods = new ArrayList<>();
        for (Method m : tempMethods) {
            if(m.getAccess() == Access.PUBLIC || expression instanceof This) {
                accessableMethods.add(m);
            }
        }

        if (accessableMethods.isEmpty()) {
            Checker.addAccessError(currentClass.getName(), name);
        }

        Method parameterMethod = null;
        for (Method m : accessableMethods) {
            if (m.getParameter().size() == parameters.size() && Checker.checkArgument(this.parameters, m.getParameter())) {
                parameterMethod = m;
                break;
            }
        }
        if (parameterMethod == null) {
            Checker.addArgumentError(currentClass.getName(), name);
        }

        method = parameterMethod;
        type = parameterMethod.getType();

    }
}
