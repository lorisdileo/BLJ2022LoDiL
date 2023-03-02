package Exceptions;

public class LeaseLengthCollisionException extends CException {
    public LeaseLengthCollisionException() {
        super("This vehicle is already taken on your desired date");
    }
}
