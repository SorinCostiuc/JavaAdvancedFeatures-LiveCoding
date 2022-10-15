package exercises.e20e21;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cone extends ThreeDShape {
    private int radius;
    private int height;

    @Override
    int calculatePerimeter() {
        return radius;
    }

    @Override
    int calculateArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    double calculateVolume() {
        return 1 / 3d * Math.PI * radius * radius * height;
    }
}
