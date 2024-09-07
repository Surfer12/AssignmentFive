import java.util.Stack;

public class StackFirstLastComparison {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // Compare the first and last elements
        boolean areFirstAndLastEqual = compareFirstAndLast(stack);
        System.out.println("Are the first and last elements equal? " + areFirstAndLastEqual);
    }

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
