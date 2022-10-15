package exercises.e20e21;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle extends Shape {
    private int longSide;
    private int shortSide;

    @Override
    int calculatePerimeter() {
        return 2 * (longSide + shortSide);
    }

    @Override
    int calculateArea() {
        return longSide * shortSide;
    }
}
