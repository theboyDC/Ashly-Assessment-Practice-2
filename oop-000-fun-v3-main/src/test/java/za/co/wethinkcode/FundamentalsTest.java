package za.co.wethinkcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Fundamentals")
class FundamentalsTest {

    // ============================
    // Question 1 — reverseString
    // ============================
    @Nested
    @DisplayName("reverseString()")
    class ReverseStringTests {

        @ParameterizedTest(name = "reverseString({0}) == {1}")
        @MethodSource("reverseProvider")
        @DisplayName("Returns the reversed string")
        void returnsReversedString(String input, String expected) {
            assertEquals(expected, Fundamentals.reverseString(input));
        }

        static Stream<Arguments> reverseProvider() {
            return Stream.of(
                    Arguments.of("hello",       "olleh"),
                    Arguments.of("jeff",        "ffej"),
                    Arguments.of("a",           "a"),
                    Arguments.of("crowd",           "dworc"),
                    Arguments.of("racecar",     "racecar"),
                    Arguments.of("Hello World", "dlroW olleH"),
                    Arguments.of("bUsanG is a GoaT", "TaoG a si GnasUb"),
                    Arguments.of("12345",      "54321")
            );
        }

        @ParameterizedTest(name = "returns empty string for null or empty input")
        @NullAndEmptySource
        @DisplayName("Returns empty string for null or empty input")
        void returnsEmptyForNullOrEmpty(String input) {
            assertEquals("", Fundamentals.reverseString(input));
        }

        @Test
        @DisplayName("Returns empty string for empty input")
        void returnsEmptyForEmptyInput() {
            assertEquals("", Fundamentals.reverseString(""));
        }

        @Test
        @DisplayName("Returns empty string for null input")
        void returnsEmptyForNullInput() {
            assertEquals("", Fundamentals.reverseString(null));
        }

        @Test
        @DisplayName("Reversing twice returns original string")
        void reversingTwiceReturnsOriginal() {
            String input = "WeThinkCode123!";
            String reversed = Fundamentals.reverseString(input);
            String doubleReversed = Fundamentals.reverseString(reversed);

            assertEquals(input, doubleReversed);
        }

        @Test
        @DisplayName("Length of string remains unchanged after reversal")
        void lengthRemainsSame() {
            String input = "Some random string with spaces";
            String reversed = Fundamentals.reverseString(input);

            assertEquals(input.length(), reversed.length());
        }

        @Test
        @DisplayName("First character becomes last and last becomes first")
        void firstAndLastCharactersSwap() {
            String input = "abcdef";
            String reversed = Fundamentals.reverseString(input);

            assertEquals(input.charAt(0), reversed.charAt(reversed.length() - 1));
            assertEquals(input.charAt(input.length() - 1), reversed.charAt(0));
        }

        @Test
        @DisplayName("Handles special characters correctly")
        void handlesSpecialCharacters() {
            String input = "!@# $%^";
            String expected = "^%$ #@!";

            assertEquals(expected, Fundamentals.reverseString(input));
        }

        @Test
        @DisplayName("Handles whitespace correctly")
        void preservesWhitespacePositions() {
            String input = "  ab cd  ";
            String expected = "  dc ba  ";

            assertEquals(expected, Fundamentals.reverseString(input));
        }

        @Test
        @DisplayName("Handles long strings")
        void handlesLongStrings() {
            String input = "a".repeat(1000) + "b";
            String reversed = Fundamentals.reverseString(input);

            assertEquals('b', reversed.charAt(0));
            assertEquals(1001, reversed.length());
        }

        @Test
        @DisplayName("Different inputs produce different outputs")
        void differentInputsProduceDifferentOutputs() {
            String input1 = "abc";
            String input2 = "abcd";

            String result1 = Fundamentals.reverseString(input1);
            String result2 = Fundamentals.reverseString(input2);

            assertNotEquals(result1, result2);
        }
    }

    // ============================
    // Question 2 — isPalindrome
    // ============================
    @Nested
    @DisplayName("isPalindrome()")
    class IsPalindromeTests {

        @ParameterizedTest(name = "{0} is a palindrome")
        @ValueSource(strings = {"racecar", "madam", "level", "a", "noon", "Was it a car or a cat I saw"})
        @DisplayName("Returns true for palindromes (ignoring case and spaces)")
        void returnsTrueForPalindromes(String input) {
            assertTrue(Fundamentals.isPalindrome(input));
        }

        @ParameterizedTest(name = "{0} is not a palindrome")
        @ValueSource(strings = {"hello", "world", "java", "openai", "abcXYZ123", "palindrome"})
        @DisplayName("Returns false for non-palindromes")
        void returnsFalseForNonPalindromes(String input) {
            assertFalse(Fundamentals.isPalindrome(input));
        }

        @ParameterizedTest(name = "returns false for null or empty input")
        @NullAndEmptySource
        @DisplayName("Returns false for null or empty input")
        void returnsFalseForNullOrEmpty(String input) {
            assertFalse(Fundamentals.isPalindrome(input));
        }

        @Test
        @DisplayName("Palindrome with mixed case and spaces")
        void palindromeWithMixedCaseAndSpaces() {
            String input = "A man a plan a canal Panama";
            assertTrue(Fundamentals.isPalindrome(input));
        }

