import java.util.*;

public class AgeAndHeight {

    public static void main(String[] args) {
        // Storing the names of three friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Initializing an array for their ages
        int[] ages = new int[3];

        // Initializing an array for their heights
        double[] heights = new double[3];

        // Creating a new scanner object to take input
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age and height for " + names[i] + ": ");

            // Input age
            ages[i] = scanner.nextInt();

            // Input height
            heights[i] = scanner.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        // Finding the youngest and tallest friend
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i; // Check youngest
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i; // Check tallest
            }
        }

        // Printing youngest friend's name
        System.out.println("Youngest friend is: " + names[youngestIndex]);

        // Printing tallest friend's name
        System.out.println("Tallest friend is: " + names[tallestIndex]);

        // Closing the scanner object
        scanner.close();
    }
}
