import java.util.*;
class SimpleInterest{
      public static double simpleInterest(double principal, double rateOfInterest, double time){
             return (principal * rateOfInterest * time)/100;
      }
      public static void main(String[] args){
             Scanner input = new Scanner(System.in);
             double principal = input.nextDouble();
             double rateOfInterest = input.nextDouble();
             double time = input.nextDouble();
             double simpleInterest = simpleInterest(principal,rateOfInterest,time);
             System.out.println("The Simple Interest is "+ simpleInterest + " for Principal " + principal + ", Rate of Interest " + rateOfInterest+" ___ and Time" + time);
             input.close();
      }
}