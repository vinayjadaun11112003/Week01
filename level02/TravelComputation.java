import java.util.*;
class TravelComputation {
   
    public static void main(String[] args) {
        //creating scanner object to take input 
        Scanner input = new Scanner(System.in);
       // Create a variable name and take input
       System.out.println("Enter the name of Traveller : ");
       String name = input.nextLine();
       
       // Create a variable fromCity, viaCity and toCity to indicate the city and take input to it.
       // from city, via city and to city the person is travelling
       System.out.println("Enter from which city travel started : ");
       String fromCity = input.nextLine();
       System.out.println("Enter via which city traveller travelled : ");
       String viaCity = input.nextLine();
       System.out.println("Enter to which city traveller travelled : ");
       String toCity = input.nextLine();
 
       // Create a variable distanceFromToVia to indicate the distance and take input to it
       // between the fromCity to viaCity
       System.out.println("Enter distance from starting point to via point : ");
       double distanceFromToVia = input.nextDouble();
 
       // Create a variable timeFromToVia to indicate the time taken to and take input to it
       // travel from fromCity to viaCity in minutes
       System.out.println("Enter the time between starting point and via point : ");
       int timeFromToVia = input.nextInt();
 
       // Create a variable distanceViaToFinalCity to indicate the distance and take input to it
       // between the viaCity to toCity
       System.out.println("Enter distance from via to destination point : ");
       double distanceViaToFinalCity = input.nextDouble();
 
       // Create a variable timeViaToFinalCity to indicate the time taken to and take input to it
       // travel from viaCity to toCity in minutes
       System.out.println("Enter the time taken to travel via to destination point : ");
       int timeViaToFinalCity = input.nextInt();
 
       // Create a variable totalDistance to indicate the total distance
       // between the fromCity to toCity
       double totalDistance = distanceFromToVia + distanceViaToFinalCity;
 
       // Create a variable totalTime to indicate the total time taken to
       // travel from fromCity to toCity in minutes
       int totalTime = timeFromToVia + timeViaToFinalCity;
 
 
       // Print the travel details
       System.out.println("The Total Distance travelled by " + name + " from " + 
                          fromCity + " to " + toCity + " via " + viaCity +
                          " is " + totalDistance + " km and " +
                          "the Total Time taken is " + totalTime + " minutes");

    //    closing the scanner object
     input.close();
    }
 }
 
