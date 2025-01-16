/*
8. Ternary Operator
What is it?

A shorthand for if-else statements.
Syntax: condition ? value_if_true : value_if_false.
*/
public class TernaryOperator {
    public static void main(String[] args) {
        int num = 10;

        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: " + result);
    }
}
