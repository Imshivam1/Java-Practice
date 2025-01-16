/*3. Assignment Operators

Assignment operators (=, +=, -=, %=) are used to assign and update the values of variables.
*/
public class AssignmentOperators {
    public static void main(String[] args) {
        int num = 10; // Assign using =
        System.out.println("Initial Value: " + num);

        // Update using assignment operators
        num += 5; // num = num + 5
        System.out.println("After += : " + num);

        num -= 3; // num = num - 3
        System.out.println("After -= : " + num);

        num *= 2; // num = num * 2
        System.out.println("After *= : " + num);

        num /= 4; // num = num / 4
        System.out.println("After /= : " + num);

        num %= 3; // num = num % 3
        System.out.println("After %= : " + num);
    }
}
