import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray(); // Convert the string to a character array
        int[] frequencies = new int[characters.length]; // Array to store frequencies

        // Initialize all frequencies to -1 (indicating unprocessed characters)
        for (int i = 0; i < frequencies.length; i++) {
            frequencies[i] = -1;
        }

        // Outer loop to iterate through each character
        for (int i = 0; i < characters.length; i++) {
            if (frequencies[i] == 0) {
                continue; // Skip already processed characters
            }

            int count = 1; // Initialize frequency of current character to 1

            // Inner loop to check for duplicate characters
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    count++;
                    frequencies[j] = 0; // Mark duplicate character as processed
                }
            }

            frequencies[i] = count; // Store frequency of current character
        }

        // Create a 1D String array to store characters and their frequencies
        int resultSize = 0;
        for (int freq : frequencies) {
            if (freq > 0) {
                resultSize++;
            }
        }

        String[] result = new String[resultSize];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (frequencies[i] > 0) {
                result[index] = characters[i] + ": " + frequencies[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Find the frequency of characters
        String[] frequencies = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }

        scanner.close();
    }
}
