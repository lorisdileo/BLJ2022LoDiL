package Exceptions;

public class DenylistedPersonException extends CException {
    public DenylistedPersonException() {
        super("Du kannst kein Auto mieten, weil du auf der Verbotsliste bist.");
    }
}
