Level 2 Practice Programs
Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is _ and Reminder is _ of two number _ and _
import java.util.Scanner;
public class QuotientAndRemainder{
    public static void main(String[]args){
        //using Scanner object for user input
        Scanner input=new Scanner(System.in);


        //Taking number1 from user as input
        int num1=input.nextInt();

         //Taking number2 from user as input
        int num2=input.nextInt();



        //printing Quotient and Reminder of num1 and num2
        System.out.println("The Quotient is "+ (num1/num2)+ "and Reminder is "+(num1%num2) "of two number"+ num1 + "and"+ num2);
    }
}







Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign result to a variable
Finally print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are —-, -—, and —-
import java.util.Scanner;
public class IntOperation{
    public static void main(String[]args){
        //using Scanner object for user input
        Scanner input=new Scanner(System.in);


        //Taking number1 from user as input
        int a=input.nextInt();

         //Taking number2 from user as input
        int b=input.nextInt();
         
         //Taking number2 from user as input
        int c=input.nextInt();

        //printing Quotient and Reminder of num1 and num2
        System.out.println("The results of Int Operations are "+(a+b*c)+ ","+(a*b+c)+","+ (c+a/b) +"and"+ a%b+c);
    }
}






Similarly, write the DoubleOpt program by taking double values and doing the same operations.
import java.util.Scanner;
public class DoubleOpt{
    public static void main(String[]args){
        //using Scanner object for user input
        Scanner input=new Scanner(System.in);


        //Taking number1 from user as input
        int a=input.nextDouble();

         //Taking number2 from user as input
        int b=input.nextDouble();
         
         //Taking number2 from user as input
        int c=input.nextDouble();

        //printing Quotient and Reminder of num1 and num2
        System.out.println("The results of Double Operations are "+(a+b*c)+ " "+(a*b+c)+" "+ (c+a/b) +"and"+ a%b+c);
    }
}


Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
Hint => 
Create a celsius variable and take the temperature as user input
Use the Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F and assign to farenheitResult  and print the result
I/P => celcius
O/P =>  The __ celsius is ___ fahrenheit
import java.util.Scanner;
public class TemperatureConversion{
	public static void main(String[]args){
		//Use Scanner object for user input
		Scanner input=new Scanner(System.in);

		//Create Celsius and take its value from user
		float celsius=input.nextFloat();
		
		//create farenheitResult and initialise with the result
		float farenheitResult=(celsius*9/5)+32;

		//print the temperature from Celsius into fahrenheit
		System.out.println(" The "+celsius+"Celsius is "+farenheitResult +" Fahrenheit");
	}
}


Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius
Hint => 
Create a fahrenheit variable and take the user's input
User the formulae to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C and assign the result to celsiusResult  and print the result
I/P => fahrenheit
O/P => The __ fahrenheit is ___ celsius
import java.util.Scanner;
public class TemperatureConversion{
	public static void main(String[]args){
		//Use Scanner object for user input
		Scanner input=new Scanner(System.in);

		//Create fahrenheit and take its value from user
		float fahrenheit=input.nextFloat();
		
		//create farenheitResult and initialise with the result
		float celsiusResult=(fahrenheit-32)*5/9;

		//print the temperature from fahrenheit into celsius
		System.out.println(" The "+farenheit +" Fahrenheit is"+celsius +" celsius");
	}
}