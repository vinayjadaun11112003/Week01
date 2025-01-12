import java.util.*;
class SpringSeason{
      public static boolean spring(int month, int day){
                 //checking for the true or false condition in the if-else.
                 if((month<=6) && (month>=3)){
                       if(((month == 3) && (day < 20)) || ((month == 6) && (day > 20))){
                            return false;
                         }
                       return true;
                   }else{
                       return false;
                   }
      }
      public static void main(String[] args){
            //creating scanner class object to take input
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the month code --> (1-12)");
            int month = input.nextInt();
            System.out.println("Enter the day code ----> (1-31)");
            int day = input.nextInt();
            //checking for the wrong condition
            if((month>12) || (day>31) || (day<1) || (month<1)){
                  System.err.println("Opss .! You have entered a wrong value in the input ");
             }else{
                  //calling a method which will return true or false 
                  boolean flag = spring(month,day);
                  //checking the condition according to the question.
                  if(flag){
                  System.out.println("It is a Spring season");
                  }else{
                  System.out.println("Not Spring season yet");
                  }
             
            }
            //closing the object of scanner class.
            input.close();
      }
}