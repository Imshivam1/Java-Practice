/*1. Type Conversion
Difference between Implicit and Explicit Type Conversion:

Implicit Conversion: Automatic type conversion by the Java compiler. It happens when a smaller data type is converted into a larger one (e.g., int to float).
Explicit Conversion: Manual type conversion using type casting. It happens when a larger data type is converted into a smaller one (e.g., double to int).
*/
public class TypeConversion {
    public static void main(String[] args) {
        // Implicit conversion
        float a = 10; // int to float
        System.out.println("Implicit Conversion: floatValue = " + a);

        // Explicit conversion
        double b = 10.75;
        int c = (int) b; // double to int
        System.out.println("Explicit Conversion: intValue = " + c);
    }
}
