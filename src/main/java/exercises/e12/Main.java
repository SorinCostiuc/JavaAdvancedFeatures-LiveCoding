package exercises.e12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//E12
/*
    Create a Manufacturer class that will contain fields: name, year of establishment, country. Include all
necessary methods and constructor parameters. Implement the hashCode() and equals() methods.
    Create a Car class that will contain fields: name, model, price, year of manufacture, manufacturer list
(Manufacturer), and engine type (represented as the enum class, e.g. V12, V8, V6, S6, S4, S3). Include all
necessary methods and constructor parameters. Implement the hashcode() and equals() methods.
 */
//E13

//Create a CarService class that will contain a list of cars and implement the methods.
        Manufacturer manufacturer1 = Manufacturer.builder()
                .name("Volvo")
                .country("Sweden")
                .yearOfEstablishment("1927")
                .build();

        Manufacturer manufacturer2 = Manufacturer.builder()
                .name("Audi")
                .country("Germany")
                .yearOfEstablishment("1909")
                .build();

        Car car1 = Car.builder()
                .name("VAG")
                .model("A6")
                .price(12000)
                .yearOfManufacture(2014)
                .engineType(EngineType.V12)
                .manufacturerList(List.of(manufacturer2))
                .build();

        Car car2 = Car.builder()
                .name("Hatchback")
                .model("v40")
                .price(18000)
                .yearOfManufacture(1899)
                .engineType(EngineType.V8)
                .manufacturerList(List.of(manufacturer1, manufacturer2))
                .build();

        CarService carService = new CarService();
        carService.addCars(List.of(car1, car2));

        System.out.println(carService.getAllCars());
        System.out.println("----------");
        System.out.println(carService.getV12Cars());
        System.out.println("----------");
        System.out.println(carService.getManufacturerYearBefore1999());
        System.out.println("----------");

    }
}
