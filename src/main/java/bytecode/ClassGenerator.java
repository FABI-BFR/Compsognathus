package bytecode;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.ClassWriter;

import java.util.TreeMap;

public class ClassGenerator
{
    private ClassWriter             m_classWriter;
    private String                  m_name;
    private String                  m_parentName;
    private TreeMap<String, String> m_fields;

    @Contract(pure = true)
    public ClassGenerator(@NotNull ClassWriter _classWriter,
                          @NotNull String _name)
    {
        this(_classWriter, _name, "java/lang/Object");
    }

    @Contract(pure = true)
    public ClassGenerator(@NotNull ClassWriter _classWriter,
                          @NotNull String _name,
                          String _parentName)
    {
        m_classWriter = _classWriter;
        m_name = _name;
        m_parentName = _parentName;
        m_fields = new TreeMap<>();
    }

    public ClassWriter getClassWriter()
    {
        return m_classWriter;
    }

    public String getName()
    {
        return m_name;
    }

    public String getParentName()
    {
        return m_parentName;
    }

    public TreeMap<String, String> getFields()
    {
        return m_fields;
    }
}
