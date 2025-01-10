     import java.util.*;
class 
{
   
      public static void main(String[] args){
            //Creating the scanner class 0bject
            Scanner input = new Scanner(System.in);
            //Getting input from the user of number
            System.out.println("Enter the Number which you want to print table 6 - 9 : ");
            int number= input.nextInt();
           if((number>=6) && (number<=9)){
                for(int i=1;i<11;i++){
                     System.out.println(number + " * " + i + " = " + i*number);
                }
           }else{
             System.out.println("Table not printed of this number");
            }
             //closing the input scanner
            input.close();
      }
}
