import java.util.*;

 class SimpleInterest {
    public static void main(String[] args) {
        //creating scanner class object for the input.
        Scanner input = new Scanner(System.in);
        //taking input of ammount
        System.out.println("Enter principle ammount : ");
        double principle = input.nextDouble();
        //taking input of interest
        System.out.println("Enter the rate of interest : ");
        double rateOfInterest = input.nextDouble();
        //taking input of time
        System.out.println("Enter the time : ");
        double time = input.nextDouble();
        //calculating the total simpleInterest.
        double simpleInterest = (principle * rateOfInterest * time)/100;
        //printing the output to the screen
        System.out.println(" The Simple Interest is "+simpleInterest+" for Principal "+principle+", Rate of Interest "+rateOfInterest+" and Time "+time);
        //closing the object of class of scanner.
        input.close();
    }
}
