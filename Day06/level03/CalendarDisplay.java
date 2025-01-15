import java.util.Scanner;

public class CalendarDisplay {

    // Array to store the names of the months
    static String[] months = { 
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December" 
    };

    // Array to store the number of days in each month
    static int[] daysInMonth = { 
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the month and year from the user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display the calendar
        displayCalendar(month, year);

        scanner.close();
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        // Get the name of the month
        String monthName = months[month - 1];

        // Get the number of days in the month
        int numOfDays = getDaysInMonth(month, year);

        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the header
        System.out.println("    " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print the spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= numOfDays; day++) {
            // Print the day, right-aligned
            System.out.printf("%3d ", day);

            // Move to the next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        // Move to the next line after the calendar is complete
        System.out.println();
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        return daysInMonth[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year conditions: divisible by 4, not divisible by 100 unless divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;

        // Adjust year and month for January and February
        if (m < 3) {
            m += 12;
            y--;
        }

        int k = y % 100; // Year of the century
        int j = y / 100; // Zero-based century

        // Gregorian calendar formula for the first day of the month
        int d = 1; // Day of the month
        int firstDay = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) - (2 * j)) % 7;

        // Adjust to make Sunday = 0, Monday = 1, ..., Saturday = 6
        return (firstDay + 5) % 7;
    }
}
