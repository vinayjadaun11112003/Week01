import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3; // Sum of all sides
    }

    // Method to calculate the number of rounds needed for a 5 km run
    public static int calculateRounds(double perimeter) {
        double distanceToRun = 5000; // 5 km in meters
        return (int) Math.ceil(distanceToRun / perimeter); // Rounds up to the nearest whole number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the sides of the triangle
        System.out.print("Enter the length of the first side (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the second side (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of the third side (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = calculatePerimeter(side1, side2, side3);
        System.out.println("The perimeter of the park is: " + perimeter + " meters");

        // Calculate the number of rounds needed
        int rounds = calculateRounds(perimeter);
        System.out.println("The athlete needs to complete " + rounds + " rounds to finish a 5 km run.");
    }
}
