public class PalindromeCheck {
    public boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        PalindromeCheck pc = new PalindromeCheck();
        System.out.println("Is palindrome: " + pc.isPalindrome("madam"));
        System.out.println("Is palindrome: " + pc.isPalindrome("hello"));
    }
}
