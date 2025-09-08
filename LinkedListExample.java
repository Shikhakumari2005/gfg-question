import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Display the LinkedList
        System.out.println("Fruits List: " + fruits);

        // Add element at the beginning
        fruits.addFirst("Mango");

        // Add element at the end
        fruits.addLast("Orange");

        // Remove first and last elements
        fruits.removeFirst();
        fruits.removeLast();

        // Access elements
        System.out.println("First fruit: " + fruits.getFirst());
        System.out.println("Last fruit: " + fruits);

        // Display final list
        System.out.println("Updated Fruits List: " + fruits);
    }
}