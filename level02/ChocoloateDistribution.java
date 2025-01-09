import java.util.*;

 class ChocoloateDistribution {
    public static void main(String[] args) {
        //Creating the scanner class object
        Scanner input = new Scanner(System.in);
        //taking input of number of chocolates.
        System.out.println("Enter the number of chocolates : ");
        int numberOfChocolate = input.nextInt();
        //taking input of number of students.
        System.out.println("Enter the number of students : ");
        int numberOfStudents = input.nextInt();
        //calculating the distributed number chocolate
        int distributedChocolate = numberOfChocolate / numberOfStudents;
        //calculating the remaining number of chocolate
        int remainingChocolate = numberOfChocolate % numberOfStudents;
        //printing the output to the screen.
        System.out.println("The number of chocolates each child gets is "+distributedChocolate+" and the number of remaining chocolates are "+remainingChocolate);
        //closing the object of scanner
        input.close();
    }
}
