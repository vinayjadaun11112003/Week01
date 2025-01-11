//Q01 level 01
import java.util.*;

class CanVoteOrNot {
    public static void main(String[] args) {
        //Creating scanner class object for input
        Scanner input = new Scanner(System.in);
        //initializing an age array with length 10
        int[] age = new int[10];
        //taking input from the user one by one.
        for (int index = 0; index < age.length; index++) {
            System.out.println("Enter age for : " + (index + 1));
            int inputAge = input.nextInt();
            if (inputAge < 0) {
                System.out.println("Invalid input ! ");
            } else {
                age[index] = inputAge;
            }
        }
        //iterating to each element to check the condition of voting.
        for (int currentAge : age) {
            if (currentAge >= 18) {
                System.out.println("The student with the age " + currentAge + " can vote.");
            } else {
                System.out.println("The student with the age " + currentAge + " cannot vote.");
            }
        }

        //closing the object 
        input.close();
    }
}

