package lesson8.homework;

import java.util.Comparator;

public class MyComparatorPrice implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return Double.compare(((Book) o1).getCost(), ((Book) o2).getCost());
    }
}

