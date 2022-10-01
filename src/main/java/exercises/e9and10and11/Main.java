package exercises.e9and10and11;

public class Main {
    public static void main(String[] args) {
//       E9
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
//        E10
                /*
        Create a MoveDirection class with fields double x, double y as well as getters, setters and constructor.
Create a Movable interface with the move(MoveDirection moveDirection) method.
    Implement the interface in the classes from the previous task (Point2D and Circle). When the
move(MoveDirection moveDirection) method is called, the objects are to change their position based on
the provided direction (MoveDirection).
    Validate the offset by calling the other Circle methods
         */
//        E11
        /*
        Create a Resizable interface with the resize(double resizeFactor) method.
Implement the interface in the class from the previous task (Circle). When calling the resize(double
resizeFactor) method, the circle should change its size by a given factor (1.5, 0.5, 10.0, etc.).
Validate the resizing by calling the other Circle methods
         */
//E9
        Point2D centerPoint = new Point2D(0, 0);
        Point2D circlePoint = new Point2D(3, 6);
        Circle circle = new Circle(centerPoint, circlePoint);
        System.out.printf("Circle's radius is: %.2f \n", circle.getRadius());
        System.out.printf("Circle's perimeter is: %.2f \n", circle.getPerimeter());
        System.out.printf("Circle's area is: %.2f \n", circle.getArea());
        System.out.println("Circle's slices are: " + circle.getSlicePoints());
        System.out.println("----------");
//E10
        circle.move(new MoveDirection(2, 3));
//        except slice points, all should be the same
        System.out.printf("Circle's radius is: %.2f \n", circle.getRadius());
        System.out.printf("Circle's perimeter is: %.2f \n", circle.getPerimeter());
        System.out.printf("Circle's area is: %.2f \n", circle.getArea());
        System.out.println("Circle's slices are: " + circle.getSlicePoints());

        System.out.println("----------");
//E11
        circle.resize(2.0f);
        System.out.printf("Circle's radius is: %.2f \n", circle.getRadius());
        System.out.printf("Circle's perimeter is: %.2f \n", circle.getPerimeter());
        System.out.printf("Circle's area is: %.2f \n", circle.getArea());
        System.out.println("Circle's slices are: " + circle.getSlicePoints());
    }
}
