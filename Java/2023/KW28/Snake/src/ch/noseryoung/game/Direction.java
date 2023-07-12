package ch.noseryoung.game;

/**
 * This enum defines the moving directions of the snake.
 */
public enum Direction {
    DOWN(0, 1), LEFT(-1, 0), RIGHT(1, 0), UP(0, -1);

    private int xMoveValue;
    private int yMoveValue;

    /**
     * This constructor makes sure that all directions are supplied with the
     * movement values.
     *
     * @param xMoveValue the value to move in the x direction
     * @param yMoveValue the value to move in the y direction
     */
    Direction(int xMoveValue, int yMoveValue) {
        this.xMoveValue = xMoveValue;
        this.yMoveValue = yMoveValue;
    }

    public Direction opposite() {
        return switch (this) {
            case UP -> DOWN;
            case DOWN -> UP;
            case RIGHT -> LEFT;
            case LEFT -> RIGHT;
        };
    }

    /**
     * @return returns the value for the movement in the x direction
     */
    public int getXMoveValue() {
        return xMoveValue;
    }

    /**
     * @return returns the value for the movement in the y direction
     */
    public int getYMoveValue() {
        return yMoveValue;
    }

}
