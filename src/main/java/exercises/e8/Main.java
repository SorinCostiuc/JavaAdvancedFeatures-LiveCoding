package exercises.e8;

public class Main {
    public static void main(String[] args) {
        /*
        Implement the Validator interface, which will include a boolean validate(Parcel input) method in its
declaration. Create a Parcel class with the parameters:
        • int xLength
        • int yLength
        • int zLength
        • float weight
        • boolean isExpress
        The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300, whether each size is
not less than 30, whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true. In
case of errors, it should inform the user about them.
         */

        ParcelValidator validator = new ParcelValidator();
        Parcel parcel = new Parcel(200, 100, 50, 25.0f, true);
        Parcel parcel1 = new Parcel(20, 30, 40, 10.0f, false);
        Parcel parcel2 = new Parcel(40, 40, 40, 14.0f, true);
        Parcel parcel3 = new Parcel(40, 40, 40, 16.0f, false);

        System.out.println(validator.validate(parcel));
        System.out.println(validator.validate(parcel1));
        System.out.println(validator.validate(parcel2));
        System.out.println(validator.validate(parcel3));

    }
}
