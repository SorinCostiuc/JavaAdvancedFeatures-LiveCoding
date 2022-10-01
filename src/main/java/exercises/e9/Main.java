package exercises.e9;

public class Main {
    public static void main(String[] args) {
       /*
       Create a Point2D class with fields double x, double y, getters, setters and constructor. Then create a Circle
class that will have a constructor:
        Circle(Point2D center, Point2D point)
The first parameter specifies the center of the circle, the second is any point on the circle. Based on these
points, the Circle class is to determine:
        • circle radius when calling double getRadius() method
        • circle circumference when calling double getPerimeter() method
        • circle area when calling double getArea() method
        • * (challenging) three points on the circle every 90 degrees from the point given when calling the
List<Point2D> getSlicePoints() method
        */
        Point2D centerPoint = new Point2D(0, 0);
        Point2D circlePoint = new Point2D(3, 6);
        Circle circle = new Circle(centerPoint, circlePoint);
        System.out.printf("Circle's radius is: %.2f \n", circle.getRadius());
        System.out.printf("Circle's perimeter is: %.2f \n", circle.getPerimeter());
        System.out.printf("Circle's area is: %.2f \n", circle.getArea());
        System.out.println("Circle's slices are: " + circle.getSlicePoints());
    }
}