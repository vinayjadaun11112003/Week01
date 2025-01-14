import java.util.*;
class HandleNullPointerException{ 
      public static void generateException(String str){
            int text = str.length();
      }
      public static void handleException(String str){
          //catching the object of exception by try - catch block
      try{ 
          //genrating exception
           generateException(str);
      } catch(NullPointerException e){
           System.out.print("Opps Something went wrong !!!!");
      }
}
      public static void main(String[] args){
            //creating a string and assigning null to it
            String str = null;
             //calling method
            handleException(str);
      }
}