package semantikCheck.stmtexpr;

import semantikCheck.*;
import semantikCheck.Class;
import semantikCheck.checker.Checker;
import semantikCheck.interfaces.IExpr;
import semantikCheck.interfaces.IStmtExpr;
import semantikCheck.interfaces.IVar;

import java.util.ArrayList;
import java.util.List;

public class New implements IStmtExpr {

    private Type type;
    public List<IExpr> expressions;
    public boolean methodStored;
    public Constructor constructor;

    public New(Type type, List<IExpr> expressions, boolean methodStored) {
        this.type = type;
        if(expressions == null){
            this.expressions = new ArrayList<>();
        }else{
            this.expressions = expressions;
        }

        this.methodStored = methodStored;
    }

    public New(Type type, List<IExpr> expressions) {
        this (type, expressions, false);
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    public boolean isStored() {
        return methodStored;
    }

    @Override
    public void semCheck(List<IVar> vars, List<Class> classes, Class currentClass) {
        expressions.forEach(ex -> ex.semCheck(vars, classes, currentClass));

        Class tempClass = null;
        for (Class c : classes) {
            if (c.getName().equals(type.getType())) {
                tempClass = c;
                break;
            }
        }

        if (tempClass == null) {
            Checker.addSymbolNotFoundError(currentClass.getName(), "class " + type.getType());
            this.type = new Type("null");
            return;
        }

        Constructor tempConstructor = null;
        for (Constructor c : tempClass.getConstructors()) {
                if (c.getParameter().size() == this.expressions.size() && Checker.checkArgument(this.expressions, c.getParameter())) {
                    tempConstructor = c;
                    break;
                }
        }

        if (tempConstructor == null) {
            Checker.addArgumentError(currentClass.getName(), "constructor" + type.getType());
            this.type = new Type("null");
            return;
        }

        if (tempConstructor.getAccess() != Access.PUBLIC) {
            Checker.addAccessError(currentClass.getName(), "constructor" + type.getType());
            this.type = new Type("null");
            return;
        }

        constructor = tempConstructor;

    }

    public String toString(String indent) {
        String newS = indent + "New: {\n";
        newS += indent + "Type " + type.getType() + "\n";
        newS += indent + "Parameter: [\n";
        if (expressions != null) {
            for (IExpr e : expressions) {
                newS += e.toString(indent + "\t");
            }
        }
        newS += indent + "]\n";
        return newS + indent + "}\n";
    }
}
