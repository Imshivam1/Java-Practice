import java.util.Scanner;

class UsernameValidator {  // Fixed class name (PascalCase)
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$"; 
}

public class SolutionS {
    public static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Enter the number of test-cases :");
        int n = Integer.parseInt(sc.nextLine());

        while (n-- != 0) {
            System.out.println("Enter the username to check :");
            String username = sc.nextLine();

            if (username.matches(UsernameValidator.regularExpression)) { // Fixed class name
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");  // Fixed missing line break
            }
        }
        
        sc.close();  // Close scanner to prevent resource leaks
    }
}
