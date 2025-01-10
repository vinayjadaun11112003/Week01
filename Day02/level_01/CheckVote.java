import java.util.*;
class CheckVote{
      public static void main(String[] args){

            //creating scanner object
            Scanner input = new Scanner(System.in);
            //taking input from user 
            System.out.println("please enter you age");
            int age = input.nextInt();
            //checking condition
     
             if(age<18){
                System.out.println("No you cannot vote");
              }else{
                System.out.println("You can vote");
                }
              //closing the input object
            input.close();
      }
}