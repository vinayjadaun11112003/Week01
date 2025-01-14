import java.util.*;
class HandleNumberFormatException{ 
      public static void genrateException(String str){
            int a = Integer.parseInt(str);
      }
      public static void handleException(String str){
          //catching the object of exception by try - catch block
      try{ 
         //trying to generate exception
         genrateException(str);
      } catch(Exception e){
           System.out.print("Opps You just triggered Number format Exception !!!!");
      }
}
      public static void main(String[] args){
            //creating a arrray of size and assigning values to it.
            String str = "vinay";
             //calling method
            handleException(str);
      }
}