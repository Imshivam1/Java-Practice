public class Counter {
    private static int count = 0;

    // Static method to increment count
    public static void increment() {
        count++;
    }

    // Static method to display count
    public static void display() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        Counter.increment();
        Counter.increment();
        Counter.display(); // Outputs 2
    }
}
/*
Static variables and methods are shared across all instances of a class.
They can be called without creating an object using the class name.
*/