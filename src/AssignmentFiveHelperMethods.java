/**
 * Assignment 5: Valid Parentheses (LeetCode 20)
 * <p>
 * Objective:
 * Solve the "Valid Parentheses" problem on LeetCode (Problem 20) using a stack in Java.
 * <p>
 * Requirements:
 * - LeetCode Account: You can create a free LeetCode account if you don't already have one.
 * - Problem Solving: Navigate to the "Valid Parentheses" problem (https://leetcode.com/problems/valid-parentheses/) and implement a Java solution.
 * - Submission: Take a screenshot of the submission on LeetCode, showing your code and submission status.
 * Save your screenshots as CIS_firstname_lastname.(picture format jpeg, jpg, png). If more than one screenshot add numbers to the file name.
 * <p>
 * Grading Rubric:
 * - Successful Submission (40%): The solution is accepted on LeetCode, passing all test cases.
 * - Explanation / Demonstration (40%)
 * - Code Clarity (20%): The submitted code is well-structured, uses meaningful variable names, and includes comments explaining the logic.
 */

import java.util.Stack;

public class AssignmentFiveHelperMethods {

    /**
     * Checks if the input string of parentheses is valid and matches end to end the opening and closing brackets.
     * Time complexity: O(n), where n is the length of the input string
     * Space complexity: O(n) in the worst case, where all characters are opening brackets
     * @param s The input string containing parentheses.
     * @return true if the string is valid, false otherwise.
     */
    public static boolean isValidUsesHelperMethod(String s) {
        // Create a stack to store the characters
        // Space complexity: O(n) in the worst case where all characters are opening brackets and the stack is filled with them.
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        // Time complexity: O(n) where n is the length of the input string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            // Time complexity: O(1) for each operation
            if (isOpeningBracket(c)) { // Time complexity: O(1)
                stack.push(c); // Time complexity: O(1)
                // Even if the character is a closing bracket, it will still be pushed onto the
                // stack.
            } else if (isClosingBracket(c)) { // Time complexity: O(1)
                // Time complexity: O(1)
                // If the stack is empty, return false
                if (stack.isEmpty()) { // Time complexity: O(1)
                    return false;
                }

                // Get the top character from the stack
                // Time complexity: O(1)
                char top = stack.pop(); // Time complexity: O(1)

                // Check if the top character matches the current character
                // Time complexity: O(1)
                if (!isMatchingPair(top, c)) { // Time complexity: O(1)
                    return false;
                }
            }
        }

        // Time complexity: O(1) 
        return stack.isEmpty();
    }


    /**
     * Helper method to check if a character is an opening bracket.
     *
     * @param c The character to check.
     * @return true if the character is an opening bracket, false otherwise.
     */
    private static boolean isOpeningBracket(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    /**
     * Helper method to check if a character is a closing bracket.
     *
     * @param c The character to check.
     * @return true if the character is a closing bracket, false otherwise.
     */
    private static boolean isClosingBracket(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    /**
     * Helper method to check if two characters form a matching pair of brackets.
     *
     * @param opening The opening bracket character.
     * @param closing The closing bracket character.
     * @return true if the characters form a matching pair, false otherwise.
     */
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '[' && closing == ']') ||
                (opening == '{' && closing == '}');
    }

    /**
     * Time complexity: O(m), where m is the number of test cases
     * Space complexity: O(1), as it uses a fixed amount of extra space
     */
    public static void run() {
        String[] testCases = {"()", "()[]{}", "(]", "([)]", "{[]}", "((()))", "(()())"};
        for (String testCase : testCases) {
            System.out.println("Input: " + testCase);
            System.out.println("Is valid: " + isValidUsesHelperMethod(testCase));
            System.out.println();
        }

        // Demonstrate when the method reaches the final stack.isEmpty() check
        String nestedBrackets = "((({{{[[[]]]}}})))";
        System.out.println("Demonstrating final stack.isEmpty() check:");
        System.out.println("Input: " + nestedBrackets);
        System.out.println("Is valid: " + isValidUsesHelperMethod(nestedBrackets));
    }
}