import java.util.*;
 class TemperatureConversionToFahrenheit {
    public static void main(String[]args){
		//Creating scanner object for input
		Scanner input=new Scanner(System.in);

		//taking input from user in celsius
        System.out.println("Enter the Temperature in celsius : ");
		float celsius=input.nextFloat();
		
		//converting fahrenheit temperature from celsius
		float farenheitResult=(celsius*9/5)+32;

		//print the temperature from Celsius into fahrenheit
		System.out.println("The "+celsius+" Celsius is "+farenheitResult +" Fahrenheit");

        //closing the object of scanner class
        input.close();
	}
}
