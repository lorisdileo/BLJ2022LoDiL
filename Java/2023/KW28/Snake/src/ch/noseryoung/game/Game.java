package ch.noseryoung.game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private int[][] gameField;

    private Snake snake;
    private Point door;

    private List<Point> apples;

    private Direction lastMovingDirection = Direction.UP;

    private boolean gameStateChanged;


    public Game(int width, int height, int appleCount) {
        this.gameField = new int[height][width];
        this.snake = new Snake(getRandomEmptyPointInField(), 4);
        this.door = new Point(getRandomEmptyPointInField());
        this.apples = new ArrayList<>();
        for (int x = 0; x < appleCount; x++) {
            apples.add(getRandomEmptyPointInField());
        }
        updateField();
    }

    public void moveUp() {
        updateGameState(Direction.UP);
        gameStateChanged = true;
    }

    public void moveDown() {
        updateGameState(Direction.DOWN);
        gameStateChanged = true;
    }

    public void moveLeft() {
        updateGameState(Direction.LEFT);
        gameStateChanged = true;
    }

    public void moveRight() {
        updateGameState(Direction.RIGHT);
        gameStateChanged = true;
    }

    public void escAction() {
        System.exit(0);
    }

    private void updateGameState(Direction direction) {
        if (lastMovingDirection == null) {
            lastMovingDirection = direction;
        }
        if (!direction.equals(lastMovingDirection.opposite())) {
            snake.move(direction);
            checkPositions();
            updateField();
            lastMovingDirection = direction;
        }
    }

    public boolean hasGameStateChanged() {
        return gameStateChanged;
    }

    public void resetGameStateChanged() {
        gameStateChanged = false;
    }

    private void updateField() {
        for (int col = 0; col < getColCount(); col++) {
            for (int row = 0; row < getRowCount(); row++) {
                Point p = new Point(col, row);
                gameField[p.x][p.y] = 0;
                if (snake.isHeadOnPoint(p)) {
                    gameField[p.x][p.y] = 1;
                } else if (snake.isOnPoint(p)) {
                    gameField[p.x][p.y] = 2;
                } else if (isAppleOnPosition(p)) {
                    gameField[p.x][p.y] = 3;
                } else if (apples.isEmpty() && door.equals(p)) {
                    gameField[p.x][p.y] = 4;
                }
            }
        }
    }

    /**
     * Checks if there is an apple on the given point of the field.
     *
     * @param point the point to compare to
     * @return true if given point is apple
     */
    private boolean isAppleOnPosition(Point point) {
        return !apples.isEmpty() && apples.get(0).equals(point);
    }

    /**
     * This method checks the position of the snake. It checks if the snake is on
     * an apple field and calls on the corresponding logic.
     * <p>
     * It also checks if the snake is on the door (Win condition) or if it is inside
     * itself or outside the field (lose condition) and calls the corresponding
     * logic.
     */
    private void checkPositions() {
        if (isAppleOnPosition(snake.getPosition())) {
            snake.growByValue(1);
            apples.remove(0);
        }
        if (handleLoss()) {
            JOptionPane.showMessageDialog(null, "Too bad! Better luck next time!");
            System.exit(0);
        }
        if (handleWin()) {
            JOptionPane.showMessageDialog(null, "Congratulations! You've beat the game!");
            System.exit(0);
        }
    }

    /**
     * Checks if the snake is on the door
     *
     * @return true if the snake is on the door
     */
    public boolean handleWin() {
        return apples.isEmpty() && door.equals(snake.getPosition());
    }

    /**
     * Checks if the snake is outside of the field OR on itself
     *
     * @return true if the snake is outside the field / on itself
     */
    public boolean handleLoss() {
        return snake.isHeadOnBody() || !isInBounds(snake.getPosition());
    }

    public int[][] getGameField() {
        return gameField;
    }

    public int getColCount() {
        return gameField.length;
    }

    public int getRowCount() {
        return gameField[0].length;
    }

    private Point getRandomEmptyPointInField() {
        Point point = new Point();
        for (int i = 0; i < getColCount() * getRowCount(); i++) {
            point.x = ThreadLocalRandom.current().nextInt(0, getColCount());
            point.y = ThreadLocalRandom.current().nextInt(0, getRowCount());
            if (gameField[point.x][point.y] == 0) {
                break;
            }
        }
        return point;
    }

    private boolean isInBounds(Point point) {
        return (0 <= point.x && point.x < getColCount()) && (0 <= point.y && point.y < getRowCount());
    }

    public Direction getLastMovingDirection() {
        return lastMovingDirection;
    }

    public void setLastMovingDirection(Direction lastMovingDirection) {
        this.lastMovingDirection = lastMovingDirection;
    }
}