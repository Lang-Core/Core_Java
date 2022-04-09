package demo03.exceptions;

public class InvalidMobileNoException extends Exception{
    public InvalidMobileNoException() {
        super("Invalid mobile number");
    }

    public InvalidMobileNoException(String message) {
        super(message);
    }
}
