import java.util.*;
class HandleIlligalArgumentException{ 
      public static void genrateException(String str){
            String a = str.substring(5,1);
      }
      public static void handleException(String str){
          //catching the object of exception by try - catch block
      try{ 
         //trying to genrate exception
         genrateException(str);
      } catch(Exception e){
           System.out.print("Opps You just triggered Illigal Argument exception !!!!");
      }
}
      public static void main(String[] args){
            //creating a arrray of size and assigning values to it.
            String str = "vinay";
             //calling method
            handleException(str);
      }
}