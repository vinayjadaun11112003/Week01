class DiscountedFees{
      public static void main(String[] args){
             
             //Taking a variable of Integer type which hold the value of fees of university.
             int feesInINR = 125000;
             
             //Taking a variable of Integer of discount which university is offering.
             int discountPercent = 10;
           
             //Calculating the discount amount after discounting in main fees.
             int discountInINR = (feesInINR * discountPercent) / 100;   

             //Calculating the total amount payable by the students.
             int feesAfterDiscount = feesInINR - discountInINR;
               
             //Printing the output to the screen.
             System.out.println("The discount amount in INR " + discountInINR + " and the final discounted fees in INR "+feesAfterDiscount);           
      }
}