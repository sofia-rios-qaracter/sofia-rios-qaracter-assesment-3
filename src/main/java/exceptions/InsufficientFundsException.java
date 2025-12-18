package exceptions;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(Double funds) {
        super("You don't have sufficient funds to make this operation.");
    }
}