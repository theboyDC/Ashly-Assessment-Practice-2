package za.co.wethinkcode;

public class Fundamentals {

    // ============================
    // TODO: Question 1
    // ============================

    /**
     * Complete the method body so that it:
     * Returns the characters of the string in reverse order.
     * Returns an empty string ("") for a null or empty input.
     * No starter code is provided — write the full method body.
     */
    public static String reverseString(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = s.length()-1;i>=0; i--) {
                result.append(s.charAt(i));
            }
            return result.toString();
        }
    }
//"hello",       "olleh"

    // ============================
    // TODO: Question 2
    // ============================

    /**
     * Complete the method body so that it:
     * Returns true if the string reads the same forwards and backwards,
     * ignoring case and spaces.
     * Returns false for a null or empty string.
     * No starter code is provided — write the full method body.
     */
    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        String cleaned = s.replaceAll("\\s+", "").toLowerCase();
        if (cleaned.isEmpty()) {
            return false;
        }
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // ============================
    // TODO: Question 3
    // ============================

    /**
     * This method must:
     * Return "FizzBuzz" if n is divisible by both 3 and 5.
     * Return "Fizz" if n is divisible by 3 only.
     * Return "Buzz" if n is divisible by 5 only.
     * Return the number as a String otherwise.
     * No starter code is provided — write the full method body.
     */
    public static String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            String converted = Integer.toString(n);
            return converted;
        }
    }

    // ============================
    // Question 4 — wordCount
    // ============================

    /**
     * Complete the method body so that it:
     * Returns the number of words in the string.
     * A word is any sequence of non-whitespace characters.
     * Handles leading, trailing, and multiple consecutive spaces correctly.
     * Returns 0 for a null or empty string.
     * No starter code is provided — write the full method body.
     */
    public static int wordCount(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        String trimmed = s.trim();
        if (trimmed.isEmpty()) {
            return 0;
        }
        String[] words = trimmed.split("\\s+");
        return words.length;
    }
}

