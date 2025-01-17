import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: A number
        System.out.println("Enter a number to find its factorial: ");
        int num = sc.nextInt();

        long factorial = 1;

        // For loop to calculate factorial
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
