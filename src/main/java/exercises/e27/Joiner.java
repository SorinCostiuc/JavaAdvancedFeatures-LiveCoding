package exercises.e27;


public class Joiner<T> {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... args) {
        return String.join(separator, (CharSequence[]) args);
    }
}
