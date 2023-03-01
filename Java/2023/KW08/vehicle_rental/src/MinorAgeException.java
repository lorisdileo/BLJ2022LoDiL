import java.time.LocalDate;

public class MinorAgeException extends Exception{
    public MinorAgeException(String message) {
        super(message);
    }
}
