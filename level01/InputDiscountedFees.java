import java.util.*;
class InputDiscountedFees{
      public static void main(String[] args){
             //Creating Scanner object- input to take input from Scanner class.
             Scanner input = new Scanner(System.in);

             System.out.println("Enter the Fees ammount : ");
             
             //Taking a variable of Double type which hold the value of fees of university.
             double feesInINR = input.nextDouble();
             
             System.out.println("Enter the Discount percent : ");            

             //Taking a variable of Double of discount which university is offering.
             double discountPercent = input.nextDouble();
           
             //Calculating the discount amount after discounting in main fees.
             double discountInINR = (feesInINR * discountPercent) / 100;   

             //Calculating the total amount payable by the students.
             double feesAfterDiscount = feesInINR - discountInINR;
               
             //Printing the output to the screen.
             System.out.println("The discount amount in INR " + discountInINR + " and the final discounted fees in INR "+feesAfterDiscount);           
      }
}