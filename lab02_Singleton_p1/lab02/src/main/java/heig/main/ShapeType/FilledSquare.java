package heig.main.ShapeType;

import heig.main.Renderer;
import heig.main.Renderers.FilledRenderer;

import java.awt.*;

/**
 * A filled square.
 *
 * @author Junod Arthur
 * @author Häffner Edwin
 * @version 1.0
 * @since 2024-03-14
 */
public class FilledSquare extends Square {

    public FilledSquare(Point pos, int side) {
        super(pos, side);
    }

    /**
     * Get the color of the square
     *
     * @return The color of the square
     */
    @Override
    public Color getColor() {
        return Color.YELLOW;
    }

    /**
     * Get the renderer of the square
     *
     * @return The renderer of the square
     */
    @Override
    protected Renderer getRenderer() {
        return FilledRenderer.getInstance();
    }
}
