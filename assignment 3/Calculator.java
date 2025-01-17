/*
Task 1: Basic Calculator
Explanation: This program takes two numbers and an operator (+, -, *, /) as input. 
Based on the operator, it performs the corresponding calculation using a switch statement.
*/
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Two numbers and an operator
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        // Switch to perform operations
        switch (operator) {
            case '+' -> System.out.println("Result: " + (num1 + num2));
            case '-' -> System.out.println("Result: " + (num1 - num2));
            case '*' -> System.out.println("Result: " + (num1 * num2));
            case '/' -> {
                if (num2 != 0)
                    System.out.println("Result: " + (num1 / num2));
                else
                    System.out.println("Error: Division by zero is not allowed.");
            }
            default -> System.out.println("Invalid operator!");
        }
    }
}
