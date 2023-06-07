package semantikCheck.stmtexpr;

import semantikCheck.*;
import semantikCheck.Class;
import semantikCheck.checker.Checker;
import semantikCheck.expr.LocalOrFieldVar;
import semantikCheck.expr.Super;
import semantikCheck.expr.This;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmt;
import semantikCheck.interfaces.IStmtExpr;

import java.util.ArrayList;
import java.util.List;

public class MethodCall implements IStmtExpr {

    private Type type;
    public IExpr object;
    public String name;
    public Method method;
    public boolean methodStored;
    public List<IExpr> parameters;

    public MethodCall(IExpr object, String name, List<IExpr> parameters) {
        this.object = object;
        this.name = name;
        this.parameters = parameters;
    }

    public MethodCall(IExpr expression, String name, List<IExpr> parameters, boolean stored) {
        this.object = expression;
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
        object.semCheck(parameters, classes, currentClass);
        this.parameters.forEach(p -> p.semCheck(parameters, classes, currentClass));
        if (!(object instanceof LocalOrFieldVar) || (object instanceof This) || (object instanceof Super)) {
            Checker.addDereferenceError(currentClass.getName(), type);
            this.type = new Type("null");
            return;
        }
        Type classType = object.getType();
        Class tempClass = null;
        for(Class c : classes) {
            if(c.getName().equals(classType.getType())) {
                tempClass = c;
                break;
            }
        }
        if (tempClass == null) {
            Checker.addSymbolNotFoundError(currentClass.getName(), "class" + classType.getType());
            this.type = new Type("null");
            return;
        }

        List<Method> tempMethods = new ArrayList<>();
        for (Method m : tempClass.getMethods()) {
            if(m.getName().equals(name)) {
                tempMethods.add(m);
            }
        }

        if (tempMethods.isEmpty()) {
            Checker.addSymbolNotFoundError(currentClass.getName(), "method" + name);
            this.type = new Type("null");
            return;
        }

        List<Method> accessableMethods = new ArrayList<>();
        for (Method m : tempMethods) {
            if(m.getAccess() == Access.PUBLIC || object instanceof This) {
                accessableMethods.add(m);
            }
        }

        if (accessableMethods.isEmpty()) {
            Checker.addAccessError(currentClass.getName(), name);
            this.type = new Type("null");
            return;
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
            this.type = new Type("null");
            return;
        }

        method = parameterMethod;
        type = parameterMethod.getType();

    }

    public String toString(String indent){
        String methodCall = indent + "MethodCall: {\n";
        methodCall += indent + "Name: " + name + "\n";
        methodCall += indent + "Objekt: " + "\n"
                + object.toString(indent+"\t"); //+"\n"
        methodCall += indent + "Parameters: [" + "\n";
        for(IExpr p : parameters){
            methodCall +=p.toString(indent + "\t");
        }
        methodCall += indent + "]\n";
        return methodCall + indent+"}\n";
    }
}
