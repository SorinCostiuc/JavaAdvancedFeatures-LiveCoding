package exercises.e18e19;

import java.util.Objects;

public class Laptop extends Computer {
    Integer battery;

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    public Laptop(String processor, int ram, String graphicsCard, String company, String model, Integer battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                super.toString() +
                "battery=" + battery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(battery, laptop.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }
}
