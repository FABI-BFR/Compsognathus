package bytecode;

import org.jetbrains.annotations.Contract;

public class ClassFile
{
    private String m_classname;
    private byte[] m_bytes;

    @Contract(pure = true)
    public ClassFile(String _classname, byte[] _bytes)
    {
        m_classname = _classname;
        m_bytes    = _bytes;
    }

    public String getClassName()
    {
        return m_classname;
    }

    public String getFileName()
    {
        return m_classname + ".class";
    }

    public byte[] getBytecode()
    {
        return m_bytes;
    }
}
