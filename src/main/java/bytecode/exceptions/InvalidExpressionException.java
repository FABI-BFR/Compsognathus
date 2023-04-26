package bytecode.exceptions;


public class InvalidExpressionException extends RuntimeException
{
    public InvalidExpressionException(String _message)
    {
        super(_message);
    }

    public InvalidExpressionException(String _message, Throwable _error)
    {
        super(_message, _error);
    }
}
