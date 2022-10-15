package exercises.e16;

public class Main {
    public static void main(String[] args) {
        /*
        Create an enum Runner class with constants BEGINNER, INTERMEDIATE, ADVANCED. Enum should have two
parameters:
• minimum time of running a marathon in minutes
• maximum running time of the marathon in minutes
In addition, the Runner enum should contain the static getFitnessLevel() method, which takes any time
result of a marathon run, and as a result should return a specific Runner object based on the given time.
         */
        System.out.println(Runner.getFitnessLevel(8));
        System.out.println(Runner.getFitnessLevel(5));
        System.out.println(Runner.getFitnessLevel(11));
    }
}
