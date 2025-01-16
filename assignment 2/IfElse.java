/* SYNTAX
if (condition) {
    // Code if condition is true
} else {
    // Code if condition is false
}
*/
public class IfElse {
    public static void main(String[] args) {
        int num = 0;

        if (num > 0) {
            System.out.println("Number is Positive");
        } else if (num < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }
    }
}
