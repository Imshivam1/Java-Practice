public class Greeting {
    // General greeting
    public void sayHello() {
        System.out.println("Hello!");
    }

    // Personalized greeting
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        Greeting greet = new Greeting();
        greet.sayHello();
        greet.sayHello("Alice");
    }
}
