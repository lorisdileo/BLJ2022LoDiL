import org.example.Main;
import org.example.TypeConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TypeConverterTests {
    private TypeConverter testee;


    @BeforeEach
    void setUp(){
        testee = new TypeConverter();
    }
    /*@Test
    public void convertStringToShort_Loris_inputCorrect_true(){
        String str = "123456789";

        TypeConverter typeConverter = new TypeConverter(str);
        boolean expected = true;

        short result = testee.convertStringToShort(typeConverter.toString());
        assertEquals(expected, result);
    }

    @Test
    public void convertStringToShort_Loris_inputCorrectWithSign_true(){
        String str = "123_6789";

        TypeConverter typeConverter = new TypeConverter(str);
        boolean expected = true;

        short result = testee.convertStringToShort(typeConverter.toString());
        assertEquals(expected, result);
    }

    @Test
    public void convertStringToShort_Loris_inputCorrectWithSign_true(){
        String str = "123'6789";

        TypeConverter typeConverter = new TypeConverter();
        boolean expected = true;

        short result = TypeConverter.convertStringToShort(typeConverter.toString());
        assertEquals(expected, result);
    }

    @Test
    public void convertStringToShort_Loris_inputIsCero_false(){
        String str = "0";

        TypeConverter typeConverter = new TypeConverter(str);
        boolean expected = true;

        short result = typeConverter.convertStringToShort(typeConverter.toString());
        assertEquals(expected, result);
    }

    @Test
    public void convertStringToShort_Loris_inputIsBelowCero_true(){
        String str = "-654654";

        TypeConverter typeConverter = new TypeConverter(str);
        boolean expected = true;

        short result = typeConverter.convertStringToShort(typeConverter.toString());
        assertEquals(expected, result);
    }

    @Test
    public void convertStringToShort_Loris_inputIsBelowCeroWithSign_true(){
        String str = "-65'4654";

        TypeConverter typeConverter = new TypeConverter(str);
        boolean expected = true;

        short result = typeConverter.convertStringToShort(typeConverter.toString());
        assertEquals(expected, result);
    }

    @Test
    public void convertStringToShort_Loris_inputIsBelowCeroWithSign_true(){
        String str = "-65_4654";

        TypeConverter typeConverter = new TypeConverter(str);
        boolean expected = true;

        short result = typeConverter.convertStringToShort(typeConverter.toString());
        assertEquals(expected, result);
    }

    @Test
    public void convertStringToShort_Loris_inputIsString_false(){
        String str = "Hallo";

        TypeConverter typeConverter = new TypeConverter();
        boolean expected = false;

        short result = typeConverter.convertStringToShort(typeConverter.toString());
        assertEquals(expected, result);
    }*/

    @Test
    public void convertStringToDouble_SamuelScherrer_StringToConvert_doubleAndOnlyOneDecimal() throws IllegalArgumentException{
        String str = "12.5";
        //given

        double expectedResult = 12.5;

        //when
        double result = testee.convertStringToDouble(str);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void convertStringToDouble_SamuelScherrer_StringToConvert_doubleWithApostrophAndOnlyOneDecimal() throws IllegalArgumentException{
        String str = "1'200.5";
        //given


        double expectedResult = 1200.5;

        //when
        double result = testee.convertStringToDouble(str);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void convertStringToDouble_SamuelScherrer_StringToConvert_doubleWithCommaAndOnlyOneDecimal() throws IllegalArgumentException{
        String str = "1'450,5";
        //given

        double expectedResult = 1450.5;

        //when
        double result = testee.convertStringToDouble(str);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void convertStringToDouble_SamuelScherrer_StringToConvert_doubleWithUnderscoreAndOnlyOneDecimal() throws IllegalArgumentException{
        //given
        String str = "1_200.5";
        double expectedResult = 1200.5;

        //when
        double result = testee.convertStringToDouble(str);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void convertStringToDouble_SamuelScherrer_StringToConvert_negativeDoubleWithApostrophAndOnlyOneDecimal() throws IllegalArgumentException{
        //given
        String str = "-7'300.5";
        double expectedResult = -7300.5;

        //when
        double result = testee.convertStringToDouble(str);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void convertStringToDouble_SamuelScherrer_StringToConvert_negativeDoubleWithUnderscoreAndOnlyOneDecimal() throws IllegalArgumentException{
        //given
        String str = "-5_000.5";
        double expectedResult = -5000.5;

        //when
        double result = testee.convertStringToDouble(str);

        //then
        assertEquals(expectedResult, result);
    }

    //with more than one decimal
    @Test
    void convertStringToDouble_SamuelScherrer_StringToConvert_doubleWithMoreThanOneDecimal() throws IllegalArgumentException{
        //given
        String str = "12.5234";
        double expectedResult = 12.5;

        //when
        double result = testee.convertStringToDouble(str);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void convertStringToDouble_SamuelScherrer_StringToConvert_doubleWithApostrophAndWithMoreThanOneDecimal() throws IllegalArgumentException{
        //given
        String str = "1'200.512";
        double expectedResult = 1200.512;

        //when
        double result = testee.convertStringToDouble(str);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void convertStringToDouble_SamuelScherrer_StringToConvert_doubleWithUnderscoreAndWithMoreThanOneDecimal() throws IllegalArgumentException{
        //given
        String str = "1_200.565";
        double expectedResult = 1200.565;

        //when
        double result = testee.convertStringToDouble(str);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void convertStringToDouble_SamuelScherrer_StringToConvert_negativeDoubleWithApostrophAndWithMoreThanOneDecimal() throws IllegalArgumentException{
        //given
        String str = "-7'300.598";

        double expectedResult = -7300.598;

        //when
        double result = testee.convertStringToDouble(str);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void convertStringToDouble_SamuelScherrer_StringToConvert_negativeDoubleWithUnderscoreAndWithMoreThanOneDecimal() throws IllegalArgumentException{
        //given
        String str = "-5_000.5134";

        double expectedResult = -5000.5134;

        //when
        double result = testee.convertStringToDouble(str);

        //then
        assertEquals(expectedResult, result);
    }


    //all IntegerVariations
    @Test
    void convertStringToDouble_SamuelScherrer_StringToConvert_integer() throws IllegalArgumentException{
        //given
        String str = "7";
        double expectedResult = 7;

        //when
        double result = testee.convertStringToDouble(str);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void convertStringToDouble_SamuelScherrer_StringToConvert_integerWithApostroph() throws IllegalArgumentException{
        //given
        String str = "7'000";
        double expectedResult = 7000;

        //when
        double result = testee.convertStringToDouble(str);
        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void convertStringToDouble_SamuelScherrer_StringToConvert_integerWithUnderscore() throws IllegalArgumentException{
        //given
        String str = "7_000";
        double expectedResult = 7000;

        //when
        double result = testee.convertStringToDouble(str);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void convertStringToDouble_SamuelScherrer_StringToConvert_NegativeIntegerWithApostroph() throws IllegalArgumentException{
        //given
        String str = "-24'000";

        double expectedResult = -24000;

        //when
        double result = testee.convertStringToDouble(str);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    void convertStringToDouble_SamuelScherrer_StringToConvert_NegativeIntegerWithUnderscore() throws IllegalArgumentException{
        //given
        String str = "-52_000";

        double expectedResult = -52000;

        //when
        double result = testee.convertStringToDouble(str);

        //then
        assertEquals(expectedResult, result);
    }


    //all Illegal Arguments
    /*@Test
    void convertStringToDouble_SamuelScherrer_StringToConvert_CharactersInsteadOfNumber(toConvert) throws IllegalArgumentException{
        //given
        toConvert = new toConvert("abc");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Double.parseDouble("abc"));
        String expectedResult = "You have to type a number.";

        //when
        String actualMessage = exception.getMessage();

        //then
        Assertions.assertTrue(actualMessage.contains(expectedResult));
    }*/
}
