package heig.main.FactoryType;

import heig.main.Bounceable;
import heig.main.ShapeFactory;
import heig.main.ShapeType.BorderCircle;
import heig.main.ShapeType.BorderSquare;

import java.awt.*;

/**
 * Factory for creating shapes with only a border
 *
 * @author Junod Arthur
 * @author Häffner Edwin
 * @version 1.0
 * @since 2024-03-14
 */
public class BorderShapeFactory implements ShapeFactory {

    private static BorderShapeFactory instance;

    /**
     * Private constructor to use with the singleton model.
     */
    private BorderShapeFactory() {
    }

    /**
     * The function that allow us to access the instance of BorderShapeFactory.
     *
     * @return A new instance if there isn't already one or the existing one.
     */
    public static BorderShapeFactory getInstance() {
        if (instance == null) {
            instance = new BorderShapeFactory();
        }
        return instance;
    }

    /**
     * Create a border circle at the given pos with the given size.
     *
     * @param pos  Position of the circle
     * @param size Size of the circle
     * @return A new border circle
     */
    @Override
    public Bounceable createCircle(Point pos, int size) {
        return new BorderCircle(pos, size);
    }

    /**
     * Create a border square at the given pos with the given size.
     *
     * @param pos  Position of the square
     * @param size Size of the square
     * @return A new border square
     */
    @Override
    public Bounceable createSquare(Point pos, int size) {
        return new BorderSquare(pos, size);
    }
}
