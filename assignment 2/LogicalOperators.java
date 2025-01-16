/*
5. Logical Operators
What are Logical Operators?

&& (AND): Returns true if both conditions are true.
|| (OR): Returns true if at least one condition is true.
! (NOT): Inverts the boolean value.
*/
public class LogicalOperators {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("condition1 && condition2: " + (condition1 && condition2));
        System.out.println("condition1 || condition2: " + (condition1 || condition2));
        System.out.println("!condition1: " + (!condition1));
    }
}
