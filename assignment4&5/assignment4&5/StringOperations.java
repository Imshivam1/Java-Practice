public class StringOperations {
    public static void main(String[] args) {
        String str = "Hello World";

        // a. Concatenation
        String concatenated = str + "!";
        System.out.println("Concatenated: " + concatenated);

        // b. Substring
        System.out.println("Substring: " + str.substring(0, 5));

        // c. Replace
        System.out.println("Replaced: " + str.replace('o', '0'));

        // d. Case conversion
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }
}
