import java.util.Scanner;

public class DistributeChocolates {

    // Method to calculate chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor; // Calculate how many chocolates each child gets
        int remainder = number % divisor; // Calculate the remaining chocolates
        return new int[]{quotient, remainder}; // Return both as an array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Call the method to calculate distribution and remainder
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display the results
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
