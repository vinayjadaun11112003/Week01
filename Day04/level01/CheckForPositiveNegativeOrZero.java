import java.util.*;
class CheckForPositiveNegativeOrZero{ 
      public static String typeOfInput(int number){
            //checking the condition of the quesition to judge wheather it is positive, negative or zero.
            if(number>0){
             return "positive";
             }else if(number==0){
             return "zero";
             }else{
             return "Negative";
             }
      }
      public static void main(String[] args){
           //Creating scanner object
           Scanner input = new Scanner(System.in);
           //taking input of the number from user.
           System.out.println("Enter a number : ");
           int number = input.nextInt();
           //calling function and storing the answer which is returning from it.
           String typeOfInput = typeOfInput(number);
           System.out.println(typeOfInput);
           //closing the scanner object
           input.close();
      }
}