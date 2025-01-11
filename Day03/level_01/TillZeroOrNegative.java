//Q04 level 01
import java.util.Scanner;
class TillZeroOrNegative {
    public static double sum(double[] value) {
        double sum = 0;
        for (double each : value) {
            sum += each;
        }
        return sum;
    }
    public static void main(String[] args) {
        //creating the scanner class object
        Scanner input = new Scanner(System.in);
        //creating a flag
        boolean flag = true;
        //creating value array with size 10
        double[] value = new double[10];
        int index = 0;
        //checking condition
        while (flag) {
            System.out.println("Enter a number: ");
            double number = input.nextDouble();
            value[index] = number;
            if (number <= 0) {
                System.out.println("Sum till now is: " + sum(value));
                flag = false;
            }
            if (index == value.length - 1) {
                System.out.println("Sum till now is: " + sum(value));
                flag = false;
            }
            index++;
        }
        //closing the scanner object
        input.close();
    }
}
