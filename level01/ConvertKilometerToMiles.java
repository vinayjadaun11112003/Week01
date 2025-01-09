import java.util.*;
class ConvertKilometerToMiles{
      public static void main(String[] args){

            //Creating Scanner object to take input from Scanner class.
            Scanner input = new Scanner(System.in);

            //Taking input from Scanner as double datatype value.
            double distanceInKilometers = input.nextDouble();
           
            //Converting the kilometer distance into miles.
            double distanceInMiles = distanceInKilometers / 1.60934;

            //Printing the output to the screen.
            System.out.println("The Total Miles is " + distanceInMiles + " miles for the given " + distanceInKilometers);
            
            //closing the Scanner object after use.
            input.close();

      }
}