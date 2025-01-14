import java.util.*;
class HandleArrayIndexOutOfBoundException{ 
      public static void genrateException(int[] arr){
            int a = arr[9];
      }
      public static void handleException(int[] arr){
          //catching the object of exception by try - catch block
      try{ 
         //trying to get int which index is not availible, this will through an error.
         genrateException(arr);
      } catch(ArrayIndexOutOfBoundsException e){
           System.out.print("Opps you are trying to get index value which is not availible !!!!");
      }
}
      public static void main(String[] args){
            //creating a arrray of size and assigning values to it.
            int[] arr = new int[]{1,2,3};
             //calling method
            handleException(arr);
      }
}