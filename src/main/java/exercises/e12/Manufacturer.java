package exercises.e12;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@Builder
@ToString
public class Manufacturer {
    private String name;
    private Integer yearOfEstablishment;
    private String country;

    public Manufacturer(String name, Integer yearOfEstablishment, String country) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return name.equals(that.name) && yearOfEstablishment.equals(that.yearOfEstablishment) && country.equals(that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfEstablishment, country);
    }
}