        @Test
        @DisplayName("Reversing a palindrome results in the same string (ignoring case and spaces)")
        void reversingPalindromeRemainsSame() {
            String input = "Never odd or even";
            String cleaned = input.replaceAll("\\s+", "").toLowerCase();

            String reversed = new StringBuilder(cleaned).reverse().toString();

            assertEquals(cleaned, reversed);
            assertTrue(Fundamentals.isPalindrome(input));
        }

        @Test
        @DisplayName("Non-palindrome fails even if first and last characters match")
        void matchingEndsButNotPalindrome() {
            String input = "abca"; // starts and ends with 'a' but not palindrome
            assertFalse(Fundamentals.isPalindrome(input));
        }

        @Test
        @DisplayName("Palindrome property holds for dynamically generated input")
        void generatedPalindromeShouldReturnTrue() {
            String half = "abcXYZ";
            String palindrome = half + new StringBuilder(half).reverse();

            assertTrue(Fundamentals.isPalindrome(palindrome));
        }

        @Test
        @DisplayName("Handles long palindrome strings")
        void handlesLongPalindrome() {
            String base = "a".repeat(500);
            String input = base + "b" + base;

            assertTrue(Fundamentals.isPalindrome(input));
        }

        @Test
        @DisplayName("Handles long non-palindrome strings")
        void handlesLongNonPalindrome() {
            String input = "a".repeat(1000) + "b";
            assertFalse(Fundamentals.isPalindrome(input));
        }

        @Test
        @DisplayName("Whitespace-only string returns false")
        void whitespaceOnlyReturnsFalse() {
            assertFalse(Fundamentals.isPalindrome("     "));
        }

        @Test
        @DisplayName("Single character is always a palindrome")
        void singleCharacterIsPalindrome() {
            assertTrue(Fundamentals.isPalindrome("x"));
        }

        @Test
        @DisplayName("Two different characters is not a palindrome")
        void twoDifferentCharacters() {
            assertFalse(Fundamentals.isPalindrome("ab"));
        }

    }


    // ============================
    // Question 3 — fizzBuzz
    // ============================
    @Nested
    @DisplayName("fizzBuzz()")
    class FizzBuzzTests {

        @ParameterizedTest(name = "fizzBuzz({0}) == {1}")
        @MethodSource("fizzBuzzProvider")
        @DisplayName("Returns correct FizzBuzz output")
        void returnsCorrectOutput(int n, String expected) {
            assertEquals(expected, Fundamentals.fizzBuzz(n));
        }

        static Stream<Arguments> fizzBuzzProvider() {
            return Stream.of(
                    Arguments.of(15,  "FizzBuzz"),
                    Arguments.of(30,  "FizzBuzz"),
                    Arguments.of(45,  "FizzBuzz"),
                    Arguments.of(3,   "Fizz"),
                    Arguments.of(9,   "Fizz"),
                    Arguments.of(21,  "Fizz"),
                    Arguments.of(5,   "Buzz"),
                    Arguments.of(10,  "Buzz"),
                    Arguments.of(25,  "Buzz"),
                    Arguments.of(1,   "1"),
                    Arguments.of(2,   "2"),
                    Arguments.of(7,   "7"),
                    Arguments.of(11,  "11")
            );
        }
    }

    // ============================
    // Question 4 — wordCount
    // ============================
    @Nested
    @DisplayName("wordCount()")
    class WordCountTests {

        @ParameterizedTest(name = "wordCount({0}) == {1}")
        @MethodSource("wordCountProvider")
        @DisplayName("Returns correct word count")
        void returnsCorrectCount(String input, int expected) {
            assertEquals(expected, Fundamentals.wordCount(input));
        }

        static Stream<Arguments> wordCountProvider() {
            return Stream.of(
                    Arguments.of("hello",              1),
                    Arguments.of("hello world",        2),
                    Arguments.of("one two three",      3),
                    Arguments.of("  leading spaces",   2),
                    Arguments.of("trailing spaces  ",  2),
                    Arguments.of("  both  sides  ",    2),
                    Arguments.of("multiple   gaps",    2)
            );
        }

        @ParameterizedTest(name = "returns 0 for null or empty input")
        @NullAndEmptySource
        @DisplayName("Returns 0 for null or empty strings")
        void returnsZeroForNullOrEmpty(String input) {
            assertEquals(0, Fundamentals.wordCount(input));
        }

        @Test
        @DisplayName("Returns 0 for string with only spaces")
        void returnsZeroForSpacesOnly() {
            assertEquals(0, Fundamentals.wordCount("     "));
        }

        @Test
        @DisplayName("Handles long strings with many words")
        void handlesLongStrings() {
            String input = "word ".repeat(1000).trim();
            assertEquals(1000, Fundamentals.wordCount(input));
        }

        @Test
        @DisplayName("Handles string with tabs and newlines as whitespace")
        void handlesTabsAndNewlines() {
            String input = "word1\tword2\nword3  word4";
            assertEquals(4, Fundamentals.wordCount(input));
        }

        @Test
        @DisplayName("Handles sentence with punctuation")
        void handlesPunctuation() {
            String input = "Hello, world! This is a test.";
            assertEquals(6, Fundamentals.wordCount(input));
        }
    }
}