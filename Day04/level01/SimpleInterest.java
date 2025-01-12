import java.util.*;
class SimpleInterest{
      public static double simpleInterest(double principal, double rateOfInterest, double time){
             //returning the answer of simple interest
             return (principal * rateOfInterest * time)/100;
      }
      public static void main(String[] args){
             //creating scanner object
             Scanner input = new Scanner(System.in);
             //taking input of principal, rate and time from user.
             System.out.println("Enter Principal amount : ");
             double principal = input.nextDouble();
             System.out.println("Enter rate of interest : ");
             double rateOfInterest = input.nextDouble();
             System.out.println("Enter time : ");
             double time = input.nextDouble();
             double simpleInterest = simpleInterest(principal,rateOfInterest,time);
             System.out.println("The Simple Interest is "+ simpleInterest + " for Principal " + principal + ", Rate of Interest " + rateOfInterest+" ___ and Time " + time);
             //closing the scanner object
             input.close();
      }
}