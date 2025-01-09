import java.util.*;

 class SideOfSquare {
    public static void main(String[] args) {
        //Creating the Scanner object to take input.
        Scanner input = new Scanner(System.in);
        //Taking input of perimeter from user.
        System.out.println("Enter the perimeter of square : ");
        double perimeter = input.nextDouble();
        //Calculating the side using the formula -> perimeter = 4 * side.
        double sideOfSquare = perimeter / 4d;
        //printing the output to the console.
        System.out.println("The length of the side is "+ sideOfSquare +" whose perimeter is " +perimeter);
        //closeing the object of scanner.
        input.close();
    }
}
