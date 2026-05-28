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
//        if (s == null || s.equals("")) {
//            return false;
//        }
//        else if (s.equals("     ")){
//            return false;
//        }
//            String cleaned = s.replaceAll("\\s+", "").toLowerCase();
//
//            String reversed = new StringBuilder(cleaned).reverse().toString();
//            System.out.println(s);
//            return cleaned.equals(reversed);
        return false;
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
//        int count = 0;
//        if (s == null || s.equals("")) {
//            return 0;
//        }
//        else if (s.equals("     ")){
//            return 0;
//        }
//        String s_clean = s.trim();
//        String[] s_list = s_clean.split("\\s+");
//        for(String s_count: s_list){
//            count++;
//
//        }
//        return count;
        return 0;
//    }


    }
}

