import java.util.*;
class EnterZeroSum{
      public static void main(String[] args){
            //creating a scanner class object.
            Scanner input = new Scanner(System.in);
            double number = 0d;
            //checking the condition according to the question.
             boolean flag=true;
             int sum=0;
             while(flag){
                      //taking input in the number variable.
                        System.out.println("Enter the number  : ");
                         number = input.nextDouble();
                    if(number > 0){
                        sum += number;
                     }else{ 
                        System.out.println("Enter nums sum is " + sum);
                        break;
                     }
              }
            //close the scanner object
            input.close();
      }
}