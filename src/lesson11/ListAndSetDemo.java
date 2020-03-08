package lesson11;

public class ListAndSetDemo {
    public static void main(String[] args) {
        System.out.println("Please, enter lower bound of a List and a Set");
        int lowerBound = Validator.checkInt();
        System.out.println("Please, enter upper bound of a List and a Set");
        int upperBound = Validator.checkInt();
        System.out.println("Please enter range of numbers: ");
        int range = Validator.checkInt();
        System.out.println("Your list:");
        ListAndSet listAndSet = new ListAndSet(lowerBound, upperBound, range);
        listAndSet.printList(listAndSet.generateList());
        System.out.println();
        System.out.println("Your set:");
        listAndSet.printSet(listAndSet.generateSet());
    }
}
