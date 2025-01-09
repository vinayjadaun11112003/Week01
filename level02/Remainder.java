import java.util.*;
class Remainder{
    public static void main(String[] args) {
        //Creating the input object with Scanner class.
        Scanner input = new Scanner(System.in);
        //Taking input of first number.
        System.out.println("Enter the input for first number : ");
        int number1 = input.nextInt();
        //Taking input of second number.
        System.out.println("Enter the input for second number : ");
        int number2 = input.nextInt();
        //Calculating the remainder.
        int remainder = number1 % number2;
        //Calculating the quotient.
        int quotient = number1 / number2;
        //printing the output to the screen.
        System.out.println("The Quotient is " +quotient+ " and Reminder is "+remainder+" of two number "+number1+" and "+number2);
        //closeing the scanner object.
        input.close();
    }
}