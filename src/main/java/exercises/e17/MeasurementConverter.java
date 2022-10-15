package exercises.e17;

public class MeasurementConverter {

    public double valueToConvert(double value, ConversionType conversionType) {
        return value * conversionType.conversionUnit;
    }
}
