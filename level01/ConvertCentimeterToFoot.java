import java.util.*;
class ConvertCentimeterToFoot{
      public static void main(String[] args){
             //Creating Scanner object- input to take input from Scanner class.
             Scanner input = new Scanner(System.in);

             System.out.println("Enter the Height int Centimeter : ");
             
             //Taking a variable of Double type which hold the value of Height in Centimeter.
             double heightInCentimeter= input.nextDouble();
   
             //Calculating the discount amount after discounting in main fees.
             double heightInInches= heightInCentimeter/2.54;   

             //Calculating the discount amount after discounting in main fees.
             double heightInFoots= heightInInches/12;   
               
             //Printing the output to the screen.
             System.out.println("Your Height in cm is "+ heightInCentimeter + " while in feet is " + heightInFoots+ " and inches is "+heightInInches);
             

             //closing the object of Scanner
             input.close();
          
      }
}