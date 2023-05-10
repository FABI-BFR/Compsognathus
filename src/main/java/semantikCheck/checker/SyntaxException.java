package semantikCheck.checker;

import java.util.List;

public class SyntaxException extends  Exception {
    public List<String> errors;

    public SyntaxException(List<String> errors) {
        this.errors = errors;
    }
}
