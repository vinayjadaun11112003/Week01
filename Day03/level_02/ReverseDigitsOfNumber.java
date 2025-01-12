import java.util.*;

class ReverseDigitsOfNumber {
    public static void main(String[] args) {
        // Creating a Scanner object to take user input.
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Checking the input to ensure it is a positive number.
        if (number <= 0) {
            System.err.println("Invalid input! Please enter a positive number.");
            System.exit(0);
        }

        // Counting the digits count
        int temp = number, count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Initializing an array to store the digits.
        int[] digits = new int[count];

        // Extracting and storing digits in the array.
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Printing the digits in reverse order.
        System.out.print("The reversed number is: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        // Closing the Scanner object
        input.close();
    }
}
