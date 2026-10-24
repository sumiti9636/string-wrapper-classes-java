import java.util.Scanner;

/**
 * WrapperDemo: shows Wrapper classes, autoboxing, unboxing and parsing.
 */
public class WrapperDemo {

    // Autoboxing, unboxing and common Wrapper class methods
    public static void boxing() {
        System.out.println("--- Autoboxing & Unboxing ---");
        int x = 25;
        Integer boxed = x;          // autoboxing: int -> Integer
        int unboxed = boxed;        // unboxing: Integer -> int
        System.out.println("Autoboxing : int " + x + " -> Integer " + boxed);
        System.out.println("Unboxing   : Integer " + boxed + " -> int " + unboxed);

        System.out.println();
        System.out.println("--- Wrapper Class Methods ---");
        Integer a = Integer.valueOf(50);
        System.out.println("Integer.valueOf(50)            : " + a);
        System.out.println("a.intValue()                   : " + a.intValue());
        System.out.println("Integer.parseInt(\"20\")         : " + Integer.parseInt("20"));
        System.out.println("Integer.toBinaryString(50)     : " + Integer.toBinaryString(50));
        System.out.println("Integer.MAX_VALUE              : " + Integer.MAX_VALUE);
        System.out.println("Double.parseDouble(\"3.14\")     : " + Double.parseDouble("3.14"));
        System.out.println("Boolean.parseBoolean(\"true\")   : " + Boolean.parseBoolean("true"));
        System.out.println("Character.isDigit('7')         : " + Character.isDigit('7'));
        System.out.println("Character.isLetter('J')        : " + Character.isLetter('J'));
        System.out.println("Character.toUpperCase('a')     : " + Character.toUpperCase('a'));
        System.out.println("a.compareTo(30)                : " + a.compareTo(30));
        System.out.println("a.equals(50)                   : " + a.equals(50));
    }

    // Read user input as text and convert it safely with Wrapper classes
    public static void parseInput(Scanner sc) {
        System.out.println("--- Parse User Input ---");
        System.out.print("Enter a whole number : ");
        String text = sc.nextLine().trim();
        try {
            int number = Integer.parseInt(text);
            System.out.println("Valid int  : " + number);
            System.out.println("In binary  : " + Integer.toBinaryString(number));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: \"" + text + "\" is not a whole number (NumberFormatException).");
        }

        System.out.print("Enter a decimal number : ");
        text = sc.nextLine().trim();
        try {
            double value = Double.parseDouble(text);
            System.out.println("Valid double : " + value);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: \"" + text + "\" is not a decimal number (NumberFormatException).");
        }

        System.out.print("Enter one character : ");
        text = sc.nextLine();
        if (text.isEmpty()) {
            System.out.println("Nothing entered.");
        } else {
            char ch = text.charAt(0);
            System.out.println("Is digit  : " + Character.isDigit(ch));
            System.out.println("Is letter : " + Character.isLetter(ch));
            System.out.println("Uppercase : " + Character.toUpperCase(ch));
        }
    }
}
