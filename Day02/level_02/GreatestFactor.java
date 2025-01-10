import java.util.*;
 class GreatestFactors{
    public static void main(String[] args) {
        //creating scanner object to take input
        Scanner input = new Scanner(System.in);
        //taking the input of number which we have to find factors.
        System.out.println("Enter the number : ");
        int number = input.nextInt();
        //running a loop from 1 to number
        
        for(int i=1;i<number;i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }
       
        //closing the scanner object.
        input.close();
    }
}
