package semantikCheck.interfaces;

import java.util.List;

public interface SemChecker {

    void semCheck (List<Class> classes, Class currentClass);
}
