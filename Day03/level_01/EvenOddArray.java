// Q.07 level 01 :
import java.util.Scanner;

class EvenOddArray{
    public static void main(String [] args){
        //creating a scanner object for taking user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number :");
        int number = input.nextInt();

        // Creating arrays for odd and even numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        // creating new indices for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Printing odd numbers array
        System.out.print("Odd numbers: ");
        for (int index = 0; index < oddIndex; index++) {
            System.out.print(oddNumbers[index] + " ");
        }
        System.out.println();

        // Printing even numbers array
        System.out.print("Even numbers: ");
        for (int index = 0; index < evenIndex; index++) {
            System.out.print(evenNumbers[index] + " ");
        }
        System.out.println();

        //closing the object of scanner
        input.close();
    }
}
