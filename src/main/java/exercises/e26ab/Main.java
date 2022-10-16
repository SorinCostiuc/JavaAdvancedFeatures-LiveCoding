package exercises.e26ab;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Using functional programming mechanisms based on the given structure, display:
1. a list of all Models,
2. a list of all cars,
3. list of all manufacturer names,
4. list of all manufacturers' establishment years,
5. list of all model names,
6. list of all years of starting production of models,
7. list of all car names,
8. list of all car descriptions,
9. only models with an even year of production start,
10. only cars from manufacturers with an even year of foundation,
11. only cars with an even year of starting production of the model and an odd year of establishing the
manufacturer,
12. only CABRIO cars with an odd year of starting model production and an even year of establishing the
manufacturer,
13. only cars of the SEDAN type from a model newer than 2019 and the manufacturer's founding year less than
1919
         */
        Car car1 = Car.builder()
                .name("A6")
                .carType(CarType.SEDAN)
                .description("Quattro")
                .build();
        Car car2 = Car.builder()
                .name("V40")
                .carType(CarType.HATCHBACK)
                .description("Sport")
                .build();
        Car car3 = Car.builder()
                .name("CLS")
                .carType(CarType.CABRIO)
                .description("2 seats")
                .build();
        Car car4 = Car.builder()
                .name("Phaeton")
                .carType(CarType.COUPE)
                .description("Elegant")
                .build();


        Model m1 = Model.builder()
                .name("Audi")
                .productionStartYear(2021)
                .cars(List.of(car1))
                .build();
        Model m2 = Model.builder()
                .name("VW")
                .productionStartYear(2008)
                .cars(List.of(car2))
                .build();
        Model m3 = Model.builder()
                .name("Mercedes")
                .productionStartYear(2015)
                .cars(List.of(car3))
                .build();
        Model m4 = Model.builder()
                .name("Volvo")
                .productionStartYear(2012)
                .cars(List.of(car4))
                .build();

        Manufacturer manufacturer1 = Manufacturer.builder()
                .name("VAG")
                .yearOfCreation(1906)
                .models(List.of(m1, m2))
                .build();
        Manufacturer manufacturer2 = Manufacturer.builder()
                .name("Daimler")
                .yearOfCreation(1886)
                .models(List.of(m3))
                .build();
        Manufacturer manufacturer3 = Manufacturer.builder()
                .name("VOLVO")
                .yearOfCreation(1923)
                .models(List.of(m4))
                .build();

        Dealership dealership = new Dealership(List.of(manufacturer1, manufacturer2, manufacturer3));
        System.out.println("-------------------" + " Get all models " + "-------------------");
        System.out.println(dealership.getAllModels());
        System.out.println("-------------------" + " Get all cars " + "-------------------");
        System.out.println(dealership.getAllCars());
        System.out.println("-------------------" + " Get all manufacturers name " + "-------------------");
        System.out.println(dealership.getAllManufacturerName());
        System.out.println("-------------------" + " Get all manufacturers establishment year " + "-------------------");
        System.out.println(dealership.getAllManufacturerEstablishmentYear());
        System.out.println("-------------------" + " Get all models name " + "-------------------");
        System.out.println(dealership.getAllModelsName());
        System.out.println("-------------------" + " Get all models starting production year " + "-------------------");
        System.out.println(dealership.getYearOfStartingProductionModels());
        System.out.println("-------------------" + " Get all cars name " + "-------------------");
        System.out.println(dealership.getAllCarsName());
        System.out.println("-------------------" + " Get all cars description " + "-------------------");
        System.out.println(dealership.getAllCarsDescription());
        System.out.println("-------------------" + " Get all models with even production start year " + "-------------------");
        System.out.println(dealership.getModelsWithEvenProductionStartYear());
        System.out.println("-------------------" + " Get all cars with manufacturers that have an even year of establishment " + "-------------------");
        System.out.println(dealership.getCarsWithEvenYearManufacturerFoundation());
        System.out.println("-------------------" + " Get all cars with even starting production year and odd etablisment manufacturer year " + "-------------------");
        System.out.println(dealership.getCarsWithEvenStartingProductionYearAndOddEstablishingManufacturerYear());
        System.out.println("-------------------" + " Get all cabrio cars with odd starting production year and even etablisment manufacturer year " + "-------------------");
        System.out.println(dealership.getCabrioCarsWithOddStartingProductionYearAndEvenEstablishingManufacturerYear());
        System.out.println("-------------------" + " Get all sedan cars from a model newer than 2019 and the manufacturer's founding year less than 1919 " + "-------------------");
        System.out.println(dealership.getSedanCarsWithModelNewerThan2019AndManufacturerOlderThan1919());
    }
}
