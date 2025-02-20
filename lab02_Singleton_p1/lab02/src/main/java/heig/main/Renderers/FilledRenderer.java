package heig.main.Renderers;

import heig.main.Bounceable;
import heig.main.Renderer;

import java.awt.*;

/**
 * The renderer for the filled shapes.
 *
 * @author Junod Arthur
 * @author Häffner Edwin
 * @version 1.0
 * @since 2024-03-14
 */
public class FilledRenderer implements Renderer {


    private static FilledRenderer instance = null;

    private FilledRenderer() {
    }

    /**
     * The function that allow us to access the instance of FilledRenderer.
     *
     * @return A new instance if there isn't already one or the existing one.
     */
    public static FilledRenderer getInstance() {
        if (instance == null) {
            instance = new FilledRenderer();
        }
        return instance;
    }

    /**
     * Display the shape filled with its color.
     *
     * @param g The graphics object
     * @param b The shape to display
     */
    @Override
    public void display(Graphics2D g, Bounceable b) {
        g.setColor(b.getColor());
        g.fill(b.getShape());
    }
}
