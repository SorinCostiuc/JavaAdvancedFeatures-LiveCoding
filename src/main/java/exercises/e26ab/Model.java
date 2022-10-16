package exercises.e26ab;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
class Model {
    private String name;
    private int productionStartYear;
    List<Car> cars;

    public Model(String name, int productionStartYear, List<Car> cars) {
        this.name = name;
        this.productionStartYear = productionStartYear;
        this.cars = cars;
    }
}