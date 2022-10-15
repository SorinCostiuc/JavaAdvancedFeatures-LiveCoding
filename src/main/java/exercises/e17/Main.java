package exercises.e17;

public class Main {
    public static void main(String[] args) {
        /*
        Create a ConversionType enum class with the constants METERS_TO_YARDS, YARDS_TO_METERS,
CENTIMETERS_TO_INCHES, INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES, MILES_TO_KILOMETERS.
Enum should have a Converter type parameter used to perform calculations for a given type.
Then create a MeasurementConverter class that will have the convert(int value, ConversionType)
method and based on the value and type of conversion, used the Converter of the given
type and returned the result.
         */
        MeasurementConverter measurementConverter = new MeasurementConverter();
        System.out.println(measurementConverter.valueToConvert(123, ConversionType.CENTIMETERS_TO_INCHES));
        System.out.println(measurementConverter.valueToConvert(2.5, ConversionType.CENTIMETERS_TO_INCHES));
        System.out.println(measurementConverter.valueToConvert(2.5, ConversionType.INCHES_TO_CENTIMETERS));
        System.out.println(measurementConverter.valueToConvert(123, ConversionType.YARDS_TO_METERS));
    }
}
