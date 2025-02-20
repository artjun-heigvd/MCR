package heig.main.FactoryType;

import heig.main.Bounceable;
import heig.main.ShapeFactory;
import heig.main.ShapeType.FilledCircle;
import heig.main.ShapeType.FilledSquare;

import java.awt.*;

/**
 * Factory for creating filled shapes
 *
 * @author Junod Arthur
 * @author Häffner Edwin
 * @version 1.0
 * @since 2024-03-14
 */
public class FilledShapeFactory implements ShapeFactory {

    private static FilledShapeFactory instance;

    /**
     * Private constructor to use with the singleton model.
     */
    private FilledShapeFactory() {
    }

    /**
     * The function that allow us to access the instance of FilledShapeFactory.
     *
     * @return A new instance if there isn't already one or the existing one.
     */
    public static FilledShapeFactory getInstance() {
        if (instance == null) {
            instance = new FilledShapeFactory();
        }
        return instance;
    }

    /**
     * Create a filled circle at the given pos with the given size.
     *
     * @param pos  Position of the circle
     * @param size Size of the circle
     * @return A new filled circle
     */
    @Override
    public Bounceable createCircle(Point pos, int size) {
        return new FilledCircle(pos, size);
    }

    /**
     * Create a filled square at the given pos with the given size.
     *
     * @param pos  Position of the square
     * @param size Size of the square
     * @return A new filled square
     */
    @Override
    public Bounceable createSquare(Point pos, int size) {
        return new FilledSquare(pos, size);
    }

}