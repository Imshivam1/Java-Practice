public class Calculator {
    // Add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Add three numbers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add array of numbers
    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) { //for each method used
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two numbers: " + calc.add(10, 20));
        System.out.println("Sum of three numbers: " + calc.add(10, 20, 30));
        System.out.println("Sum of array: " + calc.add(new int[]{10, 20, 30, 40}));
    }
}
