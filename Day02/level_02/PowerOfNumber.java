import java.util.*;
 class PowerOfNumber{
    public static void main(String[] args) {
        //creating scanner object to take input
        Scanner input = new Scanner(System.in);
        //taking the input of number which we have to find power.
        System.out.println("Enter the number : ");
        int number = input.nextInt();
        System.out.println("Enter the power : ");
        int power = input.nextInt();
        long result = 1;
        for(int i=1;i<=power;i++){
             result *= number;
        }

        System.out.println("The resultant value of "+number+ " with power of "+ power+ " is " + result);
        //closing the scanner object.
        input.close();
    }
}
