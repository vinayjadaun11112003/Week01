class FindProfit{
      public static void main(String[] args){

      //Taking as Cost price as double because Cost price can be in floating points.
       double costPriceInINR = 129;

      //Taking Seliing price as double because Selling price can be floating points.
       double sellingPriceInINR = 191;

      //Calculating the profit by the formula of Profit = SELLING PRICE - COST PRICE.
       double profitInINR = sellingPriceInINR - costPriceInINR;

      //Calculating the profit percentage % by using formula.
      // PROFIT IN PERCENTAGE = (PROFIT / COSTPRICE) * 100;
      double profitPercentage = (profitInINR / costPriceInINR) * 100;

      //Printing the output to the screen.
      System.out.print("The Cost Price in INR " + costPriceInINR + " and Selling Price in INR " + sellingPriceInINR  + "\nThe Profit in INR " + profitInINR + " and the Profit Percentage is " + profitPercentage);
      
      }
}