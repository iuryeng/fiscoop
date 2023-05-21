package cooperar.domain.exceptions;

public class ObraNotFoundException extends RuntimeException {
    public ObraNotFoundException(String message) {
        super(message);
    }
}