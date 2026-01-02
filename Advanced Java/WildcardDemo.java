import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {

    // Method with Unbounded Wildcard
    // This method can accept a list of any type of objects (e.g., Integer, String, etc.)
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    // Method with Upper Bounded Wildcard
    // This method can accept a list of objects of type T or any subclass of T
    public static void printNumberList(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    // Method with Lower Bounded Wildcard
    // This method can accept a list of objects of type T or any superclass of T
    public static void addNumbers(List<? super Integer> list) {
        list.add(10); // This is safe, as Integer is a subclass of Number
        // list.add("Hello"); // Error: Cannot add a String to a List<? super Integer>
    }

    public static void main(String[] args) {

        // Creating lists for demonstration
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        // Adding elements to integer and double lists
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);

        stringList.add("Hello");
        stringList.add("World");

        // Demonstrating the method with Unbounded Wildcard
        System.out.println("Unbounded Wildcard:");
        printList(integerList);
        printList(doubleList);
        printList(stringList);

        // Demonstrating the method with Upper Bounded Wildcard
        System.out.println("\nUpper Bounded Wildcard (accepts only Numbers or subclasses of Number):");
        printNumberList(integerList);
        printNumberList(doubleList);
        // printNumberList(stringList); // Error: String is not a subclass of Number

        // Demonstrating the method with Lower Bounded Wildcard
        System.out.println("\nLower Bounded Wildcard (only accepts Integer or superclasses of Integer):");
        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList); // This is fine
        // addNumbers(stringList); // Error: String is not a superclass of Integer
        System.out.println(numberList);
    }
}

