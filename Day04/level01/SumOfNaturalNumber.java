import java.util.*;
class SumOfNaturalNumber{
     public static int sumOfNaturalNumber(int number){ 
          return (number*(number-1))/2;
     }
     public static void main(String[] args){
          //creating a scanner object of scanner class.
          Scanner input = new Scanner(System.in);
          //taking input of the number 
          System.out.println("Enter a number : ");
          int number = input.nextInt();
          //checkinng the valid condition
          if(number<=0){
                 System.out.println("Entered Number is invalid");
           }else{
                 //calling a function to sum all natural number till n
                 int sumOfNaturalNumber = sumOfNaturalNumber(number);
                 System.out.println("The sum of natural number " + number + " is " + sumOfNaturalNumber);
                 
            }
          //closing the object of scanner.
          input.close();
     }
}