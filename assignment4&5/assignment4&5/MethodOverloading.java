public class MethodOverloading {
    // Two-parameter method with same name
    public int calculateSum(int a, int b) {
        return a + b;
    }

    // Three-parameter method with same name
    public int calculateSum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        System.out.println("Sum of two numbers: " + mo.calculateSum(5, 10));
        System.out.println("Sum of three numbers: " + mo.calculateSum(5, 10, 15));
    }
}
