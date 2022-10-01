package exercises.e4;

public class Main {
    public static void main(String[] args) {
        /*
        - Create a Storage class that will have a private Map field, a public constructor, and methods:
            - addToStorage(String key, String value) → adding elements to the storage
            - printValues(String key) → displaying all elements under a given key
            - findValues(String value) → displaying all keys that have a given value
            - The Storage class should allow you to store multiple values under one key.
         */
        Storage storage = new Storage();
        storage.addToStorage("GPU", "AMD");
        storage.addToStorage("CPU", "AMD");
        storage.addToStorage("RAMM", "ToughRam");
        storage.addToStorage("RAMM", "TridentZ");

        storage.printValues("RAMM");
        System.out.println("----------");
        storage.findValues("AMD");

    }
}
