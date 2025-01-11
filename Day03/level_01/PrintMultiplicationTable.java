//Q03 level 01
import java.util.*;

class PrintMultiplicationTable {
    public static void main(String[] args) {
        //Creating input scanner class
        Scanner input = new Scanner(System.in);
        //taking input of number
        System.out.println("Enter number : ");
        int number = input.nextInt();
        //creating an array of size 10
        int table[] = new int[10];
        for (int index = 0; index < table.length; index++) {
            table[index] = number * (index + 1);
        }
        //printing each multiplication of number
        System.out.println("Printing Table : ");
        int i = 1;
        for (int each : table) {
            System.out.println(number + " * " + i + " = " + each);
            i++;
        }
        //closing the scanner object
        input.close();
    }
}
