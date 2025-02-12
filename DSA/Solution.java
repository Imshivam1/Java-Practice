import java.util.Arrays;
import java.util.Scanner;


public class Solution {

    static boolean isAnagram(String a, String b) {
        // Convert to lowercase to make the check case insensitive
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // If lengths are different, they can't be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Create frequency arrays for both strings
        int[] frequency = new int[26]; // Since it's lowercase English letters only
        System.out.println("1");
        System.out.println(Arrays.toString(frequency));

        // Count characters in the first string
        for (char c : a.toCharArray()) {
            frequency[c - 'a']++;//it increments the value of that index which came after subtracting [c -'a'] in frequncy array.
        }
        System.out.println(Arrays.toString(frequency)); //frequency will store count in each index that is 
        //if two time 'a' then in 0th index it will be 2
        // Subtract counts based on the second string
        for (char c : b.toCharArray()) {
            frequency[c - 'a']--;
        }
        System.out.println(Arrays.toString(frequency)); //here the frequency will consist only zero's if anagram

        // If all frequencies are zero, it's an anagram
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words to check if anagram or not ,first word:");
        String a = scan.next();
        System.out.println("Enter second word");
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
