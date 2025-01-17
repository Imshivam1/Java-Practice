public class EvenNumbers {
    public static void main(String[] args) {
        int num = 1;

        System.out.println("Even numbers between 1 and 20: ");
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
// Prints between 1 to 20(including 20 but not 1)