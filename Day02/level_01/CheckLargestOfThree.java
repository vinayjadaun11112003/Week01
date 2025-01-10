import java.util.*;
class CheckLargestOfThree{
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
            boolean isFirstLargest = false;

             //creating a bool variable which store true or false.
            boolean isSecondLargest = false;

             //creating a bool variable which store true or false.
            boolean isThirdLargest = false;

            //checking in the if-else that is it largest or not.
            if((number1 == number2) && (number2 == number3)){
                   System.out.println("All Three are equal");
                  return;
             } else{
                      if((number1 > number2) && (number1 > number3)){
                       isFirstLargest = true;
                       }else if((number2 > number3) && (number2 > number1)){
                       isSecondLargest = true;
                       }else if((number3 > number2) && (number3 > number1)){
                       isThirdLargest = true;
                  }
           }
            //printint the output accordingly.
            System.out.println("Is the first number the largest? " + isFirstLargest);
            System.out.println("Is the second number the largest? " + isSecondLargest);
            System.out.println("Is the third number the largest? " + isThirdLargest);


            //closing the scanner object.
            input.close();
      }
}