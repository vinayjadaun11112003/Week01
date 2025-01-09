import java.util.*;
 class DistanceInYardAndMiles {
    public static void main(String[] args) {
        //Creating the scanner object.
        Scanner input = new Scanner(System.in);
        //Taking input of distance in feets.
        System.out.println("Enter distance in feets : ");
        double distanceInFeet = input.nextDouble();
        //converting distance of feet into yards.
        double distanceInYard = distanceInFeet / 3;
        //converting distance of yard in to miles.
        double distanceInMiles = distanceInYard / 1760;
        //printing the output to the screen.
        System.out.println("Distance in feet is "+distanceInFeet+" converted to the yard "+distanceInYard + " then yard to miles "+distanceInMiles);
        //closeing the input object.
        input.close();
    }
}
