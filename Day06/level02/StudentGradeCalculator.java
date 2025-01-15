import java.util.Random;

public class StudentGradeCalculator {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM)
    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(90) + 10; // Physics score
            scores[i][1] = random.nextInt(90) + 10; // Chemistry score
            scores[i][2] = random.nextInt(90) + 10; // Math score
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateTotalsAndPercentages(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round off to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] percentages) {
        String[] grades = new String[percentages.length];

        for (int i = 0; i < percentages.length; i++) {
            double percentage = percentages[i][2];

            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Physics", "Chemistry", "Math", "Total", "Average", "%", "Grade");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s%n",
                scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 10; // Number of students

        // Generate random scores
        int[][] scores = generateScores(numberOfStudents);

        // Calculate totals, averages, and percentages
        double[][] results = calculateTotalsAndPercentages(scores);

        //  Calculate grades
        String[] grades = calculateGrades(results);

        //  Display the scorecard
        System.out.println("Student Scorecard:");
        displayScorecard(scores, results, grades);
    }
}
