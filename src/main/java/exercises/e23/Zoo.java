package exercises.e23;


import java.util.*;
import java.util.stream.Collectors;

public class Zoo {
    Map<String, Integer> animals = new HashMap<>();


    public void addAnimal(String specie, int numberOfAnimals) {
        animals.merge(specie, numberOfAnimals, Integer::sum); //refactored
//        if (animals.get(specie) == null){
//            animals.put(specie, numberOfAnimals);
//        }else {
//            animals.put(specie, animals.get(specie) + numberOfAnimals);
//        }
    }

    public int getNumberOfAllAnimals() {
        return animals.values().stream()
                .reduce(0, Integer::sum);

//        return animals.values().stream()      //alternative
//                .mapToInt(value -> value)
//                .sum();
//
//        int sum = 0;          //imperative alternative
//        for (Map.Entry<String, Integer> animal : animals.entrySet()) {
//            sum += animal.getValue();
//        }
//        return sum;
    }

    public Map<String, Integer> sort() {
        return animals.entrySet().stream()
                .sorted(Map.Entry.comparingByValue((e1, e2) -> (e1 - e2) * -1))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}


