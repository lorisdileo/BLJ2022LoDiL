import org.example.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTests {
    private Main testee;

    @BeforeEach
    void setUp(){
        testee = new Main();
    }

    @Test
    public void converter_inputCorrect_true(){
        String number = "123456789";

        Main main = new Main();
        boolean expected = true;

        boolean result = main.converter(number);
        assertEquals(expected, result);
    }

    @Test
    public void converter_inputCorrect_true(){
        String number = "123_6789";

        Main main = new Main();
        boolean expected = true;

        boolean result = main.converter(number);
        assertEquals(expected, result);
    }
}
