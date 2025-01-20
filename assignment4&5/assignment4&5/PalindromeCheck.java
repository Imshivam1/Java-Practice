public class PalindromeCheck {
    public boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();// stores reversed str in reversed String by using reverse to convert
        //and toString() to keep it in String format only
        return str.equalsIgnoreCase(reversed);//compares both str and reversed igonring case sensitive letters
    }

    public static void main(String[] args) {
        PalindromeCheck pc = new PalindromeCheck();
        System.out.println("Is palindrome: " + pc.isPalindrome("madam"));//checking if it is pallindrome or not and the result is true
        System.out.println("Is palindrome: " + pc.isPalindrome("hello"));// result will be false
    }
}
