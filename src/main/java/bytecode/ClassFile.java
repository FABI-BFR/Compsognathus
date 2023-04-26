package bytecode;

import bytecode.interfaces.IClassFile;
import org.jetbrains.annotations.Contract;

public class ClassFile implements IClassFile
{
    private String m_classname;
    private byte[] m_bytes;

    @Contract(pure = true)
    public ClassFile(String _classname, byte[] _bytes)
    {
        m_classname = _classname;
        m_bytes    = _bytes;
    }

    @Override
    public String getClassName()
    {
        return m_classname;
    }

    @Override
    public String getFileName()
    {
        return m_classname + ".class";
    }

    @Override
    public byte[] getBytecode()
    {
        return m_bytes;
    }
}
