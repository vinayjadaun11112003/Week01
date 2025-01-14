import java.util.*;
class HandleStringIndexOutOfBoundException{ 
      public static void handleException(String str){
          //catching the object of exception by try - catch block
      try{ 
         //trying to get char which index is not availible, this will through an error.
         char c = str.charAt(8);
      } catch(StringIndexOutOfBoundsException e){
           System.out.print("Opps you are trying to get index value which is not availible !!!!");
      }
}
      public static void main(String[] args){
            //creating a string and assigning String to it
            String str = "vinay";
             //calling method
            handleException(str);
      }
}