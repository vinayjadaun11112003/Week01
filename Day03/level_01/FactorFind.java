//Q.08 level 01:
import java.util.*;

public class FactorFind {

    public static void main(String[] args) {

        // Create a scanner to take user input
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a number to find its factors:");

        int number = input.nextInt();

        // Create an initial array to store factors with an initial size of 10
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Loop through numbers from 1 to the number to find its factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }

            // If the index reaches the max size of the factors array, resizing it
            if (index == maxFactor) {
                maxFactor *= 2;
                int[] temp = new int[maxFactor];

                // Copy existing factors into the new temporary array
                for (int a = 0; a < factors.length; a++) {
                    temp[a] = factors[a];
                }

                // Assigning back to factor
                factors = temp;
            }
        }

        // Print the factors
        System.out.println("The factors of " + number + " are:");
        for (int indexF = 0; indexF < index; indexF++) {
            System.out.print(factors[indexF] + " ");
        }

        // Close the scanner
        input.close();
    }
}
