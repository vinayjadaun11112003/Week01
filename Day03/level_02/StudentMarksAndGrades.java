import java.util.Scanner;

class StudentMarksAndGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Arrays to store marks, percentages, and grades of students
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Taking input: Marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            // Physics marks
            do {
                System.out.print("Physics marks: ");
                physicsMarks[i] = input.nextInt();
                if (physicsMarks[i] < 0) {
                    System.out.println("Please enter positive marks for Physics.");
                }
            } while (physicsMarks[i] < 0);

            // Chemistry marks
            do {
                System.out.print("Chemistry marks: ");
                chemistryMarks[i] = input.nextInt();
                if (chemistryMarks[i] < 0) {
                    System.out.println("Please enter positive marks for Chemistry.");
                }
            } while (chemistryMarks[i] < 0);

            // Math marks
            do {
                System.out.print("Math marks: ");
                mathMarks[i] = input.nextInt();
                if (mathMarks[i] < 0) {
                    System.out.println("Please enter positive marks for Math.");
                }
            } while (mathMarks[i] < 0);

            // Calculate total marks and percentage
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathMarks[i]) / 3.0;

            // Assign grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 50) {
                grades[i] = "C";
            } else if (percentages[i] >= 40) {
                grades[i] = "D";
            } else {
                grades[i] = "F"; // Remedial Standards
            }
        }

        // Print results in a compact manner
        System.out.println("\nStudent Results:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Marks: Physics = " + physicsMarks[i] + ", Chemistry = " + chemistryMarks[i] + ", Math = " + mathMarks[i]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
        }

        // Closing the scanner
        input.close();
    }
}
