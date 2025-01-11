// question 6 level 1 :
import java.util.Scanner;

class MeanOfHeight {
    public static void main(String[] args) {
        //create scanner object for user input
        Scanner input = new Scanner(System.in);

        //define an array of length 11
        double height[] = new double[11];
        double heightSum = 0;

        System.out.print("Enter the height of 11 players: ");
        for (int index = 0; index < height.length; index++) {
            height[index] = input.nextDouble();
            heightSum += height[index];
        }

        double mean = heightSum / 11;

        //printing mean value
        System.out.println("The mean height of the football team is: " + mean);

        //closing the input object
        input.close();
    }
}
