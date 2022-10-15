package exercises.e20;

public class Main {
    public static void main(String[] args) {
        /*
        Create an abstract Shape class with the abstract methods calculatePerimeter() for calculating the
perimeter and calculateArea() for calculating the area.
Create Rectangle, Triangle, Hexagon classes, extending the Shape class, and implementing abstract
methods accordingly. Verify the solution correctness.
         */
        Shape hexagon = new Hexagon(2);
        System.out.println(hexagon.calculateArea());
        System.out.println(hexagon.calculatePerimeter());
        System.out.println("----------");

        Shape triangle = new Triangle(2, 3);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());
        System.out.println("----------");

        Shape rectangle = new Rectangle(4, 3);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println("----------");
    }
}
