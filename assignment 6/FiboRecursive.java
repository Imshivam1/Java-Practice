public class FiboRecursive {
    // Recursive method to calculate Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base case: If n is 0 or 1, return n
        }
        // Recursive case: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Number of terms
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            // Print the Fibonacci number for each index from 0 to n-1
            System.out.print(fibonacci(i) + " ");
        }
    }
}
