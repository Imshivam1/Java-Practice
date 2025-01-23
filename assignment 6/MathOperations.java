public class MathOperations {
    // Overloaded methods
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Adding integers
        System.out.println("Sum of integers: " + math.add(5, 10));

        // Adding doubles
        System.out.println("Sum of doubles: " + math.add(5.5, 10.2));
    }
}