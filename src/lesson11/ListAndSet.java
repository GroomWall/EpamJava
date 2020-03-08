package lesson11;

import java.util.*;

public class ListAndSet {
    private int lowerBound;
    private int upperBound;
    private int range;

    ListAndSet(int lowerBound, int upperBound, int range) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.range = range;
    }

    List generateList() {
        List<Number> list = new LinkedList<>();
        for (int i = 0; i < range; i++)
            list.add(randomize(lowerBound, upperBound));
        return list;
    }

    Set generateSet() {
        Collection<Integer> list = new ArrayList<>();
        for (int i = 0; i < range; i++)
            list.add(randomize(lowerBound, upperBound));
        TreeSet<Integer> set = new TreeSet<>(list);
        return set;
    }

    private int randomize(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public void printList(List list) {
        for (Object listItem : list) System.out.print(listItem + " ");
    }

    public void printSet(Set list) {
        for (Object setItem : list) System.out.print(setItem + " ");
    }
}
