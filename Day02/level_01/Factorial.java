    import java.util.*;
class Factorial{
      public static int sum(int n){
           return (n*(n+1))/2;
      }
      public static void main(String[] args){
            //Creating the scanner class 0bject
            Scanner input = new Scanner(System.in);
            //Getting input from the user of number
            System.out.println("Enter the number which you want to get Factorial : ");
            int number= input.nextInt();
            int factorial= 1;
            //calculating the factorial value according to the question.
            int i=1;
            while(i<=number){
                factorial = factorial * i;
                i++;
            } 
            //printing the output of factorial 
            System.out.println("Factorial of given number " + number + " is " + factorial);
             //closing the input scanner
            input.close();
      }
}


