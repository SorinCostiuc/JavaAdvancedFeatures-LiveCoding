package exercises.e18;

public class Main {
    public static void main(String[] args) {
        /*
        Create a Computer class with fields defining computer features: processor, ram, graphics card, company
and model. Implement setters, getters, constructor with all fields, toString(), equals() and hashcode()
methods.
Instantiate several objects and check how the methods work
         */

        Computer computer1 = new Computer("AMD", 512, "Nvidia", "Intel", "AM123");
        System.out.println(computer1);
        Computer computer2 = new Computer("Intel", 1024, "Radeon", "Dell", "GameForce");
        System.out.println(computer2);
        Computer computer3 = new Computer("Qualcom", 2024, "ATI", "IBM", "AZ87");
        System.out.println(computer3);
        System.out.println("----------");
        System.out.println(computer1.hashCode());
        System.out.println(computer2.equals(computer1));
        System.out.println(computer3.getModel());
        System.out.println("----------");

    }
}
