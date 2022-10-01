package exercises.e3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
       Create a method that takes the map as a parameter, where the key is string and the value number, and then
prints each map element to the console in the format: Key: <k>, Value: <v>. There should be a comma at the
end of every line except the last, and a period at the last.
Example:
Key: Java, Value: 18,
Key: Python, Value: 1,
...
Key: PHP, Value: 0
         */
        Map<String, Integer> productPrice = new HashMap<>();
        productPrice.put("Decorations", 30);
        productPrice.put("Mug", 12);
        productPrice.put("Costume", 45);
        productPrice.put("Glass", 8);

        printMap(productPrice);
    }

    public static void printMap(Map<String, Integer> productPrices) {
        for (Map.Entry m : productPrices.entrySet()) {
//            System.out.println("Key: " + m.getKey() + ", " + "Value: " + m.getValue() + ".");
            System.out.printf("Key: %s, Value: %d. \n", m.getKey(), m.getValue());
        }
    }
}
