     import java.util.*;
class BonusCheck{
   
      public static void main(String[] args){
            //Creating the scanner class 0bject
            Scanner input = new Scanner(System.in);
            //Getting input from the user of number
            System.out.println("Enter the salary and year in company : ");
            int salary = input.nextInt();
            int yearInCompany = input.nextInt();
            //printing the output according to the question.
            if(yearInCompany > 5){
                   int bonus = (salary * 5) / 100;
                   System.out.println("You will get bonus of " + bonus);
              }else{ 
                   System.out.println("Bonus not avaible");
              }
             //closing the input scanner
            input.close();
      }
}
