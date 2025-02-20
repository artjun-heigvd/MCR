package heig.main;

import java.awt.*;

/**
 * Interface Displayer
 * Used to display the frame and the panel in it
 *
 * @author Junod Arthur
 * @author Häffner Edwin
 * @version 1.0
 * @since 2024-03-14
 */
public interface Displayer {
    int getWidth();

    int getHeight();

    Graphics2D getGraphics();

    void repaint();

    void setTitle(String title);
}
