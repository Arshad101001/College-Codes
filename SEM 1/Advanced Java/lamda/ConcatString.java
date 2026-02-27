// WAP using Lambda expression to concatenate two strings.

interface Concat {
    String concatenate(String a, String b);
}

class ConcatString {
    public static void main(String[] args) {
        Concat concatStrings = (a, b) -> a + b;
        System.out.println(concatStrings.concatenate("Hello, ", "World!"));
    }
}