package bytecode.interfaces;

public interface IClassFile
{
    String getClassName();
    String getFileName();
    byte[] getBytecode();
}
