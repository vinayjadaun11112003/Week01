import java.util.*;
class Calculator{
      public static void main(String[] args){
            //Create an object of Scanner class 
            Scanner input = new Scanner(System.in);

            //Taking input1 and input2 from the user.
            float number1 = input.nextFloat();
            
            float number2 = input.nextFloat();
 
            //Performing Addition operation here and storing the value.
            float addition = number1 + number2;

            //Performing Substraction operation here and storing the value.
            float substraction = number1 - number2;

            //Performing multiply operation here and storing the value.
            float multiply = number1 * number2;

            //Performing Division operation here and storing the value.
            float division = number1 / number2;
            
             //printing the output on the screen.
             System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + addition +" and "+ substraction + " , " + multiply +  " , " + division);

             //closing the Scanner object.
      }
}