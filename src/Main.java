/**
 * The Main class to test the ValidParenthesis class.
 */
public class Main {
    public static void main(String[] args) {
        testValidParenthesis();
    }

    /**
     * Tests the ValidParenthesis.isValid method with various test cases.
     */
    private static void testValidParenthesis() {
        System.out.println(ValidParenthesis.isValid("()")); // true
        System.out.println(ValidParenthesis.isValid("()[]{}")); // true
        System.out.println(ValidParenthesis.isValid("(]")); // false
        System.out.println(ValidParenthesis.isValid("([)]")); // false
        System.out.println(ValidParenthesis.isValid("{[]}")); // true
    }
}