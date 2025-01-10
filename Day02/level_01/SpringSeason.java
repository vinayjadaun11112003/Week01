import java.util.*;
      class SpringSeason{
            public static void main(String[] args){
                //creating a scanner class.
                Scanner input = new Scanner(System.in);
                //taking the input of month and day.
                System.out.println("Enter month : ");
                int month = input.nextInt();
                System.out.println("Enter day : ");
                int day = input.nextInt();

                //checking the nested condition according to the question.
                if(month > 12 || month < 1){
                      System.out.println("Please Enter a valid month");
                }else if((day < 1) || (day > 31)){
                      System.out.println("Please Enter valid day");
                }
                else if((month > 2) && (month < 6)){
                             if((month == 2) && (day<20)){
                                    System.out.println("Not a spring season yet");
                                     return;
                              };
                              if((month == 6 ) && (day>20)){
                                    System.out.println("Not a spring season yet"); 
                                    return;
                              }
                      System.out.println("It's spring season");
                }else { 
                      System.out.println("It's not the spring season yet");
                }
                //closing the ojb
                input.close();
       }
}