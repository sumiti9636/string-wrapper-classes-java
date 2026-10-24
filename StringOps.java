/**
 * StringOps: helper methods for common String operations.
 * Used by Main to show reverse, palindrome check and vowel count.
 */
public class StringOps {

    // Reverse a String using StringBuilder (String itself is immutable)
    public static String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    // A palindrome reads the same forwards and backwards (ignores case)
    public static boolean isPalindrome(String text) {
        String cleaned = text.trim().toLowerCase();
        return cleaned.equals(reverse(cleaned));
    }

    // Count vowels (a, e, i, o, u) in a String
    public static int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
