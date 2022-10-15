package exercises.e20;

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
