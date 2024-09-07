import java.util.Stack;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "racecar";
        boolean isPalindrome = isPalindrome(input);
        System.out.println("Is the input a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String input) {
        // Remove all non-alphanumeric characters and convert the input to lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use two pointers to compare characters from the start and end of the string
        int start = 0;
        int end = cleanInput.length() - 1;

        while (start < end) {
            if (cleanInput.charAt(start) != cleanInput.charAt(end)) {
                return false; // Characters do not match, not a palindrome
            }
            start++;
            end--;
        }

        return true; // All characters match, input is a palindrome
    }
}

