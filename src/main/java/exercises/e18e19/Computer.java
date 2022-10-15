package exercises.e18e19;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Computer {
    private String processor;
    private int ram;
    private String graphicsCard;
    private String company;
    private String model;
}
