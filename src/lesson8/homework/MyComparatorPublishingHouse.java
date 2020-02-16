package lesson8.homework;

import java.util.Comparator;

public class MyComparatorPublishingHouse implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String publishingHouse = ((Book) o1).getPublishingHouse();
        String publishingHouse2 = ((Book) o2).getPublishingHouse();
        return publishingHouse.compareTo(publishingHouse2);
    }
}
