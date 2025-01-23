import java.util.HashSet;

public class PairsWithSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 6;
        HashSet<Integer> set = new HashSet<>(); //Initializes an empty HashSet called set

        System.out.println("Pairs with sum " + target + ":");
        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            } else {
                set.add(num);
            }
        }
    }
}
/*
OUTPUT WILL BE: 
(2, 4)
(1, 5)
*/