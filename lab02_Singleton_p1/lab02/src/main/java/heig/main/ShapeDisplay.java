package heig.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferedImage;

/**
 * The class used to display our shapes (Bounceable).
 * It implements the singleton model.
 *
 * @author Junod Arthur
 * @author Häffner Edwin
 * @version 1.0
 * @since 2024-03-14
 */
public class ShapeDisplay implements Displayer {
    // Base size parameters of our JFrame
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;

    private static ShapeDisplay instance;
    private final JFrame frame = new JFrame();
    private Image image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

    /**
     * Function of the singleton model used to access the instance of our ShapeDisplay.
     *
     * @return A new instance if there's none or the existing one.
     */
    public static ShapeDisplay getInstance() {
        if (instance == null) {
            instance = new ShapeDisplay();
        }
        return instance;
    }

    /**
     * Private constructor of our class that setups our JFrame and redefine the paintComponents()
     * function of our JPanel.
     */
    private ShapeDisplay() {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(getGraphics());
                g.drawImage(image, 0, 0, this);
            }
        };

        //Frame settings
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setContentPane(panel);
        panel.setBackground(Color.WHITE);
        panel.setOpaque(false); //To not have flickering...
        frame.setResizable(true);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
    }

    /**
     * Allow us to add a key listener to the JFrame of our ShapeDisplay.
     *
     * @param keyAdapter The KeyListener to add.
     */
    public void addKeyListener(KeyAdapter keyAdapter) {
        frame.addKeyListener(keyAdapter);
    }

    /**
     * @return the width of the panel
     */
    @Override
    public int getWidth() {
        return frame.getContentPane().getWidth();
    }

    /**
     * @return the height of the panel
     */
    @Override
    public int getHeight() {
        return frame.getContentPane().getHeight();
    }

    /**
     * @return the graphics of the image to draw on
     */
    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) image.getGraphics();
    }

    /**
     * Repaints the whole frame
     */
    @Override
    public void repaint() {
        frame.repaint();
    }

    /**
     * Set the title of the frame
     *
     * @param title the title to set
     */
    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }

    /**
     * Reset the image to a new one with the right dimensions
     */
    public void resetImage() {
        image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
    }

    /**
     * Set the minimum size of the frame
     * @param width The minimum width
     * @param height The minimum height
     */
    public void setMinimumSize(int width, int height) {
        Insets insets = frame.getInsets();
        frame.setMinimumSize(new Dimension(width + insets.left + insets.right,
                                     height + insets.top + insets.bottom));
    }
}