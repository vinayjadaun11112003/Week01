import java.util.*;
class PossibleNumberOfHandshakes{
      public static int handShakes(int noOfStudents){
             //returning total number of possible handshakes
             return (noOfStudents * (noOfStudents-1))/2;
      }
      public static void main(String[] args){
             //creating scanner object
             Scanner input = new Scanner(System.in);
             //taking input of number of studentsr.
             System.out.println("Enter Number of Students : ");
             int noOfStudents = input.nextInt();
             int possibleHandShakes = handShakes(noOfStudents);
             System.out.println("Total Possible Number of hand shakes are "+ possibleHandShakes + " for number of students of " + noOfStudents);
             //closing the scanner object
             input.close();
      }
}