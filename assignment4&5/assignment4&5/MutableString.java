public class MutableString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        System.out.println("Modified String: " + sb.toString());
    }
}
