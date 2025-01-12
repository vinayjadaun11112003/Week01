import java.util.*;

class FirstLargestAndSecondLargest {
    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Checking if the input number is correct or not
        if (number <= 0) {
            System.err.println("Invalid input! Please enter a positive number.");
            System.exit(0);
        }

        // Initializing an array to store digits with a maximum size of 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extracting each digit of a number
        while (number > 0) {
            digits[index++] = number % 10;
            number /= 10;

            // Breaking the loop when the digit reaches max
            if (index == maxDigit) {
                break;
            }
        }

        // Initializing variables to store the largest and second-largest digits
        int largest = 0;
        int secondLargest = 0;

        // Checking which one is the largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                // Update the second-largest to the current largest
                secondLargest = largest;

                // Update the largest to the current digit
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                // Update the second-largest if the current digit is greater
                secondLargest = digits[i];
            }
        }

        // Printing the largest and second-largest digits
        System.out.println("The largest digit is: " + largest + "\nThe second-largest digit is: " + secondLargest);

        // Closing the Scanner object
        input.close();
    }
}
