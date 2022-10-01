package exercises.e9and10and11;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Point2D implements Movable {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void move(MoveDirection moveDirection) {
        x = moveDirection.getX();
        y = moveDirection.getY();
    }
}
