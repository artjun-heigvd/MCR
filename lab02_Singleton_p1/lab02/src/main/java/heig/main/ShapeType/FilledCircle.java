package heig.main.ShapeType;

import heig.main.Renderer;
import heig.main.Renderers.FilledRenderer;

import java.awt.*;

/**
 * A filled circle.
 *
 * @author Junod Arthur
 * @author Häffner Edwin
 * @version 1.0
 * @since 2024-03-14
 */
public class FilledCircle extends Circle {

    public FilledCircle(Point pos, double diameter) {
        super(pos, diameter);
    }

    /**
     * Get the color of the circle
     *
     * @return The color of the circle
     */
    @Override
    public Color getColor() {
        return Color.BLUE;
    }

    /**
     * Get the renderer of the circle
     *
     * @return The renderer of the circle
     */
    @Override
    protected Renderer getRenderer() {
        return FilledRenderer.getInstance();
    }
}
