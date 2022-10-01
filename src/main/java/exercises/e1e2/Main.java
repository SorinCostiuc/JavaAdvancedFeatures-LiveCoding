package exercises.e1e2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Create a method that takes a string list as a parameter, then returns the list sorted alphabetically from Z to
A.
        Create a method that takes a string list as a parameter, then returns that list sorted alphabetically from Z to
A case-insensitive.
         */
        List<String> words = new ArrayList<>();
        words.add("Stefan");
        words.add("Sorin");
        words.add("Bogdan");
        words.add("Alexandru");
        words.add("Alexandra");
        words.add("Ioana");
        words.add("Maria");
        words.add("georgel");

        System.out.println(sortWordsAlphabeticallySensitive(words));
        System.out.println("----------");
        System.out.println(sortWordsAlphabeticallyInsensitive(words));

    }

    public static List<String> sortWordsAlphabeticallySensitive(List<String> words) {
        words.sort(String::compareTo);
        return words;
    }

    public static List<String> sortWordsAlphabeticallyInsensitive(List<String> words) {
        words.sort(String::compareToIgnoreCase);
        return words;
    }
}