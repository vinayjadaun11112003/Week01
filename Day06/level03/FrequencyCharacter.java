import java.util.Scanner;

public class FrequencyCharacter {
    public static String[][] findFrequency(String text) {
        // Create an array to store frequency of characters (ASCII range 0 to 255)
        int[] frequency = new int[256];
        
        // Loop through the text and count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            frequency[character]++;
        }
        
        // Create a list to store characters and their frequencies
        String[][] result = new String[text.length()][2];
        int index = 0;
        
        // Loop through the frequency array and store non-zero frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Character
                result[index][1] = String.valueOf(frequency[i]); // Frequency
                index++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Call the method to get the frequency of characters
        String[][] frequencies = findFrequency(text);

        // Display the result
        System.out.println("Character Frequency:");
        for (int i = 0; i < frequencies.length && frequencies[i][0] != null; i++) {
            System.out.println(frequencies[i][0] + ": " + frequencies[i][1]);
        }

        scanner.close();
    }
}
