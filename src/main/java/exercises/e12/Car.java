package exercises.e12;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Objects;

@Setter
@Getter
@Builder

public class Car {
    private String name;
    private String model;
    private int price;
    private Integer yearOfManufacture;
    private List<Manufacturer> manufacturerList;
    private EngineType engineType;

    public Car(String name, String model, int price, Integer yearOfManufacture, List<Manufacturer> manufacturerList, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturerList = manufacturerList;
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && name.equals(car.name) && model.equals(car.model)
                && yearOfManufacture.equals(car.yearOfManufacture)
                && manufacturerList.equals(car.manufacturerList)
                && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturerList, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", manufacturerList=" + manufacturerList +
                ", engineType=" + engineType +
                '}' + "\n";
    }
}
