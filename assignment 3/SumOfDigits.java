import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: An integer
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        int sum = 0;

        // While loop to sum digits
        while (num != 0) {
            sum += num % 10; // Add the last digit
            num /= 10;       // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
    }
}
