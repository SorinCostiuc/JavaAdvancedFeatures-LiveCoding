package exercises.e17;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ConversionType {
    METERS_TO_YARDS(1.09),
    YARDS_TO_METERS(0.91),
    CENTIMETERS_TO_INCHES(0.39),
    INCHES_TO_CENTIMETERS(2.5),
    KILOMETERS_TO_MILES(0.62),
    MILES_TO_KILOMETERS(1.6);

    public final double conversionUnit;
}
