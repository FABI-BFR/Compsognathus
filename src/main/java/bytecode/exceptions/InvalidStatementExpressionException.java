package bytecode.exceptions;

public class InvalidStatementExpressionException extends RuntimeException
{
    public InvalidStatementExpressionException(String _message)
    {
        super(_message);
    }

    public InvalidStatementExpressionException(String _message, Throwable _error)
    {
        super(_message, _error);
    }
}
