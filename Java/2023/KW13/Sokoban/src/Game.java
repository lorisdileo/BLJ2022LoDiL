import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.System.exit;

public class Game {

    private int[][] gameField;
    private List<int[]> greenFields = new ArrayList<>();
    int currentX = 0;
    int currentY = 0;

    int oldValue = 0;

    public Game() {
        gameField = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 0, 0},
                {0, 1, 4, 2, 3, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0, 3, 4, 1, 0, 0},
                {0, 1, 4, 1, 1, 3, 0, 1, 0, 0},
                {0, 1, 0, 1, 0, 4, 0, 1, 1, 0},
                {0, 1, 3, 0, 3, 3, 3, 4, 1, 0},
                {0, 1, 0, 0, 0, 4, 0, 0, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[0].length; j++) {
                if (gameField[i][j] == 4) {
                    greenFields.add(new int[] {i, j});
                }
            }
        }
    }

    public int currentPositionX() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (gameField[i][j] == 2) {
                    currentX = i;
                }
            }
        }
        return currentX;
    }

    public int currentPositionY() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (gameField[i][j] == 2) {
                    currentY = j;
                }
            }
        }
        return currentY;
    }

    public void moveUp() {
        currentPositionX();
        currentPositionY();

        if (gameField[currentX - 1][currentY] == 1 | (gameField[currentX - 1][currentY] == 3 & (gameField[currentX - 2][currentY] == 1 | gameField[currentX - 2][currentY] == 3))) {
            System.out.println("You can't move up");
        } else {

            boolean isNotGreen = true;

            for (int[] field : greenFields) {
                if (field[0] == currentX && field[1] == currentY) {
                    gameField[currentX][currentY] = 4;
                    isNotGreen = false;
                    break;
                }
            }

            if (isNotGreen) {
                gameField[currentX][currentY] = 0;
            }

            if (gameField[currentX - 1][currentY] == 3) {
                gameField[currentX - 2][currentY] = 3;
            }

            gameField[currentX - 1][currentY] = 2;

            System.out.println("UP");
        }
    }


    public void moveDown() {
        currentPositionX();
        currentPositionY();

        if (gameField[currentX + 1][currentY] == 1 | (gameField[currentX + 1][currentY] == 3 & (gameField[currentX + 2][currentY] == 1 | gameField[currentX + 2][currentY] == 3))) {
            System.out.println("You can't move down");
        } else {

            boolean isNotGreen = true;

            for (int[] field : greenFields) {
                if (field[0] == currentX && field[1] == currentY) {
                    gameField[currentX][currentY] = 4;
                    isNotGreen = false;
                    break;
                }
            }

            if (isNotGreen) {
                gameField[currentX][currentY] = 0;
            }

            if (gameField[currentX + 1][currentY] == 3) {
                gameField[currentX + 2][currentY] = 3;
            }

            gameField[currentX + 1][currentY] = 2;

            System.out.println("DOWN");
        }
    }


    public void moveLeft() {
        currentPositionX();
        currentPositionY();

        if (gameField[currentX][currentY - 1] == 1 | (gameField[currentX][currentY - 1] == 3 & (gameField[currentX][currentY - 2] == 1 | gameField[currentX][currentY - 2] == 3))) {
            System.out.println("You can't move left");
        } else {
            boolean isNotGreen = true;

            for (int[] field : greenFields) {
                if (field[0] == currentX && field[1] == currentY) {
                    gameField[currentX][currentY] = 4;
                    isNotGreen = false;
                    break;
                }
            }

            if (isNotGreen) {
                gameField[currentX][currentY] = 0;
            }

            if (gameField[currentX][currentY - 1] == 3) {
                gameField[currentX][currentY - 2] = 3;
            }

            gameField[currentX][currentY - 1] = 2;
            System.out.println("LEFT");
        }
    }


    public void moveRight() {
        currentPositionX();
        currentPositionY();

        if (gameField[currentX][currentY + 1] == 1 | (gameField[currentX][currentY + 1] == 3 & (gameField[currentX][currentY + 2] == 1 | gameField[currentX][currentY + 2] == 3))) {
            System.out.println("You can't move right");
        } else {
            boolean isNotGreen = true;

            for (int[] field : greenFields) {
                if (field[0] == currentX && field[1] == currentY) {
                    gameField[currentX][currentY] = 4;
                    isNotGreen = false;
                    break;
                }
            }

            if (isNotGreen) {
                gameField[currentX][currentY] = 0;
            }

            if (gameField[currentX][currentY + 1] == 3) {
                gameField[currentX][currentY + 2] = 3;
            }

            gameField[currentX][currentY + 1] = 2;
            System.out.println("RIGHT");
        }
    }

    public void hasWon() {

        boolean allIsGreen = true;

        for (int[] greenField : greenFields) {
            if (gameField[greenField[0]][greenField[1]] != 3) {
                allIsGreen = false;
            }
        }

        if (allIsGreen) {
            System.out.println("You won!");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            exit(0);
        }
    }


    public void escAction() {
        System.out.println("ESC");
    }

    public int[][] getField() {
        return gameField;
    }

    public List<int[]> getGreenFields() {
        return greenFields;
    }

    public int getColCount() {
        return gameField.length;
    }

    public int getRowCount() {
        return gameField[0].length;
    }
}

