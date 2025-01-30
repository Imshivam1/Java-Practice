public class FibonacciDP {
    public static void main(String[] args) {
        int n = 10; // Number of terms
        int[] fib = new int[n];

        // Initial values
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int num : fib) {
            System.out.print(num + " ");
        }
    }
}
