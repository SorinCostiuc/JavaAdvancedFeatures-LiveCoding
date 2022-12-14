package exercises.e28e29;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor

public class ArraySkipper<E> extends ArrayList<E> {
    private List<E> elements;

    public List<E> getEveryNthElement(int startIndex, int skip) {
        List<E> skipped = new ArrayList<>();
        for (int i = startIndex; i < elements.size(); i = i + skip + 1) {
            skipped.add(elements.get(i));
        }
        return skipped;
    }

    public int partOf(int parity) {
        return elements.stream()
                .filter(e -> (int) e % 2 == parity).toList()
                .size() * 100 / elements.size();
    }
}
