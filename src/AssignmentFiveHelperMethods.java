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
     * Checks if the input string of parentheses is valid.
     *
     * @param s The input string containing parentheses.
     * @return true if the string is valid, false otherwise.
     */
    public static boolean isValidUsesHelperMethod(String s) {
        // Create a stack to store the characters
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (isOpeningBracket(c)) {
                stack.push(c);
            } else if (isClosingBracket(c)) {
                // If the stack is empty, return false
                if (stack.isEmpty()) {
                    return false;
                }

                // Get the top character from the stack
                char top = stack.pop();

                // Check if the top character matches the current character
                if (!isMatchingPair(top, c)) {
                    return false;
                }
            }
        }

        // If the stack is empty, return true
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
}