package exercises.e26ab;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
class Manufacturer {
    private String name;
    private int yearOfCreation;
    List<Model> models;

    public Manufacturer(String name, int yearOfCreation, List<Model> models) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.models = models;
    }
}