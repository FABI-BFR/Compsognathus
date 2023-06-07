package semantikCheck.expr;

import semantikCheck.*;
import semantikCheck.Class;
import semantikCheck.checker.Checker;
import semantikCheck.interfaces.IExpr;

import java.util.List;

public class InstVar implements IExpr {

    public String varName;
    public IExpr expression;
    public Type type;
    private boolean store;


    public InstVar(String varName, IExpr expression, Type type, boolean store) {
        this.varName = varName;
        this.expression = expression;
        this.type = type;
        this.store = store;
    }


    public boolean isStore() {
        return store;
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
    public void semCheck(List<Parameter> parameters, List<Class> classes, Class currentClass) {
        expression.semCheck(parameters, classes, currentClass);
        if(!(expression instanceof LocalOrFieldVar || expression instanceof This || expression instanceof Super)) {
            Checker.addDereferenceError(currentClass.getName(), type);
        }

        Class tempClass = null;
        for(Class c : classes){
            if(c.getName().equals(expression.getType())) {
                tempClass = c;
                break;
            }
        }
        if(tempClass == null) {
            Checker.addSymbolNotFoundError(currentClass.getName(), "class " + expression.getType());
        }
        Field field = null;
        for(Field f: tempClass.getFields()) {
            if(f.getName().equals(varName) && (f.getAccess() == Access.PUBLIC || expression instanceof This || currentClass.getName().equals(tempClass.getName()))) {
                field = f;
                break;
            }
        }

        if(field == null) {
            Checker.addSymbolNotFoundError(currentClass.getName(), " field " + varName);
            return;
        }
        type = field.getType();
    }
    public String toString(String indent) {
        String instVar = indent + "Instvar: {\n";
        instVar += indent +  " Type: " + type.toString(indent+"\t") +"\n";
        instVar += indent + "Name: "+varName+"\n";
        instVar += indent + "Expression: \n"
                + expression.toString(indent+"\t");
        return instVar + indent+"}\n";
    }
}
