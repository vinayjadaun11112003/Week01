import java.util.*;
 class DoubleOpt {
    public static void main(String[]args){
        //using Scanner object for user input
        Scanner input=new Scanner(System.in);


        //Taking number1 from user as input
        System.out.println("Enter the value of number 1 : ");
        double a=input.nextDouble();

         //Taking number2 from user as input
         System.out.println("Enter the value of number 2 : ");
        double b=input.nextDouble();
         
         //Taking number3 from user as input
         System.out.println("Enter the value of number 3 : ");
        double c=input.nextDouble();

        //printing output to the screen.
        System.out.println("The results of Double Operations are "+(a+b*c)+ " "+(a*b+c)+" "+ (c+a/b) +"and"+ a%b+c);

        //closing the input object of scanner class.
        input.close();

    }
}
