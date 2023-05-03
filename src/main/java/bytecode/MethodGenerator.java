package bytecode;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.MethodVisitor;
import semantikCheck.Parameter;

import java.util.List;
import java.util.TreeMap;

public class MethodGenerator
{
    private MethodVisitor            m_methodVisitor;
    private TreeMap<String, Integer> m_variables;
    private String                   m_name;
    private ClassGenerator           m_classGenerator;

    @Contract(pure = true)
    public MethodGenerator(@NotNull MethodVisitor _methodVisitor,
                           @NotNull List<Parameter> _parameters,
                           @NotNull String _name,
                           @NotNull ClassGenerator _classGenerator)
    {
        m_methodVisitor = _methodVisitor;
        m_variables=new TreeMap<>();
        for (Parameter par : _parameters) {
            m_variables.put(par.getName(), m_variables.size() + 1);
        }
        m_name = _name;
        m_classGenerator = _classGenerator;
    }

    public MethodVisitor getMethodVisitor() { return m_methodVisitor; }

    public TreeMap<String, Integer> getVariables() { return m_variables; }

    public String getName() { return m_name; }

    public ClassGenerator getClassGenerator() { return m_classGenerator; }
}
