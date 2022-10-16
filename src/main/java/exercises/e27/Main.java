package exercises.e27;

public class Main {
    public static void main(String[] args) {
        /*
        Design the Joiner<T> class, which in the constructor will take a separator (string) and have a join() method
that allows you to specify any number of T-type objects. This method will return a string joining all passed
elements by calling their toString() method and separating them with a separator.
eg. for Integers and separator "-" it should return: 1-2-3-4 ..
         */
        Joiner<String> joiner = new Joiner<>("-");
        System.out.println(joiner.join("Ala", "bala", "portocala"));
    }
}
