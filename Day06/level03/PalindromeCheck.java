import java.util.Scanner;

public class PalindromeCheck {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // Characters at start and end do not match
            }
            start++;
            end--;
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter a text to check if it is a palindrome:");
        String input = scanner.nextLine();

        // Remove non-alphanumeric characters and convert to lowercase
        String processedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the input is a palindrome
        boolean result = isPalindrome(processedInput);

        // Display the result
        if (result) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }

        scanner.close();
    }
}
