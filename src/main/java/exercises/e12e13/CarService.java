package exercises.e12e13;
/*
Create a CarService class that will contain a list of cars and implement the methods.
1. adding cars to the list,
2. removing a car from the list,
3. returning a list of all cars,
4. returning cars with a V12 engine,
5. returning cars produced before 1999,
6. returning the most expensive car,
7. returning the cheapest car,
8. returning the car with at least 3 manufacturers,
9. returning a list of all cars sorted according to the passed parameter: ascending / descending,
10. checking if a specific car is on the list,
11. returning a list of cars manufactured by a specific manufacturer,
12. returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =,=,! = from the given.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarService {
    List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
    }

    public void addCars(List<Car> cars) {
        this.cars.addAll(cars);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getV12Cars() {
        return cars.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .collect(Collectors.toList());
    }

    public List<Car> getManufacturerYearBefore1999() {
        return cars.stream()
                .filter(car -> car.getYearOfManufacture() < 1999)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparingInt(Car::getPrice))
                .get();
    }

    public Car getCheapestCar() {
        return cars.stream()
                .min(Comparator.comparingInt(Car::getPrice))
                .get();
    }

    public Car getCarWithAtLeastThreeManufacturers() {
        return cars.stream()
                .filter(car -> car.getManufacturerList().size() > 2)
                .findFirst()
                .get();
    }

    public List<String> getSortedCars(SortOrder sortOrder) {
        AtomicReference<Double> sortSignX = new AtomicReference<>(sortOrder.name().length() - 9.5);
        // we can use instead of using IF and lambda: we decrease the ENUM value by 9.5 to get 1 or -1

        return cars.stream()
                .sorted((car1, car2) -> (int) ((car1.getYearOfManufacture() - car2.getYearOfManufacture()) * sortSignX.get()))
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    public boolean isCarInService(String model) {
        return cars.stream()
                .anyMatch(car -> car.getModel().equals(model));
    }

    public List<Car> getCarsManufacturedBy(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturerList().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsManufacturedByACertainYear(Predicate<Integer> predicate) {
        return cars.stream()
                .filter(car -> car.getManufacturerList().stream()
                        .map(Manufacturer::getYearOfEstablishment)
                        .anyMatch(predicate))
                .collect(Collectors.toList());
    }
}
