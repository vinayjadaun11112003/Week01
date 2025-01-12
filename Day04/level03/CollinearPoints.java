// Program 4: Check Collinearity of Three Points
import java.util.*;

class CollinearPoints {
    // Method to check collinearity using slope formula
    public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Check if all slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coordinates of three points
        System.out.print("Enter x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Enter x3 and y3: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Check collinearity using slope formula
        boolean collinearBySlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using slope method: " + collinearBySlope);

        // Check collinearity using area of triangle formula
        boolean collinearByArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear using area method: " + collinearByArea);

        // Sample test for A(2,4), B(4,6), C(6,8)
        System.out.println("Sample Test for A(2,4), B(4,6), C(6,8):");
        System.out.println("Collinear using slope method: " + areCollinearUsingSlope(2, 4, 4, 6, 6, 8));
        System.out.println("Collinear using area method: " + areCollinearUsingArea(2, 4, 4, 6, 6, 8));
    }
}
