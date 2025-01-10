import java.util.*;
 class PerfectlyDivisible{
    public static void main(String[] args) {
        //creating scanner object to take input
        Scanner input = new Scanner(System.in);
        //taking the input of number which we have to find perfectly divisible.
        System.out.println("Enter the number : ");
        int number = input.nextInt();
        //running a loop from 1 to number
       
        for(int i=number-1;i>0;i--){
            if(number % i == 0){
                System.out.println(i);
            }
        }
       
        //closing the scanner object.
        input.close();
    }
}
