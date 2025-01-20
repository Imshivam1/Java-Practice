public class NumberOperations {
    // Check even or odd
    public void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    // Find factorial
    public int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        NumberOperations operations = new NumberOperations();
        operations.checkEvenOdd(5);
        System.out.println("Factorial: " + operations.factorial(5));
    }
}
