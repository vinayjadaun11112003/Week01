import java.util.*;
class j{
      public static void main(String[] args){
            //creating a scanner class object.
            Scanner input = new Scanner(System.in);
            //taking input in the number variable.
            System.out.println("Enter the cooundown count : ");
            int number = input.nextInt();
            //checking the condition according to the question.
            while(number>0){ 
                 if(number == 1){ 
                        System.out.println("Rocket Launch");
                        return;
                   }
                 System.out.println(number);
                 number--;
           
            }
            //close the scanner object
            input.close();
      }
}