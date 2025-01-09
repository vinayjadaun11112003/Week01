import java.util.*;


 class TotalRound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter distance in meter for first side : ");
        double side1 = input.nextDouble();
        System.out.println("Enter distance in meter for second side : ");
        double side2 = input.nextDouble();
        System.out.println("Enter distance in meter for third side : ");
        double side3 = input.nextDouble();
        double perimeterOfTriangle = side1 + side2 + side3;
        double totalDistance = 5000;
        double totalRounds = totalDistance / perimeterOfTriangle;
        System.out.println("The total number of rounds the athlete will run is "+totalRounds+" to complete 5 km");
        input.close();
    }
}
