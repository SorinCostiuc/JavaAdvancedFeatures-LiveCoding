package exercises.e9;

import java.util.List;

public class Circle {
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        return Math.sqrt(Math.pow((point.getY() - center.getY()), 2) + (Math.pow((point.getX() - center.getX()), 2)));
    }

    public double getPerimeter() {
        return 2 * getRadius() * Math.PI;
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public List<Point2D> getSlicePoints() {
        return List.of(new Point2D(point.getY(), -1 * point.getX()), new Point2D(-1 * point.getX(), -1 * point.getY()), new Point2D(-1 * point.getY(), point.getX()));
    }

}
