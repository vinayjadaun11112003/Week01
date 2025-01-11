//Q02 level 01
import java.util.*;

class PositiveOrZeroOrNegative {
    public static void main(String[] args) {
        //Creating Scanner class object for input
        Scanner input = new Scanner(System.in);
        //initializing the empty array of size 5
        int number[] = new int[5];
        for (int index = 0; index < number.length; index++) {
            System.out.println("Enter number " + (index + 1));
            number[index] = input.nextInt();
        }
        //checking the condition according to the number
        for (int currentAge : number) {
            if (currentAge < 0) {
                System.out.println("The number " + currentAge + " is Negative");
            } else if (currentAge == 0) {
                System.out.println("The number " + currentAge + " is Zero");
            } else {
                System.out.println("The number " + currentAge + " is Positive");
            }
        }
        //closing the scanner object
        input.close();
    }
}
