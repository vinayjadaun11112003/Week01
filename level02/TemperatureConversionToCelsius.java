import java.util.*;
 class TemperatureConversionToCelsius {
    public static void main(String[]args){
		//Creating scanner object for input
		Scanner input=new Scanner(System.in);

		//taking input from user 
        System.out.println("Enter the Temperature in Fahrenheit : ");
		float fahrenheit=input.nextFloat();
		
		//converting celsius temperature from fahrenheit
		float celsiusResult=(fahrenheit-32)*5/9;

		//print the temperature from fahrenheit into celsius
		System.out.println("The "+fahrenheit +" Fahrenheit is " + celsiusResult +" celsius");

        //closing the object of scanner class
        input.close();
	}
}
