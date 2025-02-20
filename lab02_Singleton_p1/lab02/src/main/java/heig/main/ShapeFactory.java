package heig.main;

import java.awt.*;

/**
 * Abstract class ShapeFactory
 * Used to create shapes
 *
 * @author Junod Arthur
 * @author Häffner Edwin
 * @version 1.0
 * @since 2024-03-14
 */
public interface ShapeFactory {
    Bounceable createCircle(Point pos, int size);

    Bounceable createSquare(Point pos, int size);
}
