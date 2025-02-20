package heig.main;

import java.awt.*;

/**
 * Interface Bounceable
 * Used by the shapes that can bounce (boioioing)
 *
 * @author Junod Arthur
 * @author Häffner Edwin
 * @version 1.0
 * @since 2024-03-14
 */
public interface Bounceable {
    void draw();

    void move();

    Color getColor();

    Shape getShape();

    double getWidth();

    double getHeight();

}
