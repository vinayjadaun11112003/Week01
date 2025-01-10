import java.util.*;
class CheckPositives{
       public static void main(String[] args){
             Scanner input = new Scanner(System.in);
             System.out.println("Enter the number ");
             int number = input.nextInt();
             if(number<0){
                   System.out.println("Negative");
             }else if(number==0){
                   System.out.println("zero");
              }else{
                   System.out.println("Positive");
              }
             input.close();
       }
}