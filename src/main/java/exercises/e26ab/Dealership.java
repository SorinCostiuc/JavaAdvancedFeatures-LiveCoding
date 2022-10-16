package exercises.e26ab;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Data
public class Dealership {
    private List<Manufacturer> manufacturers;

    public List<Model> getAllModels() {
        return manufacturers.stream()
                .map(Manufacturer::getModels)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<Car> getAllCars() {
        return getAllModels().stream()
                .map(Model::getCars)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<String> getAllManufacturerName() {
        return manufacturers.stream()
                .map(Manufacturer::getName)
                .collect(Collectors.toList());
    }

    public List<Integer> getAllManufacturerEstablishmentYear() {
        return manufacturers.stream()
                .map(Manufacturer::getYearOfCreation)
                .collect(Collectors.toList());
    }

    public List<String> getAllModelsName() {
        return getAllModels().stream()
                .map(Model::getName)
                .collect(Collectors.toList());
    }

    public List<Integer> getYearOfStartingProductionModels() {
        return getAllModels().stream()
                .map(Model::getProductionStartYear)
                .collect(Collectors.toList());
    }

    public List<String> getAllCarsName() {
        return getAllCars().stream()
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    public List<String> getAllCarsDescription() {
        return getAllCars().stream()
                .map(Car::getDescription)
                .collect(Collectors.toList());
    }

    public List<Model> getModelsWithEvenProductionStartYear() {
        return getAllModels().stream()
                .filter(model -> model.getProductionStartYear() % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsWithEvenYearManufacturerFoundation() {
        return getManufacturers().stream()
                .filter(manufacturer -> manufacturer.getYearOfCreation() % 2 == 0)
                .map(Manufacturer::getModels)
                .flatMap(Collection::stream)
                .map(Model::getCars)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsWithEvenStartingProductionYearAndOddEstablishingManufacturerYear() {
        return getManufacturers().stream()
                .filter(manufacturer -> manufacturer.getYearOfCreation() % 2 == 1)
                .map(Manufacturer::getModels)
                .flatMap(Collection::stream)
                .filter(model -> model.getProductionStartYear() % 2 == 0)
                .map(Model::getCars)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<Car> getCabrioCarsWithOddStartingProductionYearAndEvenEstablishingManufacturerYear() {
        return getManufacturers().stream()
                .filter(manufacturer -> manufacturer.getYearOfCreation() % 2 == 0)
                .map(Manufacturer::getModels)
                .flatMap(Collection::stream)
                .filter(model -> model.getProductionStartYear() % 2 == 1)
                .map(Model::getCars)
                .flatMap(Collection::stream)
                .filter(car -> car.getCarType().equals(CarType.CABRIO))
                .collect(Collectors.toList());
    }

    public List<Car> getSedanCarsWithModelNewerThan2019AndManufacturerOlderThan1919() {
        return getManufacturers().stream()
                .filter(manufacturer -> manufacturer.getYearOfCreation() < 1919)
                .map(Manufacturer::getModels)
                .flatMap(Collection::stream)
                .filter(model -> model.getProductionStartYear() > 2019)
                .map(Model::getCars)
                .flatMap(Collection::stream)
                .filter(car -> car.getCarType().equals(CarType.SEDAN))
                .collect(Collectors.toList());
    }

}
