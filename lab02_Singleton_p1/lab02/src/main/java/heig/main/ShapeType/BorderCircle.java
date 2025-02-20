package heig.main.ShapeType;

import heig.main.Renderer;
import heig.main.Renderers.BorderRenderer;

import java.awt.*;

/**
 * A border circle
 *
 * @author Junod Arthur
 * @author Häffner Edwin
 * @version 1.0
 * @since 2024-03-14
 */
public class BorderCircle extends Circle {

    public BorderCircle(Point pos, double diameter) {
        super(pos, diameter);
    }

    /**
     * Get the color of the circle
     *
     * @return The color of the circle
     */
    @Override
    public Color getColor() {
        return Color.GREEN;
    }

    /**
     * Get the renderer of the circle
     *
     * @return The renderer of the circle
     */
    @Override
    protected Renderer getRenderer() {
        return BorderRenderer.getInstance();
    }

}

