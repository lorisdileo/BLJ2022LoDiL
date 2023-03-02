package Exceptions;

public class MinorAgeException extends CException {
    public MinorAgeException() {
        super("You can't rent a vehicle because you are to young.");
    }
}
