import java.util.*;
class SumOfNaturalNumber{
      public static int sum(int n){
           return (n*(n+1))/2;
      }
      public static void main(String[] args){
            //Creating the scanner class 0bject
            Scanner input = new Scanner(System.in);
            //Getting input from the user of natural number
            System.out.println("Enter the number which you want to get sum till n : ");
            int naturalNumber = input.nextInt();
            int loopSum = 0;
            //checking condition
            if(naturalNumber <= 0){
                  System.out.println("Not a Natural number");
             }else{
                  int sum = sum(naturalNumber);
                  int j=1;
                  while(j<=natualNumber){
                          loopSum += j;
                          j++;
                     }
                  
                   System.out.println("The sum of natural from formula "+ sum + " and sum from loop is " + loopSum);
             }
             //closing the input scanner
            input.close();
      }
}