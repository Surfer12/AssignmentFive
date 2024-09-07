/*

20. Valid Parentheses
Easy
        Topics
Companies
        Hint
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


        Example 1:

        Input: s = "()"

        Output: true

        Example 2:

        Input: s = "()[]{}"

        Output: true

        Example 3:

        Input: s = "(]"

        Output: false

        Example 4:

        Input: s = "([])"

        Output: true



        Constraints:

        1 <= s.length <= 104
        s consists of parentheses only '()[]{}'.*/
/*The selected code is a multi-line comment in a Java file that describes the problem of validating parentheses in a given string. This problem is commonly known as "Valid Parentheses" and is often encountered in coding interviews and competitive programming.

The comment begins by stating the problem number and difficulty level:
```java
/*
20. Valid Parentheses
Easy
```
It then provides a brief description of the problem, specifying that the input string `s` contains only the characters '(', ')', '{', '}', '[' and ']', and the goal is to determine if the input string is valid. A string is considered valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

The comment also includes several examples to illustrate the expected output for different input strings:
```java
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true
```
Finally, the comment lists the constraints for the problem, indicating that the length of the input string `s` can range from 1 to 104 characters, and it consists solely of the specified parentheses characters:
```java
Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'
```
Overall, the comment provides a clear and concise explanation of the problem, including the requirements, examples, and constraints. It serves as a helpful guide for understanding and solving the "Valid Parentheses" problem.*/
import java.util.Stack;
public class Alt1ValidParen {
    public static void main(String[] args) {
        System.out.println(isValid("()"));      // true
        System.out.println(isValid("()[]{}"));  // true
        System.out.println(isValid("(]"));      // false
        System.out.println(isValid("([)]"));    // false
        System.out.println(isValid("{[]}"));    // true
    }

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
