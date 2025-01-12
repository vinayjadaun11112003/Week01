import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent of an angle in degrees
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert angle to radians
        double sine = Math.sin(radians); // Calculate sine
        double cosine = Math.cos(radians); // Calculate cosine
        double tangent = Math.tan(radians); // Calculate tangent
        return new double[]{sine, cosine, tangent}; // Return all as an array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the angle in degrees
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        // Call the method to calculate trigonometric functions
        double[] trigFunctions = calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.println("Sine: " + trigFunctions[0]);
        System.out.println("Cosine: " + trigFunctions[1]);
        System.out.println("Tangent: " + trigFunctions[2]);
    }
}
