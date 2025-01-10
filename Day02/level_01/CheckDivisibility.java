import java.util.*;

 class CheckDivisibility {
    public static void main(String[] args) {
        //Creating Scanner class object for input.
        Scanner input = new Scanner(System.in);
        //Taking input number 
        System.out.println("Enter The Number You want to check divisibility with 5 : ");
        int number = input.nextInt();

        //Storing the bool answer of the wheather it is divisible or not with 5.
        boolean isDivisible = true;
        isDivisible = (number % 5 == 0);
        //checking and output accordingly.
        if(isDivisible){
            System.out.println("Divisible by 5");
        }else{
            System.out.println("Not Divisible with 5");
        }
        //closing the object of scanner.
        input.close();

    }
}
