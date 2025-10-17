// WAP to find the greatest number among two numbers by applying generic method

public class GenerictMethodDemo {

    // Generic method to find the greatest of two numbers
    public static <T extends Comparable<T>> T findGreatest(T num1, T num2) {
        if (num1.compareTo(num2) >= 0) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        // Test with Integer
        Integer int1 = 25;
        Integer int2 = 42;
        System.out.println("Greatest Integer: " + findGreatest(int1, int2));

        // Test with Double
        Double d1 = 12.75;
        Double d2 = 12.74;
        System.out.println("Greatest Double: " + findGreatest(d1, d2));

        // Test with String (lexicographically)
        String s1 = "Apple";
        String s2 = "Banana";
        System.out.println("Greatest String: " + findGreatest(s1, s2));
    }
}