import java.util.*;

public class Hashmap1 {
    public static int getLengthofLongestSubstring(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) return 0;

        Map<Character, Integer> charCount = new HashMap<>(); // Corrected 'Hashmap' to 'HashMap'
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);

            while (charCount.size() > k) {//charCount keeps the no. of characters
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt(); // Number of test cases
            
            while (T-- > 0) {
                int K = sc.nextInt();// no. of distinct character
                String S = sc.next();//string
                System.out.println(getLengthofLongestSubstring(S, K));
            }
        } // Number of test cases
    }
}
