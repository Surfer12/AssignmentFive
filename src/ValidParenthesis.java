/*
Assignment 5: Valid Parentheses (LeetCode 20)
https://leetcode.com/problems/valid-parentheses/description/
Objective:

Solve the "Valid Parentheses" problem on LeetCode (Problem 20) using a stack in Java.

Requirements:

LeetCode Account: You can create a free LeetCode account if you don't already have one.
Problem Solving: Navigate to the "Valid Parentheses" problem (https://leetcode.com/problems/valid-parentheses/Links to an external site.) and implement a Java solution.
        Submission:
        Take a screenshot of the submission on LeetCode, showing your code and submission status.
        Save your screenshots as CIS_firstname_lastname.(picture format jpeg, jpg, png). If more than one screenshot add numbers to the file name.
Grading Rubric:

Successful Submission (40%): The solution is accepted on LeetCode, passing all test cases.
        Explanation / Demonstration (40%)
Code Clarity (20%): The submitted code is well-structured, uses meaningful variable names, and includes comments explaining the logic.*/
import java.util.Stack;
/**
 * The ValidParntheses class provides a method to check if a given string of parentheses is valid.
 * A string is considered valid if all types of parentheses are closed and opened in the correct order.
 */
public class ValidParenthesis {

    /**
     * The main method to test the isValid method with various test cases.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println(isValid("()"));      // true
        System.out.println(isValid("()[]{}"));  // true
        System.out.println(isValid("(]"));      // false
        System.out.println(isValid("([)]"));    // false
        System.out.println(isValid("{[]}"));    // true
        System.out.println(isValid("([{}])"));
        System.out.println(isValid("([]{})"));

    }

/**
 * Checks if the input string of parentheses is valid.
 *
 * A string is considered valid if all types of parentheses are closed and opened in the correct order.
 *
 * Time Complexity: O(n)
 * - The method iterates through each character in the input string `s` exactly once.
 * - Each character is either pushed onto the stack or popped from the stack, both of which are O(1) operations.
 * - Therefore, the overall time complexity is O(n), where n is the length of the string.
 *
 * @param s The input string containing parentheses.
 * @return true if the string is valid, false otherwise.
 */
public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
        if (c == '(' || c == '[' || c == '{') {
            stack.push(c);
        } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
            stack.pop();
        } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
            stack.pop();
        } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
            stack.pop();
        } else {
            return false;
        }
    }
    return stack.isEmpty();
}
}