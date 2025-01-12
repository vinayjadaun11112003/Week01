import java.util.Scanner;

public class TemperatureUnitConverter {

    
    public static double convertFahrenheitToCelsius(double fahrenheit) {
		// Convert Fahrenheit to Celsius
        return (fahrenheit - 32) * 5 / 9;
    }

    
    public static double convertCelsiusToFahrenheit(double celsius) {
		// Convert Celsius to Fahrenheit
        return (celsius * 9 / 5) + 32;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKg(double pounds) {
        // pounds to kilograms = 0.453592
        return pounds * 0.453592;
    }

   
    public static double convertKgToPounds(double kilograms) {
        // kilograms to pounds = 2.20462;
        return kilograms * 2.20462;
    }

   
    public static double convertGallonsToLiters(double gallons) {
       //  gallons to liters = 3.78541;
        return gallons * 3.78541;
    }

    
    public static double convertLitersToGallons(double liters) {
        //double liters to gallons = 0.264172;
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        // Creating Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Display menu to the user
       
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Please select the conversion type ");
        
        int choice = input.nextInt();  

        double result ;

        // Switch statement for different conversions
        switch (choice) {
            case 1:
                // Fahrenheit to Celsius conversion
                System.out.print("Enter temperature in fahrenheit ");
                double fahrenheit = input.nextDouble();
                result = convertFahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + " fahrenheit is equal to " + result + " celsius ");
                break;

            case 2:
                // Celsius to Fahrenheit conversion
                System.out.print("Enter temperature in celsius ");
                double celsius = input.nextDouble();
                result = convertCelsiusToFahrenheit(celsius);
                System.out.println(celsius + " celsius is equal to " + result + " fahrenheit ");
                break;

            case 3:
                // Pounds to Kilograms conversion
                System.out.print("Enter weight in pounds ");
                double pounds = input.nextDouble();
                result = convertPoundsToKg(pounds);
                System.out.println(pounds + " pounds is equal to " + result + " kilograms ");
                break;

            case 4:
                // Kilograms to Pounds conversion
                System.out.print("Enter weight in Kilograms ");
                double kilograms = input.nextDouble();
                result = convertKgToPounds(kilograms);
                System.out.println(kilograms + " kilograms is equal to " + result + " pounds ");
                break;

            case 5:
                // Gallons to Liters conversion
                System.out.print("Enter volume in Gallons ");
                double gallons = input.nextDouble();
                result = convertGallonsToLiters(gallons);
                System.out.println(gallons + " gallons is equal to " + result + " liters ");
                break;

            case 6:
                // Liters to Gallons conversion
                System.out.print("Enter volume in liters ");
                double liters = input.nextDouble();
                result = convertLitersToGallons(liters);
                System.out.println(liters + " liters is equal to " + result + " gallons ");
                break;

            default:
                System.out.println("Invalid choice");
        }

    }
}
