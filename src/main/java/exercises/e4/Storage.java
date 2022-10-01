package exercises.e4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private Map<String, List<String>> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        storage.computeIfAbsent(key, k -> new ArrayList<>());
        storage.get(key).add(value);
    }


    public void printValues(String key) {
        if (storage.get(key) != null) {
            System.out.println(storage.get(key));
        }
    }

    public void findValues(String value) {
        storage.entrySet().stream()
                .filter(element -> element.getValue().contains(value))
                .forEach(element -> System.out.print(element.getKey() + " "));

//        for (Map.Entry<String, List<String>> m: storage.entrySet()){
//            if (m.getValue().contains(value)){
//                System.out.print(m.getKey() + " ");
//            }
//        }
    }
}
