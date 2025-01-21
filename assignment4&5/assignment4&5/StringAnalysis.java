public class StringAnalysis {
    public void count(String str) {
        int vowels = 0, consonants = 0;

        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            } else if (c >= 'a' && c <= 'z') {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        StringAnalysis sa = new StringAnalysis();
        sa.count("Hello World");
    }
}
