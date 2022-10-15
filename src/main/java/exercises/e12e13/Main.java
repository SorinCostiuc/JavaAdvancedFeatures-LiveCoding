package exercises.e12e13;

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
                .yearOfEstablishment(1927)
                .build();

        Manufacturer manufacturer2 = Manufacturer.builder()
                .name("Audi")
                .country("Germany")
                .yearOfEstablishment(1909)
                .build();

        Manufacturer manufacturer3 = Manufacturer.builder()
                .name("Renault")
                .country("France")
                .yearOfEstablishment(1998)
                .build();

        Car car1 = Car.builder()
                .name("VAG")
                .model("A6")
                .price(20000)
                .yearOfManufacture(2014)
                .engineType(EngineType.V12)
                .manufacturerList(List.of(manufacturer2))
                .build();

        Car car2 = Car.builder()
                .name("Hatchback")
                .model("v40")
                .price(23000)
                .yearOfManufacture(1899)
                .engineType(EngineType.V8)
                .manufacturerList(List.of(manufacturer1, manufacturer2))
                .build();

        Car car3 = Car.builder()
                .name("Dacia")
                .model("Spring")
                .price(13000)
                .yearOfManufacture(2013)
                .engineType(EngineType.S3)
                .manufacturerList(List.of(manufacturer1, manufacturer2, manufacturer3))
                .build();

        CarService carService = new CarService();
        carService.addCars(List.of(car1, car2, car3));

        System.out.println("----------" + " All cars " + "----------");
        System.out.println(carService.getAllCars());
        System.out.println("----------" + " V12 cars " + "----------");
        System.out.println(carService.getV12Cars());
        System.out.println("----------" + " Manufacturer year before 1999 " + "----------");
        System.out.println(carService.getManufacturerYearBefore1999());
        System.out.println("----------" + " Most Expensive car " + "----------");
        System.out.println(carService.getMostExpensiveCar());
        System.out.println("----------" + " Cheapest car " + "----------");
        System.out.println(carService.getCheapestCar());
        System.out.println("----------" + " Car with at least 3 manufacturers " + "----------");
        System.out.println(carService.getCarWithAtLeastThreeManufacturers());
        System.out.println("----------" + " Sorted cars descending " + "----------");
        System.out.println(carService.getSortedCars(SortOrder.DESCENDING));
        System.out.println("----------" + " Sorted cars ascending " + "----------");
        System.out.println(carService.getSortedCars(SortOrder.ASCENDING));
        System.out.println("----------" + " Check if car is in service " + "----------");
        System.out.println(carService.isCarInService("v40"));
        System.out.println("----------" + " Cars manufactured by " + "----------");
        System.out.println(carService.getCarsManufacturedBy(manufacturer3));
        System.out.println("----------" + " Cars manufacturer year " + "----------");
        System.out.println(carService.getCarsManufacturedByACertainYear((year) -> year != 1909));
    }
}
