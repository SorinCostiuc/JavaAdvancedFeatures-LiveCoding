package exercises.e28;

import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
        /*
        Extend the ArrayList<E> class by implementing the getEveryNthElement() method. This method returns a list
of elements and takes two parameters: the element index from which it starts and a number specifying which
element to choose.
For the list: [a, b, c, d, e, f, g] and parameters: startIndex = 2 and skip = 3 it should return [c, g]
         */

        ArraySkipper<String> arraySkipper = new ArraySkipper<>(List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"));
        System.out.println(arraySkipper.getEveryNthElement(2, 3));
    }
}
