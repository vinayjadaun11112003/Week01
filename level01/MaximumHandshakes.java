import java.util.*;
 class MaximumHandshakes {
    public static void main(String[] args) {
        //Creating the scanner class object for input 
        Scanner input = new Scanner(System.in);
        //Taking input of number of students
        System.out.println("Enter number of students : ");
        int numberOfStudents = input.nextInt();
        //calculating the total handshakes  
        int maximumHandshakes = (numberOfStudents * (numberOfStudents-1))/2;
        //printing the output to the screen.
        System.out.println("Maximum number of possible handshakes " +maximumHandshakes);
        //closeing the object of input 
        input.close();
    }
}
