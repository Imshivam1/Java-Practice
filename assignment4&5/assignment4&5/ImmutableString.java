public class ImmutableString {
    public static void main(String[] args) {
        String str = "Hello";
        String modified = str + " World";

        System.out.println("Original String: " + str); // "Hello"
        System.out.println("Modified String: " + modified); // "Hello World"
    }
}