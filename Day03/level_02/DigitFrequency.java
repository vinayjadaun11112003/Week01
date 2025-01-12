import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        // Creating a scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking the input from the user
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        // Creating an array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Looping through each digit of the number
        while (number > 0) {
            int digit = (int)(number % 10); // Get the last digit
            frequency[digit]++; // Increase the frequency for this digit
            number /= 10; // Remove the last digit from the number
        }

        // Printing the frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        // Close the scanner
        input.close();
    }
}
