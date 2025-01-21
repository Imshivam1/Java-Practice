public class DeleteString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello Beautiful World");
        sb.delete(6, 15);
        System.out.println("After Delete: " + sb);
    }
}
