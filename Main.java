import java.util.Scanner;

/**
 * Main: menu-driven console program.
 * Topics: String manipulation, String vs StringBuilder vs StringBuffer,
 *         Wrapper classes, autoboxing/unboxing and input parsing.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println();
            System.out.println("===== String & Wrapper Classes Demo =====");
            System.out.println("1. String manipulation demo");
            System.out.println("2. Palindrome and vowel checker (your own text)");
            System.out.println("3. String vs StringBuilder vs StringBuffer");
            System.out.println("4. Autoboxing, unboxing and Wrapper methods");
            System.out.println("5. Parse user input");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            String line = sc.nextLine().trim();
            try {
                choice = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                choice = -1;   // invalid menu input
            }
            System.out.println();

            switch (choice) {
                case 1: stringDemo(); break;
                case 2: checkText(sc); break;
                case 3: speedTest(); break;
                case 4: WrapperDemo.boxing(); break;
                case 5: WrapperDemo.parseInput(sc); break;
                case 0: System.out.println("Thank you!"); break;
                default: System.out.println("Invalid choice. Please enter a number from 0 to 5.");
            }
        } while (choice != 0);
        sc.close();
    }

    // Common String methods on one example text
    private static void stringDemo() {
        String s = "Java Programming";
        System.out.println("--- String Manipulation ---");
        System.out.println("Original      : \"" + s + "\"");
        System.out.println("length()      : " + s.length());
        System.out.println("trim()        : \"" + s.trim() + "\"");
        System.out.println("toUpperCase() : " + s.toUpperCase());
        System.out.println("toLowerCase() : " + s.toLowerCase());
        System.out.println("charAt(0)     : " + s.charAt(0));
        System.out.println("substring(0,4): " + s.substring(0, 4));
        System.out.println("replace       : " + s.replace("Java", "Core"));
        System.out.println("split(\" \")    : " + String.join(" | ", s.split(" ")));
        System.out.println("equals(\"Java\"): " + s.equals("Java"));
        System.out.println("Reverse       : " + StringOps.reverse(s));
        System.out.println("Palindrome?   : " + StringOps.isPalindrome(s));
        System.out.println("Vowel count   : " + StringOps.countVowels(s));
        System.out.println("\"madam\" palindrome? : " + StringOps.isPalindrome("madam"));
    }

    // Let the user test their own text
    private static void checkText(Scanner sc) {
        System.out.print("Enter any text: ");
        String text = sc.nextLine();
        System.out.println("Reverse     : " + StringOps.reverse(text));
        System.out.println("Palindrome? : " + StringOps.isPalindrome(text));
        System.out.println("Vowel count : " + StringOps.countVowels(text));
    }

    // Append 'a' 20000 times using three different classes and time each one
    private static void speedTest() {
        final int N = 20000;
        System.out.println("--- String vs StringBuilder vs StringBuffer ---");
        System.out.println("Appending 'a' " + N + " times:");

        long start = System.nanoTime();
        String str = "";
        for (int i = 0; i < N; i++) {
            str += "a";                    // creates a new String every time
        }
        long strTime = (System.nanoTime() - start) / 1000;

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("a");                // mutable, not synchronized
        }
        long sbTime = (System.nanoTime() - start) / 1000;

        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbf.append("a");               // mutable, synchronized (thread-safe)
        }
        long sbfTime = (System.nanoTime() - start) / 1000;

        System.out.println("String (+)    : " + strTime + " microseconds (creates new objects)");
        System.out.println("StringBuilder : " + sbTime + " microseconds (mutable, not synchronized)");
        System.out.println("StringBuffer  : " + sbfTime + " microseconds (mutable, synchronized)");
    }
}
