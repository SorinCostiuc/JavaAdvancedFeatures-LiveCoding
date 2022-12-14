package exercises.e9and10and11;

import java.util.List;

public class Circle implements Movable, Resizable {
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
        return List.of(new Point2D(point.getY(), -1 * point.getX()),
                new Point2D(-1 * point.getX(), -1 * point.getY()),
                new Point2D(-1 * point.getY(), point.getX()));
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        MoveDirection newMoveDirection = new MoveDirection(point.getX() + moveDirection.getX(), point.getY() + moveDirection.getY());
        point.move(newMoveDirection);
    }

    @Override
    public void resize(double resizeFactor) {
        MoveDirection newPointDirection = new MoveDirection(point.getX() * resizeFactor, point.getY() * resizeFactor);
        point.move(newPointDirection);
    }
}
