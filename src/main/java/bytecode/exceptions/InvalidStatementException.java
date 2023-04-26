package bytecode.exceptions;

public class InvalidStatementException extends RuntimeException
{
    public InvalidStatementException(String _message)
    {
        super(_message);
    }

    public InvalidStatementException(String _message, Throwable _error)
    {
        super(_message, _error);
    }
}

