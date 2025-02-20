package heig.main;

import java.awt.*;

/**
 * Interface Renderer
 * Used to render the shapes
 *
 * @author Junod Arthur
 * @author Häffner Edwin
 * @version 1.0
 * @since 2024-03-14
 */
public interface Renderer {
    void display(Graphics2D g, Bounceable b);
}
