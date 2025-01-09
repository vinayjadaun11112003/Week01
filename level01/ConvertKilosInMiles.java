class ConvertKilosInMiles{
      public static void main(String[] args){
            
             //Taking variable as double to store the Distance in Kilometers.
             double distanceInKilometers = 10.8;
             
             //Converting the distance in Kilometers to distance in miles.
             // 1Km = 1.6miles.
             double distanceInMiles = distanceInKilometers / 1.6;
  
             //Printing the converted values of distance.
             System.out.println("The Distance " + distanceInKilometers + " km in miles is " + distanceInMiles);

      }
}