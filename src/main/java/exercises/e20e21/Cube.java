package exercises.e20e21;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cube extends ThreeDShape {
    private int side;

    @Override
    int calculatePerimeter() {
        return side;
    }

    @Override
    int calculateArea() {
        return 6 * side * side;
    }

    @Override
    double calculateVolume() {
        return Math.pow(side, 3);
    }
}
