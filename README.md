# String Manipulation and Wrapper Classes in Java

A menu-driven Java console program that shows how **String methods** and **Wrapper classes** work, with simple examples you can run yourself.

**Team (Division 3A):** Sumeeti Prajapati, Prachi Patel, Pearl Patel

## What the program shows

- **String manipulation:** length, trim, upper/lower case, charAt, substring, replace, split, equals, reverse, palindrome check and vowel count
- **String vs StringBuilder vs StringBuffer:** appends the letter "a" 20,000 times with each class and prints the time taken
- **Autoboxing and unboxing:** automatic conversion between `int` and `Integer`
- **Wrapper class methods:** `Integer`, `Double`, `Boolean` and `Character` methods such as `parseInt`, `parseDouble`, `toBinaryString`, `isDigit` and `toUpperCase`
- **Input parsing:** reads user input and handles invalid values safely with `NumberFormatException`

## Files

| File | What it does |
|------|--------------|
| `Main.java` | Menu-driven program, String demo and speed test |
| `StringOps.java` | `reverse()`, `isPalindrome()` and `countVowels()` |
| `WrapperDemo.java` | `boxing()` for autoboxing and wrapper methods, `parseInput()` for user input |

## How to run

You need the Java Development Kit (JDK) installed.

```
javac *.java
java Main
```

## Menu

```
1. String manipulation demo
2. Palindrome and vowel checker (your own text)
3. String vs StringBuilder vs StringBuffer
4. Autoboxing, unboxing and Wrapper methods
5. Parse user input
0. Exit
```

## Note on the speed test

The times printed in option 3 change a little on every run and depend on the computer. `String` with `+` is always much slower than `StringBuilder` and `StringBuffer`, because it creates a new object each time.
