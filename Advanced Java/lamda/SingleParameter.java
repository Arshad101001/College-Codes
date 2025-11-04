// WAP using Lambda expression with a single parameter.

interface SingleParamInterface {
    void greet(String name);
}

class SingleParameter {
     public static void main(String[] args) {
        SingleParamInterface singleParam = (name) -> System.out.println("Hello, " + name + "!");
        singleParam.greet("John");
    }
}
