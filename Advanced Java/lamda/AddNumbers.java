// WAP using Lambda expression with multiple parameters to add two numbers.

interface Add {
    int add(int a, int b);
}

class AddNumbers {
    public static void main(String[] args) {
        Add addition = (a, b) -> a + b;
        System.out.println("Sum: " + addition.add(10, 20));
    }
}
