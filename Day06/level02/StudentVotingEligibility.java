import java.util.Scanner;
import java.util.Random;

public class StudentVotingEligibility {

    // Method to generate random 2-digit ages for students
    public static int[] generateRandomAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(90) + 10; // Generate random age between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); // Store age

            if (ages[i] < 0) {
                result[i][1] = "false"; // Negative age cannot vote
            } else if (ages[i] >= 18) {
                result[i][1] = "true"; // Age 18 or above can vote
            } else {
                result[i][1] = "false"; // Below 18 cannot vote
            }
        }
        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-15s%n", "Age", "Can Vote?");
        System.out.println("-----------------------");
        for (String[] row : results) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random ages
        int[] ages = generateRandomAges(numberOfStudents);

        // Check voting eligibility
        String[][] votingResults = checkVotingEligibility(ages);

        // Display results
        System.out.println("\nVoting Eligibility Results:");
        displayResults(votingResults);

        scanner.close();
    }
}
