import java.util.*;

public class FizzBuzz{
    
    public static void main(String args[]){
        
        // Creating a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number :");
        
        // Read the number input by the user
        int number = input.nextInt();
        
        // Check if the number entered is positive
        if(number > 0){
            
            // Loop from 0 to the entered number
            for(int i = 0; i <= number; i++){
                
                // Check if the number is divisible by both 3 and 5
                if(i % 3 == 0 && i % 5 == 0){
                    System.out.print(" FizzBuzz "); // Print "FizzBuzz" if divisible by both 3 and 5
                    
                // Check if the number is divisible by 3
                } else if(i % 3 == 0){
                    System.out.print(" Fizz "); // Print "Fizz" if divisible by 3
                    
                // Check if the number is divisible by 5
                } else if(i % 5 == 0){
                    System.out.print(" Buzz "); // Print "Buzz" if divisible by 5
                    
                // If the number is not divisible by 3 or 5, print the number itself
                } else {
                    System.out.print(i + " ");
                }
                
            }
            
        } else {
            // In case the number entered is not positive
            System.out.println("Please enter a positive number.");
        }
        //closing the scanner objeect here.
        input.close();
        
    }
    
}