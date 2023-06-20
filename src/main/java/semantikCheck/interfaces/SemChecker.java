package semantikCheck.interfaces;

import semantikCheck.Class;
import semantikCheck.Field;
import semantikCheck.Parameter;

import java.util.List;

public interface SemChecker {

    void semCheck (List<IVar> vars, List<Class> classes, Class currentClass);
}
