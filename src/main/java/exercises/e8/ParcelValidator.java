package exercises.e8;

public class ParcelValidator implements Validator {
    @Override
    public boolean validate(Parcel input) {
        return ((((input.getxLength() + input.getyLength() + input.getzLength()) < 300)
                && input.getxLength() >= 30) && (input.getyLength() >= 30) && (input.getzLength() >= 30)
                && (input.isExpress() && (input.getWeight() <= 15.0) || (!input.isExpress() && (input.getWeight() <= 30.0))));
    }
}
