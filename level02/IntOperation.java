import java.util.*;

 class IntOperation {
    public static void main(String[]args){
        //using Scanner object for user input
        Scanner input=new Scanner(System.in);


        //Taking number1 from user as input
        System.out.println("Enter first number : ");
        int a=input.nextInt();

         //Taking number2 from user as input
         System.out.println("Enter second number : ");
        int b=input.nextInt();
         
         //Taking number2 from user as input
         System.out.println("Enter third number : ");
        int c=input.nextInt();

        //printing Quotient and Reminder of num1 and num2
        System.out.println("The results of Int Operations are "+(a+b*c)+ " , "+(a*b+c)+" , "+ (c+a/b) +" and "+ a%b+c);

        //closing scanner object
        input.close();
    }
}
