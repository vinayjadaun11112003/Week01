import java.util.*;
class GetLength{
      public static int lengthOfString(String str){
            //creating a counter which will store the length of string.
            int counter = 0; 
            //using try carch block to calculate size of string.
            try{
               while(true){
                   str.charAt(counter);
                   counter++;
                   }
              }catch(Exception e){
                  return counter;
              }
      }
      public static void main(String[] args){
             //creating scanner object to take input of the string from user.
             Scanner input = new Scanner(System.in);
             System.out.println("Enter the String : ");
             String str = input.nextLine();
             //calling defined method to calculate the length of string and printing it to the screen.
             int lengthOfString = lengthOfString(str);
             System.out.println("The length of String is " + lengthOfString);
             //closing the scanner object
             input.close();
      }
}