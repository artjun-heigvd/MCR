package heig.main;

import java.awt.*;

/**
 * Abstract class BounceableObject
 * Used by the shapes that can bounce (boioioing)
 *
 * @author Junod Arthur
 * @author Häffner Edwin
 * @version 1.0
 * @since 2024-03-14
 */
public abstract class BounceableObject implements Bounceable {
    private final static int SPEED_MULTIPLIER = 10;
    protected Point pos;
    private final Point direction;
    private int maxWidth;
    private int maxHeight;

    protected BounceableObject(Point pos) {
        this.pos = pos;

        //We add 1 to avoid having a speed of 0
        direction = new Point((int) (Math.random() * SPEED_MULTIPLIER) + 1,
                           (int) (Math.random() * SPEED_MULTIPLIER) + 1);
        maxWidth = ShapeDisplay.getInstance().getWidth();
        maxHeight = ShapeDisplay.getInstance().getHeight();
    }

    /**
     * Draw the object using the renderer returned by getRenderer
     */
    @Override
    public void draw() {
        getRenderer().display(ShapeDisplay.getInstance().getGraphics(), this);
    }

    /**
     * Move the object within the window, bouncing if we reach the limits and keeping the object
     * inside the window if it is resized
     */
    @Override
    public void move() {
        maxWidth = ShapeDisplay.getInstance().getWidth();
        maxHeight = ShapeDisplay.getInstance().getHeight();

        //Bounce logic
        bounceLimits();
        bounceResize();

        // Move the object
        pos.x += direction.x;
        pos.y += direction.y;
    }

    /**
     * Bounce the object if it reaches the limits of the window
     */
    private void bounceLimits() {
        if (pos.x + direction.x < 0 || pos.x + getWidth() + direction.x >= maxWidth) {
            direction.x = -direction.x;
        }
        if (pos.y + direction.y < 0 || pos.y + getHeight() + direction.y >= maxHeight) {
            direction.y = -direction.y;
        }
    }

    /**
     * If the window is resized, moves the object back into the window
     */
    private void bounceResize() {
        //Checking x position
        if (pos.x + getWidth() > maxWidth) {
            pos.x = (int) (maxWidth - getWidth());
            direction.x = -Math.abs(direction.x);
        }
        if (pos.x < 0) {
            pos.x = 0;
            direction.x = Math.abs(direction.x);
        }
        //Checking y position
        if (pos.y + getHeight() > maxHeight) {
            pos.y = (int) (maxHeight - getHeight());
            direction.y = -Math.abs(direction.y);
        }
        if (pos.y < 0) {
            pos.y = 0;
            direction.y = Math.abs(direction.y);
        }
    }

    public abstract Color getColor();

    public abstract Shape getShape();

    protected abstract Renderer getRenderer();
}