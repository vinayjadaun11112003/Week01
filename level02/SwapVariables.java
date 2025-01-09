import java.util.*;
 class SwapVariables {
    public static void main(String[]args){
		//creating scanner class object for input
		Scanner input=new Scanner(System.in);

		//taking input of number 1
        System.out.println("Please Enter first number : ");
		int number1=input.nextInt();

		//taking input of number 2
        System.out.println("Please Enter second number : ");
		int number2=input.nextInt();

		//creating a temp variable
		int temp=0;

		//insert value of number1 into temp
		temp=number1;

		//insert value of number2 into number1
		number1=number2;

		//insert value of temp into number2
		number2=temp;

		//Display swapped numbers
		System.out.println("The swapped numbers are "+number1+" and "+number2);

        //close the scanner object
        input.close();
	}
}
