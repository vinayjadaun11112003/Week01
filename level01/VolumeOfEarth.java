import java.util.*;
class VolumeOfEarth{
      public static void main(String[] args){
            
            //Taking Radius of Earth as Integer.
            int radiusOfEarth = 6378;
            
            //Taking the value of PI = 3.14 as double.
            double valueOfPi = 22/7;

            //Calculating the Volume of earth.
             double volumeOfEarthInKilos = (4.0f/3.0f) * valueOfPi * radiusOfEarth *radiusOfEarth * radiusOfEarth;
          
             //converting the Kilos into miles.
             double radiusOfEarthInMiles = radiusOfEarth/1.60934;

             //Calculating the Volume of earth in Miles
             double volumeOfEarthInMiles = (4.0f/3.0f) * valueOfPi * radiusOfEarthInMiles *radiusOfEarthInMiles * radiusOfEarthInMiles;

             //printing the output on the screen.
             System.out.println("The Volume of earth in cubic kilometers is " + volumeOfEarthInKilos + " and cubic miles is "
+ volumeOfEarthInMiles);      
           }
}