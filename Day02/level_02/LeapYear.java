import java.util.*;
 class LeapYear {
    public static void main(String[] args) {
        //creating scanner object to take input
        Scanner input = new Scanner(System.in);
        //taking the input of year
        System.out.println("Enter the year : ");
        int year = input.nextInt();
        //checking the condition according
        if(year<1582){
            System.out.println("Please Enter valid year ");
        }
        else if((year % 4 == 0)){
            System.out.println("This "+year+" is a leap year");
        }else{
            System.out.println("This is not a leap year");
        }
        //closing the scanner object.
        input.close();
    }
}
