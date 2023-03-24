package ch.noseryoung.test;

import ch.noseryoung.main.Triangle;
import ch.noseryoung.main.TriangleValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleValidatorTests {
    private TriangleValidator testee;

    @BeforeEach
    void setUp(){
        testee = new TriangleValidator();
    }

    @Test
    public void isEquilateral_TriangleIsEquilateral_true(){
        double side = 1;

        Triangle triangle = new Triangle(side, side, side);
        boolean expectedResult = true;

        boolean result = testee.isEquilateral(triangle);
        assertEquals(expectedResult, result);
    }

    @Test
    public void isEquilateral_allSideAreCero_false(){
        double side = 0;

        Triangle triangle = new Triangle(side, side, side);
        boolean expectedResult = false;

        boolean result = testee.isEquilateral(triangle);
        assertEquals(expectedResult, result);
    }

    @Test
    public void isEquilateral_allSideAreBelowCero_false(){
        double side = -6;

        Triangle triangle = new Triangle(side, side, side);
        boolean expectedResult = false;

        boolean result = testee.isEquilateral(triangle);
        assertEquals(expectedResult, result);
    }

    @Test
    public void isEquilateral_allSideAreDecimal_true(){
        double side = 5.5;

        Triangle triangle = new Triangle(side, side, side);
        boolean expectedResult = true;

        boolean result = testee.isEquilateral(triangle);
        assertEquals(expectedResult, result);
    }

    @Test
    public void isIsosceles_TriangleisIsosceles_true(){
        double side1 = 2;
        double side2 = 6;

        Triangle triangle = new Triangle(side1, side2, side2);
        boolean expectedResult = true;

        boolean result = testee.isIsosceles(triangle);
        assertEquals(expectedResult, result);
    }

    @Test
    public void isIsosceles_twoSidesAreCero_false(){
        double side1 = 2;
        double side2 = 0;

        Triangle triangle = new Triangle(side1, side2, side2);
        boolean expectedResult = false;

        boolean result = testee.isIsosceles(triangle);
        assertEquals(expectedResult, result);
    }

    @Test
    public void isIsosceles_twoSidesAreBelow_false(){
        double side1 = 2;
        double side2 = -7;

        Triangle triangle = new Triangle(side1, side2, side2);
        boolean expectedResult = false;

        boolean result = testee.isIsosceles(triangle);
        assertEquals(expectedResult, result);
    }

    @Test
    public void isIsosceles_twoSidesAreCeroAndOneSideIsBelowCero_false(){
        double side1 = -8;
        double side2 = 0;

        Triangle triangle = new Triangle(side1, side2, side2);
        boolean expectedResult = false;

        boolean result = testee.isIsosceles(triangle);
        assertEquals(expectedResult, result);
    }

    @Test
    public void isIsosceles_twoSidesAreDecimal_true(){
        double side1 = 2;
        double side2 = 5.0;

        Triangle triangle = new Triangle(side1, side2, side2);
        boolean expectedResult = true;

        boolean result = testee.isIsosceles(triangle);
        assertEquals(expectedResult, result);
    }



    @Test
    public void isScalene_TriangleIsScalene_true(){
        double side1 = 2;
        double side2 = 6;
        double side3 = 5;

        Triangle triangle = new Triangle(side1, side2, side3);
        boolean expectedResult = true;

        boolean result = testee.isScalene(triangle);
        assertEquals(expectedResult, result);
    }

    @Test
    public void isScalene_oneSideIsCero_false(){
        double side1 = 2;
        double side2 = 0;
        double side3 = 5;

        Triangle triangle = new Triangle(side1, side2, side3);
        boolean expectedResult = false;

        boolean result = testee.isScalene(triangle);
        assertEquals(expectedResult, result);
    }

    @Test
    public void isScalene_oneSideIsBelowCero_false(){
        double side1 = 2;
        double side2 = -3;
        double side3 = 5;

        Triangle triangle = new Triangle(side1, side2, side3);
        boolean expectedResult = false;

        boolean result = testee.isScalene(triangle);
        assertEquals(expectedResult, result);
    }

    @Test
    public void isScalene_oneSideIsCeroAndOneSideIsBelowCero_false(){
        double side1 = -3;
        double side2 = 0;
        double side3 = 5;

        Triangle triangle = new Triangle(side1, side2, side3);
        boolean expectedResult = false;

        boolean result = testee.isScalene(triangle);
        assertEquals(expectedResult, result);
    }

    @Test
    public void isScalene_oneSideIsDecimal_true(){
        double side1 = 2;
        double side2 = 6.1;
        double side3 = 5;

        Triangle triangle = new Triangle(side1, side2, side3);
        boolean expectedResult = true;

        boolean result = testee.isScalene(triangle);
        assertEquals(expectedResult, result);
    }
}
