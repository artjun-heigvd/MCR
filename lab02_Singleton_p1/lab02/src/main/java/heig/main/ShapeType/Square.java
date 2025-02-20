package heig.main.ShapeType;

import heig.main.BounceableObject;

import java.awt.*;

/**
 * Class Square
 * Abstract class for the square shape
 *
 * @author Junod Arthur
 * @author Häffner Edwin
 * @version 1.0
 * @since 2024-03-14
 */
public abstract class Square extends BounceableObject {
    private final int side;

    public Square(Point pos, int side) {
        super(pos);
        this.side = side;
    }

    /**
     * Get a shape object of this square
     *
     * @return Shape
     */
    @Override
    public Shape getShape() {
        return new Rectangle(pos.x, pos.y, side, side);
    }

    /**
     * Get the width of the square
     *
     * @return double
     */
    public double getHeight() {
        return side;
    }

    /**
     * Get the height of the square
     *
     * @return double
     */
    public double getWidth() {
        return side;
    }
}