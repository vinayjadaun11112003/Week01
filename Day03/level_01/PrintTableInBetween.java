//Q-5 level 01
import java.util.Scanner;
class PrintTableInBetween {
    public static void main(String[] args) {

        //Creating input scanner class
        Scanner input = new Scanner(System.in);
        //taking input of number
        System.out.println("Enter number: ");
        int number = input.nextInt();
        if (number <= 9 && number >= 6) {
            //creating an array of size 10
            int table[] = new int[10];
            for (int index = 0; index < table.length; index++) {
                table[index] = number * (index + 1);
            }
            //printing the each multiplication of number
            System.out.println("Printing Table: ");
            int i = 1;
            for (int currentAge : table) {
                System.out.println(number + " * " + i + " = " + currentAge);
                i++;
            }
        } else {
            System.out.println("Entered Number is not in the required range -> 6-9");
        }
        //closing the scanner object
        input.close();
    }
}
