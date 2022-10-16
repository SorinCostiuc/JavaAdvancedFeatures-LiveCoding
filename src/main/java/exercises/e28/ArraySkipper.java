package exercises.e28;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

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
}
