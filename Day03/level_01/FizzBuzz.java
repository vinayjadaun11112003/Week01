// Q. 10 level1
import java.util.Scanner;

class FizzBuzz {

    public static void main(String[] args) {
        // Creating an scanner for user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            // Creating a string array
            String[] results = new String[number + 1];

            for (int i = 0; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = String.valueOf(i);
                }
            }

            // Display the results
            for (int index = 0; index <= number; index++) {
                System.out.println("Position " + index + ": " + results[index]);
            }
        } else {
            System.out.println("The number is not valid");
        }

        // Closing the object of scanner
        input.close();
    }
}
