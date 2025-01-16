/*2. Literals
What are Literals?

Literals are fixed values assigned to variables in the code.
Types:
Integer Literals: 10, 0xA (hexadecimal), 010 (octal)
Floating-Point Literals: 10.5, 1.2e3
Character Literals: 'A', '9'
String Literals: "Shivam"
Boolean Literals: true, false
*/
public class Literals {
    public static void main(String[] args) {
        // Integer literals
        int decimal = 10; // Decimal
        int octal = 010; // Octal
        int hex = 0xA; // Hexadecimal
        System.out.println("Integer Literals: " + decimal + ", " + octal + ", " + hex);

        // Floating-point literals
        float floatVal = 10.5f; // Single precision
        double doubleVal = 20.55; // Double precision
        System.out.println("Floating-point Literals: " + floatVal + ", " + doubleVal);

        // Character and String literals
        char charLiteral = 'A';
        String stringLiteral = "Hello Java";
        System.out.println("Character: " + charLiteral + ", String: " + stringLiteral);

        // Boolean literals
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println("Boolean Literals: " + isTrue + ", " + isFalse);
    }
}
