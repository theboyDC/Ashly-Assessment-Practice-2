# Assessment 000 - Java Fundamentals & Problem Solving (Syntax)

## Learning Outcomes Assessed

- Understanding of basic Java syntax
- Conditional statements
- Methods and return types
- Basic loops
- Simple algorithms (problem-solving)

---

## Assessment Structure

This assessment has two sections:

- [Coding Assessment](#coding-assessment) — fix and complete methods in `Fundamentals.java`
- [Comprehension Questions](#comprehension-question-section) — written responses in `answers.txt`

You can answer them in any order.

---

## Scoring & Weighting

| Component                   | Weight  |
| --------------------------- | ------- |
| Coding Section (unit tests) | **40%** |
| Comprehension Section       | **60%** |

### Coding Section

Your coding score is determined by the number of tests you pass.

Let:
- T = total number of coding tests
- P = number of tests you pass

```
Coding Score = (P / T) × 40%
```

### Comprehension Section

Your comprehension score is determined by the quality and correctness of your written responses in `answers.txt`.

Let:
- Q = total marks available across all comprehension questions
- C = marks earned

```
Comprehension Score = (C / Q) × 60%
```

### Final Score & Pass Mark

```
Final Score = Coding Score + Comprehension Score
```

To pass, your Final Score must be **60% or higher**.

---

## How to Run Your Tests

To compile and run all your tests:

```bash
mvn clean compile test
```

---

## Fundamentals Coding Assessment

This assessment consists of four Java methods inside the `Fundamentals` class. Each method has a partially written implementation. Your task is to **fix the bugs**, **complete the missing logic**, and **ensure all tests pass**.

## Project Structure

```
fundamentals-assessment/
├── src/
│   ├── main/
│   │   └── java/za/co/wethinkcode/
│   │       └── Fundamentals.java          # <-- This is where you write your solutions
│   └── test/
│       └── java/za/co/wethinkcode/
│           └── FundamentalsTest.java      # <-- These are the tests you must make pass
├── answers.txt                            # <-- Write your long-format answers here
└── README.md                              # <-- Assessment instructions (this file)
```

---
## Coding Assessment

## Question 1 — `reverseString(String s)`

This method must:

- Returns the characters of the string in reverse order.
- Returns an empty string ("") for a null or empty input.

Method signature:

```java
public static String reverseString(String s) {}
```

---

## Question 2 — `isPalindrome(String s)`

This method must:

- Returns true if the string reads the same forwards and backwards, ignoring case and spaces.
- Returns false for a null or empty string.

Method signature:

```java
public static boolean isPalindrome(String s) {}
```
---

## Question 3 — `String fizzBuzz(int n)`

This method must:

- Return "FizzBuzz" if n is divisible by both 3 and 5.
- Return "Fizz" if n is divisible by 3 only.
- Return "Buzz" if n is divisible by 5 only.
- Return the number as a String otherwise.

Method signature:

```java
public static String fizzBuzz(int n) {}
```

---

## Question 4 — `wordCount(String s)`

Complete the method body so that it:

- Returns the number of words in the string.
- A word is any sequence of non-whitespace characters.
- Handles leading, trailing, and multiple consecutive spaces correctly.
- Returns 0 for a null or empty string.
  
Method signature:

```java
public static int wordCount(String s) {}
```


---

## Comprehension Question Section

### Comprehension Question 1 — Access Modifiers (5 Points)

A junior developer on your team has been declaring every field and method in their classes as `public`. Your tech lead flags this in a code review and says "you need to think carefully about visibility." The junior developer does not understand what the problem is — they say "making everything public just means everything works."

Explain access modifiers to this developer. Your explanation should cover what access modifiers are and why they matter, what `public`, `private`, and `protected` each mean and when you would use each one, why making everything `public` is problematic in a real project, and give a concrete Java example that shows the difference.

---

### Comprehension Question 2 — Constructors and Methods (10 Points)

A teammate who is new to Java keeps getting confused between constructors and methods. They understand that both live inside a class, but they cannot tell them apart or explain what each one is for.

Explain both to your teammate. Your explanation should cover what a constructor is and what it aims to achieve when a class is used, what a method is and what it aims to achieve, the key differences between them — including naming, return types, and when each is called — and give a simple Java example that shows both in the same class.

---

### Comprehension Question 3 — Loops (10 Points)

A Python developer joining a Java team has never used Java loops before. They know how to loop in Python but keep running into compile errors when trying to write the same thing in Java. They have also noticed that Java seems to have more than one way to write a loop and are not sure when to use which.

In your own words, explain loops in Java to this developer. Your explanation should cover how the standard `for` loop works including its three parts, what the enhanced `for` loop (for-each) is and how it works, when you would choose one over the other, and how a `while` loop differs from both and when you would reach for it instead. Include enough Java syntax that this developer could go and write all three correctly.

---

### Comprehension Question 4 — Classes and Objects (10 Points)

A student who has only ever written procedural scripts is about to write their first Java programme. They understand what variables and functions are, but they have never worked with classes or objects before and do not understand why they would need them.

In your own words, explain classes and objects to this student. Your explanation should cover what a class is and why we use them, what an object is and how it is created from a class, why grouping data and behaviour together in a class is better than having separate variables and functions scattered through a script, and what this looks like in practice with a simple Java example.

## Your Goal

Fix all methods in `Fundamentals.java` so that:

- The code is valid Java and compiles without errors
- Each method behaves according to the rules above
- All unit tests pass successfully

---

Good luck — and remember to think carefully about your loops, conditions, types, and syntax!