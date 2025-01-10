     import java.util.*;
class FactorialWithFor{
   
      public static void main(String[] args){
            //Creating the scanner class 0bject
            Scanner input = new Scanner(System.in);
            //Getting input from the user of number
            System.out.println("Enter the number which you want to get Factorial : ");
            int number= input.nextInt();
            int factorial= 1;
            //calculating the factorial value according to the question.
            for(int i = number;i>=1;i--){
                factorial = factorial * i;
            } 
            //printing the output of factorial 
            System.out.println("Factorial of given number " + number + " is " + factorial);
             //closing the input scanner
            input.close();
      }
}
