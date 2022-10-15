package exercises.e20e21;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangle extends Shape {
    private int side;
    private int high;

    @Override
    int calculatePerimeter() {
        return side * 3;
    }

    @Override
    int calculateArea() {
        return side * high / 2;
    }
}
