import java.util.Scanner;

class StudentMarksWithMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Arrays to store marks for Physics, Chemistry, and Math
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = "";
                if (j == 0) subject = "Physics";
                else if (j == 1) subject = "Chemistry";
                else if (j == 2) subject = "Math";

                do {
                    System.out.print(subject + " marks: ");
                    marks[i][j] = input.nextInt();
                    if (marks[i][j] < 0) {
                        System.out.println("Please enter positive marks for " + subject + ".");
                    }
                } while (marks[i][j] < 0);
            }
        }

        // Calculate the total marks and percentage for the student
        for (int i = 0; i < numStudents; i++) {
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Assign grades based on percentage
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 50) {
                grades[i] = "C";
            } else if (percentages[i] >= 40) {
                grades[i] = "D";
            } else {
                grades[i] = "F"; // Remedial Standard
            }
        }

        // Print the marks, percentages, and grades of each student
        System.out.println("\nStudent Results:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Marks: Physics = " + marks[i][0] + ", Chemistry = " + marks[i][1] + ", Math = " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
        }

        // Closing the scanner
        input.close();
    }
}
