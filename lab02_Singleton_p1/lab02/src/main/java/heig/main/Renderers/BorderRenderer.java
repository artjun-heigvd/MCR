package heig.main.Renderers;

import heig.main.Bounceable;
import heig.main.Renderer;

import java.awt.*;

/**
 * The renderer for the border shapes.
 *
 * @author Junod Arthur
 * @author Häffner Edwin
 * @version 1.0
 * @since 2024-03-14
 */
public class BorderRenderer implements Renderer {

    private static final int STROKE_WIDTH = 2;
    private static BorderRenderer instance = null;

    private BorderRenderer() {
    }

    /**
     * The function that allow us to access the instance of BorderRenderer.
     *
     * @return A new instance if there isn't already one or the existing one.
     */
    public static BorderRenderer getInstance() {
        if (instance == null) {
            instance = new BorderRenderer();
        }
        return instance;
    }

    /**
     * Display the border of the shape with its color.
     *
     * @param g The graphics object
     * @param b The shape to display
     */
    @Override
    public void display(Graphics2D g, Bounceable b) {
        g.setColor(b.getColor());
        g.setStroke(new BasicStroke(STROKE_WIDTH));
        g.draw(b.getShape());
    }
}
