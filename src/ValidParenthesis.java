import java.util.Stack;

/**
 * The ValidParenthesis class provides a method to check if a given string of parentheses is valid.
 * A string is considered valid if all types of parentheses are closed and opened in the correct order.
 */
public class ValidParenthesis {

    // Private constructor to prevent instantiation
    private ValidParenthesis() {
    }

    /**
     * Checks if the input string of parentheses is valid.
     *
     * @param s The input string containing parentheses.
     * @return true if the string is valid, false otherwise.
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (isOpeningBracket(c)) {
                stack.push(c);
            } else if (isClosingBracket(c) && !stack.isEmpty() && matches(stack.peek(), c)) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    /**
     * Checks if the character is an opening bracket.
     *
     * @param c The character to check.
     * @return true if the character is an opening bracket, false otherwise.
     */
    private static boolean isOpeningBracket(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    /**
     * Checks if the character is a closing bracket.
     *
     * @param c The character to check.
     * @return true if the character is a closing bracket, false otherwise.
     */
    private static boolean isClosingBracket(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    /**
     * Checks if the opening and closing brackets match.
     *
     * @param open  The opening bracket.
     * @param close The closing bracket.
     * @return true if the brackets match, false otherwise.
     */
    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}