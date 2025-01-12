import java.util.*;

class BMI_Calculator {
    public static void main(String[] args) {
        // Creating a Scanner object to take user input.
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the number of persons: ");
        int n = input.nextInt();

        // Declaring arrays to store height, weight, BMI, and status.
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Taking input of height and weight for each person.
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            height[i] = input.nextDouble();
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weight[i] = input.nextDouble();

            // Converting height to meters and calculating BMI.
            height[i] /= 100; // Convert cm to meters
            bmi[i] = weight[i] / Math.pow(height[i], 2);

            // Categorizing BMI.
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Printing the height, weight, BMI, and status of each person.
        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("  Height: " + height[i] * 100 + " cm");
            System.out.println("  Weight: " + weight[i] + " kg");
            System.out.println("  BMI: " + bmi[i]);
            System.out.println("  Status: " + status[i]);
        }

        // Closing the Scanner object
        input.close();
    }
}
