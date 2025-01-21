public class InsertString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.insert(6, "Beautiful ");
        System.out.println("After Insert: " + sb);
    }
}
