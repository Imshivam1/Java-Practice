import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 6, 1};
        HashSet<Integer> seen = new HashSet<>();
        System.out.println("Duplicate elements:");

        for (int num : arr) {
            if (seen.contains(num)) {
                System.out.println(num);
            } else {
                seen.add(num);
            }
        }
    }
}
