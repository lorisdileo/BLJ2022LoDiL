package Exceptions;

public class LeaseLengthCollisionException extends CException {
    public LeaseLengthCollisionException() {
        super("Das von Ihnen gewünschte Fahrzeug ist bereits vermietet.");
    }
}
