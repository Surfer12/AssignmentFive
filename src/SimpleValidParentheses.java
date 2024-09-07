/*
 * Assignment 5: Valid Parentheses (LeetCode 20)
 *
 * Objective:
 *
 * Solve the "Valid Parentheses" problem on LeetCode (Problem 20) using a stack
 * in Java.
 *
 * Requirements:
 *
 * LeetCode Account: You can create a free LeetCode account if you don't already
 * have one.
 * Problem Solving: Navigate to the "Valid Parentheses" problem
 * (https://leetcode.com/problems/valid-parentheses/Links to an external site.)
 * and implement a Java solution.
 * Submission:
 * Take a screenshot of the submission on LeetCode, showing your code and
 * submission status.
 * Save your screenshots as CIS_firstname_lastname.(picture format jpeg, jpg,
 * png). If more than one screenshot add numbers to the file name.
 * Grading Rubric:
 *
 * Successful Submission (40%): The solution is accepted on LeetCode, passing
 * all test cases.
 * Explanation / Demonstration (40%)
 * Code Clarity (20%): The submitted code is well-structured, uses meaningful
 * variable names, and includes comments explaining the logic.
 */

import java.util.Stack;

public class SimpleValidParentheses {

    /**
     * Checks if the input string of parentheses is valid.
     *
     * @param s The input string containing parentheses.
     * @return true if the string is valid, false otherwise.
     */
    public static boolean isValid(String s) {
        // Create a stack to store the characters
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // If the stack is empty, return false
                if (stack.isEmpty()) {
                    return false;
                }
                // Get the top character from the stack
                char top = stack.pop();
                // Check if the top character matches the current character
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // If the stack is empty, return true
        return stack.isEmpty();
    }
}