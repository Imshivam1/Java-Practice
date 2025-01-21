public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println("Original: " + sb);
        sb.reverse();
        System.out.println("Reversed: " + sb);
    }
}
