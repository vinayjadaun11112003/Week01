import java.util.*;

 class PoundsToKilogram {
    public static void main(String[] args) {
        //Creating Scanner class object for input 
        Scanner input = new Scanner(System.in);
        //taking input of weight in pounds
        System.out.println("Enter the weight in pounds : ");
        double weightInPounds = input.nextDouble();
        //converting to kilograms;
        double weightInKilogram = weightInPounds * 2.2;
        //printing the output to the screen.
        System.out.println("The weight of the person in pound is "+weightInPounds+" and in kg is "+weightInKilogram);
        //closing the object of scanner class.
        input.close();
    }
}
