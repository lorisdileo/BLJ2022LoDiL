package ch.noseryoung.game;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a snake for the Snake game. The body of the Snake is
 * saved as Points in an ArrayList.
 */
public class Snake {
    private List<Point> snake;

    /**
     * Creates a Snake with the length 1 at the given starting coordinates.
     *
     * @param x x-Coordinate of the Snake
     * @param y y-Coordinate of the Snake
     */
    public Snake(int x, int y) {
        this(x, y, 1);
    }

    public Snake(Point point, int length) {
        this(point.x, point.y, length);
    }

    public Snake(Point point) {
        this(point.x, point.y, 1);
    }

    public Snake(int x, int y, int length) {
        snake = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            snake.add(new Point(x, y));
        }
    }

    /**
     * Checks if the snake is on said point
     *
     * @param point the point to check for
     * @return true if the snake is on given point
     */
    public boolean isOnPoint(Point point) {
        return snake.contains(point);
    }

    /**
     * Check if the head of the snake is on said point
     *
     * @param point the point to compare to
     * @return true if the head is on the given point
     */
    public boolean isHeadOnPoint(Point point) {
        return getHead().equals(point);
    }

    public void move(Direction movingDirection) {
        moveSnake(movingDirection.getYMoveValue(), movingDirection.getXMoveValue());
    }

    private void moveSnake(int x, int y) {
        snake.add(new Point(getHead().x + x, getHead().y + y));
        snake.remove(0);
    }

    /**
     * Checks to see if the head of the snake is on the body
     *
     * @return true if the head is on the body
     */
    public boolean isHeadOnBody() {
        boolean isHeadOnBody = false;

        for (int i = 0; i < snake.size() - 2; i++) {
            isHeadOnBody |= isHeadOnPoint(snake.get(i));
        }
        return isHeadOnBody;
    }

    /**
     * grows the snake by one unit
     */
    public void grow() {
        Point tail = snake.get(0);
        snake.add(0, new Point(tail.x, tail.y));
    }

    /**
     * grows the snake by the supplied value. this functions loops for x times
     * around the {@link #grow()} function.
     *
     * @param value the amount of units the snake should grow by
     */
    public void growByValue(int value) {
        for (int x = 0; x < value; x++) {
            grow();
        }
    }

    /**
     * returns the position of the head. the returned position is the position of
     * the head.
     *
     * @return the position of the snake
     */
    public Point getPosition() {
        return getHead();
    }

    /**
     * returns the position of the head
     *
     * @return the position of the head
     */
    private Point getHead() {
        return snake.get(snake.size() - 1);
    }
}
