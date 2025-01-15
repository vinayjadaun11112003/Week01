import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if the lengths of the texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create an array to store the frequency of characters for both texts
        int[] charFrequency = new int[256]; // ASCII character set

        // Find the frequency of characters in the first text
        for (int i = 0; i < text1.length(); i++) {
            charFrequency[text1.charAt(i)]++;
        }

        // Subtract the frequency of characters in the second text
        for (int i = 0; i < text2.length(); i++) {
            charFrequency[text2.charAt(i)]--;
        }

        // Check if all frequencies are zero
        for (int frequency : charFrequency) {
            if (frequency != 0) {
                return false; // Frequencies do not match
            }
        }

        return true; // Texts are anagrams
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter the first text:");
        String text1 = scanner.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println("Enter the second text:");
        String text2 = scanner.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}
