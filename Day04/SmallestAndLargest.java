import java.util.*;
class SmallestAndLargest{
       public static int[] findSmallestAndLargest(int first, int second, int third){
              //checking the required condition and adding the answer to the array 
              int smallestAndLargest[] = new int[2];
              //checking the condition for the smallest of all three
              if ((first>second) && (first>third)){
                    smallestAndLargest[1] = first;
              }else if((second>third) && (second>first)){
                    smallestAndLargest[1] = second;
              }else{
                    smallestAndLargest[1] = third;
              }
               //checking the condition of the largest among all three.
               if ((first<second) && (first<third)){
                    smallestAndLargest[0] = first;
              }else if((second<third) && (second<first)){
                    smallestAndLargest[0] = second;
              }else{
                    smallestAndLargest[0] = third;
              }
              //returning the smallest element and largest element stored in the array.
              return smallestAndLargest;
       }
       public static void main(String[] args){ 
             //creating a scanner object to take input
             Scanner input = new Scanner(System.in);
             //taking input of all three number
             System.out.println("Enter first number : ");
             int first = input.nextInt();
             System.out.println("Enter second number : ");
             int second = input.nextInt();
             System.out.println("Enter third number : ");
             int third = input.nextInt();
             //accepting the array of ans which we are getting by calling the method.
             int ans[] = findSmallestAndLargest(first,second,third);
             System.out.println("The smallest number amongs these are " + ans[0]);
             System.out.println("The largest number amongs these are " + ans[1]);
             //closing the input scanner
             input.close();
       }
 }