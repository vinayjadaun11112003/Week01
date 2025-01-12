import java.util.*;

class BonusCalculator {

    public static void main(String[] args) {
        // Creating a scanner object to take input
        Scanner input = new Scanner(System.in);

        // Creating a 2D array to store previous and new salary along with years of experience
        int[][] salaryAndYearsOfService = new int[5][3];
        int bonus = 1000;

        for (int row = 0; row < salaryAndYearsOfService.length; row++) {
            System.out.print("Enter previous salary of employee " + (row + 1) + ": ");
            salaryAndYearsOfService[row][0] = input.nextInt();

            System.out.print("Enter years of service of employee " + (row + 1) + ": ");
            salaryAndYearsOfService[row][1] = input.nextInt();
        }

        // Checking condition
        for (int row = 0; row < salaryAndYearsOfService.length; row++) {
            for (int col = 0; col < salaryAndYearsOfService[row].length; col++) {
                if (salaryAndYearsOfService[row][1] > 5) {
                    // If salary is greater than 5 years, add bonus
                    salaryAndYearsOfService[row][2] = salaryAndYearsOfService[row][0] + bonus;
                } else {
                    // Else, no change in salary
                    salaryAndYearsOfService[row][2] = salaryAndYearsOfService[row][0];
                }
            }
        }

        // Printing the new values accordingly
        for (int row = 0; row < salaryAndYearsOfService.length; row++) {
            System.out.println("New salary of employee " + (row + 1) + " is: " + salaryAndYearsOfService[row][2]);
            if (salaryAndYearsOfService[row][1] > 5) {
                System.out.println("New bonus of employee " + (row + 1) + " is: " + bonus);
            } else {
                System.out.println("No bonus for employee " + (row + 1));
            }
        }

        // Closing the scanner object
        input.close();
    }
}
