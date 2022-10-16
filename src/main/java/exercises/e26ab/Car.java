package exercises.e26ab;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class Car {
    private String name;
    private String description;
    private CarType carType;

    public Car(String name, String description, CarType carType) {
        this.name = name;
        this.description = description;
        this.carType = carType;
    }
}