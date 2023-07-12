import org.example.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {
    private int[][] testField;
    private Game gameTestee;

    @BeforeEach
    void setUp() {
        gameTestee = new Game();
    }


    @Test
    void goRight_Loris_true() {
        gameTestee.setGameField(new int[][]{{2, 0, 0}});
        gameTestee.moveRight();
        int[][] expectedField = new int[][]{{0, 2, 0}};
        boolean result = Arrays.deepEquals(gameTestee.getField(), expectedField);
        assertTrue(result);
    }


    @Test
    void goRightInWall_Loris_true() {
        gameTestee.setGameField(new int[][]{{2, 1, 0}});
        gameTestee.moveRight();
        int[][] expectedField = new int[][]{{2, 1, 0}};
        boolean result = Arrays.deepEquals(gameTestee.getField(), expectedField);
        assertTrue(result);
    }

    @Test
    void goRightInGreen_Loris_true() {
        gameTestee.setGameField(new int[][]{{2, 4, 0}});
        gameTestee.moveRight();
        int[][] expectedField = new int[][]{{0, 2, 0}};
        boolean result = Arrays.deepEquals(gameTestee.getField(), expectedField);
        assertTrue(result);
    }

    @Test
    void goTwoRightInGreen_Loris_true() {
        gameTestee.setGameField(new int[][]{{2, 4, 0, 0}});
        gameTestee.moveRight();
        gameTestee.moveRight();
        int[][] expectedField = new int[][]{{0, 4, 2, 0}};
        boolean result = Arrays.deepEquals(gameTestee.getField(), expectedField);
        assertTrue(result);
    }

    @Test
    void moveBoxToRight_Loris_true() {
        gameTestee.setGameField(new int[][]{{2, 3, 0}});
        gameTestee.moveRight();
        int[][] expectedField = new int[][]{{0, 2, 3}};
        boolean result = Arrays.deepEquals(gameTestee.getField(), expectedField);
        assertTrue(result);
    }

    @Test
    void moveTwoBoxes_Loris_true() {
        gameTestee.setGameField(new int[][]{{2, 3, 3}});
        gameTestee.moveRight();
        int[][] expectedField = new int[][]{{2, 3, 3}};
        boolean result = Arrays.deepEquals(gameTestee.getField(), expectedField);
        assertTrue(result);
    }

    @Test
    void moveBoxToRightInWall_Loris_true() {
        gameTestee.setGameField(new int[][]{{2, 3, 1}});
        gameTestee.moveRight();
        int[][] expectedField = new int[][]{{2, 3, 1}};
        boolean result = Arrays.deepEquals(gameTestee.getField(), expectedField);
        assertTrue(result);
    }

    @Test
    void moveRightBoxInGreen_Loris_true() {
        gameTestee.setGameField(new int[][]{{2, 3, 4}});
        gameTestee.moveRight();
        int[][] expectedField = new int[][]{{0, 2, 3}};
        boolean result = Arrays.deepEquals(gameTestee.getField(), expectedField);
        assertTrue(result);
    }
}
