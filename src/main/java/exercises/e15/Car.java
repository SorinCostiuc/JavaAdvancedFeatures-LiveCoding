package exercises.e15;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public enum Car {
    FERRARI(15000, 460),
    PORSCHE(1800, 380),
    TOYOTA(1200, 80),
    MERCEDES(2000, 620),
    OPEL(1000, 120),
    FIAT(50, 10),
    BMW(100, 10);

    private final Integer price;
    private final Integer power;

    public boolean isPremium() {
        return price >= 1000;
    }

    public boolean isRegular() {
        return !isPremium();
    }

    public boolean isFasterThan(Car car) {
        return this.power.compareTo(car.power) > 0;
    }

}
