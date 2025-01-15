import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        height = height / 100;
        return weight / (height * height);
    }

    // Method to determine BMI Status
    public static String determineBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to calculate BMI and store results in a 2D String array
    public static String[][] computeBMIResults(double[][] data) {
        String[][] results = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = calculateBMI(weight, height);
            String status = determineBMIStatus(bmi);

            results[i][0] = String.format("%.2f", weight); // Weight
            results[i][1] = String.format("%.2f", height); // Height
            results[i][2] = String.format("%.2f", bmi);    // BMI
            results[i][3] = status;                       // Status
        }

        return results;
    }

    // Method to display the results
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("---------------------------------------------");

        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = 10;

        double[][] data = new double[numberOfPeople][2];

        // Take user input for weights and heights
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.println("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Compute BMI and statuses
        String[][] results = computeBMIResults(data);

        // Display the results
        System.out.println("\nBMI Results:");
        displayResults(results);

        scanner.close();
    }
}
