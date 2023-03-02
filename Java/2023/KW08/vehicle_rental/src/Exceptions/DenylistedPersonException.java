package Exceptions;

public class DenylistedPersonException extends CException {
    public DenylistedPersonException() {
        super("You can't rent a vehicle because you are on the denylist");
    }
}
