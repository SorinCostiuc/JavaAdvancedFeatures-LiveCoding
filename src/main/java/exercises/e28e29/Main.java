package exercises.e28e29;

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
        /*
        Implement the generic partOf method, which will return % of items satisfying the condition based on any
    type of array and the function indicated as parameters.
        //for the list [1,2,3,4,5] and the parameter odd it should return 60%
        */

        ArraySkipper<String> arraySkipper = new ArraySkipper<>(List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"));
        System.out.println(arraySkipper.getEveryNthElement(2, 3));

        ArraySkipper<Integer> numberSkipers = new ArraySkipper<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(numberSkipers.partOf(1));

    }
}
