package Exceptions;

public class MinorAgeException extends CException {
    public MinorAgeException() {
        super("Du kannst kein Auto mieten, weil du unter 18 bist.");
    }
}
