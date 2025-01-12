import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Formula for wind chill
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for temperature and wind speed
        System.out.print("Enter the temperature (°F): ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed (mph): ");
        double windSpeed = scanner.nextDouble();

        // Call the method to calculate wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Display the result
        System.out.println("Wind Chill Temperature: " + windChill + "°F");
    }
}
