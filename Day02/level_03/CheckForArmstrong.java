import java.util.*;
 class CheckForArmstrong {
    public static int sumOfEachDigitCube(int number){
        int sum=0;
        //Extracting and cubing then adding that to the sum.
        while(number>0){
            int digit = number % 10;
            sum+=digit*digit*digit;
            number = number/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        //Creating Scanner object to take input.
        Scanner input = new Scanner(System.in);
        //Taking input from the user of the number.
        int number = input.nextInt();
        //calling this function, this will give the sum of each digit cubes.
        int sumOfEachDigitCube = sumOfEachDigitCube(number);
        //checking the condition of armstrong number.
        if(sumOfEachDigitCube == number){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an Armstrong number");
        }
        //closing the scanner object.
        input.close();
    }
}
