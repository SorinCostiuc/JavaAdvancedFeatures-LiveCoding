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
}
