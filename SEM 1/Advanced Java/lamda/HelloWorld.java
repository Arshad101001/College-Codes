// WAP using Lambda expression to print "Hello, Lambda!".

interface greet {
    void sayHello();
}

class HelloWorld {
    public static void main(String[] args) {
        greet greeting = () -> System.out.println("Hello, World");
        
        greeting.sayHello();
    }
}