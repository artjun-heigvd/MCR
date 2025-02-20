package heig.main.ShapeType;

import heig.main.BounceableObject;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Circle class
 * Abstract class for the circle shape
 *
 * @author Junod Arthur
 * @author Häffner Edwin
 * @version 1.0
 * @since 2024-03-14
 */
public abstract class Circle extends BounceableObject {
    private final double diameter;

    public Circle(Point pos, double diameter) {
        super(pos);
        this.diameter = diameter;
    }

    /**
     * Get a shape object of this Circle
     *
     * @return Shape
     */
    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(pos.x, pos.y, diameter, diameter);
    }


    public double getWidth() {
        return diameter;
    }

    public double getHeight() {
        return diameter;
    }
}