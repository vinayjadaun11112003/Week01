import java.util.*;
class CheckFirstSmallest{
      public static void main(String[] args){
            //Creating Scanner object for input.
            Scanner input = new Scanner(System.in);
            //Taking the first number input
            System.out.println("Enter the first number : ");
            int number1 = input.nextInt();
             //Taking the second number input
            System.out.println("Enter the second number : ");
            int number2 = input.nextInt();
             //Taking the third number input
            System.out.println("Enter the third number : ");
            int number3 = input.nextInt();
            //creating a bool variable which store true or false.
            boolean isFirstSmallest = false;
            //checking in the if-else that is it smallest or not.
            if((number1 < number2) && (number1 < number3)){
                 isFirstSmallest = true;
            }else{
                 isFirstSmallest = false;
            }
            //printint the output accordingly.
            System.out.println("Is the first number the smallest? "+isFirstSmallest);
            //closing the scanner object.
            input.close();
      }
}