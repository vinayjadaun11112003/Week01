import java.util.Scanner;

class TeamBMI_Calculator {
    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Asking for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Declaring a 2D array to store height, weight, and BMI
        double[][] personData = new double[numberOfPersons][3];
        String[] status = new String[numberOfPersons];

        // Taking input for height and weight of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();

            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();

            // Calculating BMI and converting height to meters
            personData[i][2] = personData[i][1] / Math.pow(personData[i][0] / 100, 2);

            // Categorizing BMI
            if (personData[i][2] < 18.5) {
                status[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                status[i] = "Normal weight";
            } else if (personData[i][2] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Printing the height, weight, BMI, and status of each person
        System.out.println("\nResults:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("  Height: " + personData[i][0] + " cm");
            System.out.println("  Weight: " + personData[i][1] + " kg");
            System.out.println("  BMI: " + personData[i][2]);
            System.out.println("  Status: " + status[i]);
        }

        // Closing the Scanner object
        input.close();
    }
}
