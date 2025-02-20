package heig.main.ShapeType;

import heig.main.Renderer;
import heig.main.Renderers.BorderRenderer;

import java.awt.*;

/**
 * A border square
 */
public class BorderSquare extends Square {
    public BorderSquare(Point pos, int side) {
        super(pos, side);
    }

    /**
     * Get the color of the square
     *
     * @return The color of the square
     */
    @Override
    public Color getColor() {
        return Color.RED;
    }

    /**
     * Get the renderer of the square
     *
     * @return The renderer of the square
     */
    @Override
    protected Renderer getRenderer() {
        return BorderRenderer.getInstance();
    }
}
