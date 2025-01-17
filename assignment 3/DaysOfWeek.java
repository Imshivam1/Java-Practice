import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number for day
        System.out.println("Enter a number (1-7) for the day of the week: ");
        int day = sc.nextInt();

        // Switch to match the number with the day
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid input! Enter a number between 1 and 7.");
        }
    }
}
