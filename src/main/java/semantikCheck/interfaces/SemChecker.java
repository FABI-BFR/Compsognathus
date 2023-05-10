package semantikCheck.interfaces;

import semantikCheck.Class;
import semantikCheck.Parameter;

import java.util.List;

public interface SemChecker {

    void semCheck (List<Parameter> parameters, List<Class> classes, Class currentClass);
}
