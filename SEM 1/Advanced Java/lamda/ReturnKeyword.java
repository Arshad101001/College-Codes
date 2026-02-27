
interface greet1 {
    void sayHello();
}

interface greet2 {
    String sayHello(String name);
}

class ReturnKeyword {
    public static void main(String[] args) {
        greet1 greeting1 = () -> System.out.println("Hello, World");
        greeting1.sayHello();

        greet2 greeting2 = (name) -> {
            return "Hello, " + name;
        };
        System.out.println(greeting2.sayHello("Jhon"));
    }
}
