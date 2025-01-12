import java.util.Random;

public class EmployeeBonusCalculator {

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(); // Generate salary and years of service
        double[][] bonusData = calculateBonusAndNewSalary(employeeData); // Calculate bonuses and new salaries
        displaySummary(employeeData, bonusData); // Display results in tabular format
    }

    // Method to generate salary and years of service using Math.random()
    private static int[][] generateEmployeeData() {
        int[][] data = new int[10][2]; // 2D array: [salary, years of service]
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + random.nextInt(90000); // Random salary between 10000 and 99999
            data[i][1] = random.nextInt(11); // Random years of service between 0 and 10
        }
        return data;
    }

    // Method to calculate bonuses and new salaries
    private static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] bonusData = new double[10][2]; // 2D array: [bonus amount, new salary]

        for (int i = 0; i < 10; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            bonusData[i][0] = bonus;
            bonusData[i][1] = newSalary;
        }
        return bonusData;
    }

    // Method to calculate and display the summary in tabular format
    private static void displaySummary(int[][] employeeData, double[][] bonusData) {
        System.out.printf("%10s %15s %15s %15s %15s\n", "Employee", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("-----------------------------------------------------------------------------------");

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];

            totalOldSalary += salary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%10d %15d %15d %15.2f %15.2f\n", i + 1, salary, yearsOfService, bonus, newSalary);
        }

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%10s %15.2f %15s %15.2f %15.2f\n", "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
    }
}
