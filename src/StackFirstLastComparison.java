import java.util.Stack;

/**
 * The StackFirstLastComparison class provides a method to compare the first and last elements
 * of a stack of strings.
 */
public class StackFirstLastComparison {

    /**
     * The main method is the entry point of the application. It creates a stack, pushes some
     * elements onto it, and compares the first and last elements.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // Compare the first and last elements
        boolean areFirstAndLastEqual = compareFirstAndLast(stack);
        System.out.println("Are the first and last elements equal? " + areFirstAndLastEqual);
    }

    /**
     * Compares the first and last elements of the given stack.
     *
     * @param stack The stack of strings to compare.
     * @return true if the first and last elements are equal, false otherwise.
     */
    public static boolean compareFirstAndLast(Stack<String> stack) {
        if (stack.isEmpty()) {
            return false; // Stack is empty, no elements to compare
        }

        // Get the last element (top of the stack)
        String lastElement = stack.peek();

        // Use an auxiliary stack to access the first element
        Stack<String> auxStack = new Stack<>();
        while (!stack.isEmpty()) {
            auxStack.push(stack.pop());
        }

        // Get the first element (bottom of the original stack)
        String firstElement = auxStack.peek();

        // Restore the original stack
        while (!auxStack.isEmpty()) {
            stack.push(auxStack.pop());
        }

        // Compare the first and last elements
        return firstElement.equals(lastElement);
    }
}

/*You're absolutely correct! The time complexity of the `compareFirstAndLast` method is indeed **O(n)**.

**Explanation:**

The method performs the following steps:

1. **Checks if the stack is empty:** This is a constant-time operation, O(1).
2. **Gets the last element:** Using `peek()` is also O(1).
3. **Moves elements to the auxiliary stack:** This involves popping all elements from the original stack and pushing them onto the auxiliary stack, taking O(n) time where 'n' is the number of elements in the stack.
4. **Gets the first element:**  `peek()` on the auxiliary stack is O(1).
5. **Restores the original stack:**  Similar to step 3, this also takes O(n) time.
6. **Compares the elements:**  String comparison is generally considered O(1) for short strings.

The dominant operations here are the two loops that iterate through the entire stack, each taking O(n) time.  Therefore, the overall time complexity of the `compareFirstAndLast` method is O(n) + O(n) which simplifies to O(n). */