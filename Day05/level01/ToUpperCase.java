import java.util.*;
class ToUpperCase{
     public static String userUppercase(String str){
           //converting to Uppercase with ascii code by subtracting 
           StringBuilder sb = new StringBuilder();
           for(int i=0;i<str.length();i++){
               sb.append((char)((int)str.charAt(i)-32));
                
           }
           return sb.toString();
     }
     public static void main(String[] arg){
          //taking input by creating the scanner class object.
          Scanner input = new Scanner(System.in);
          System.out.println("Enter the String in uppercase : ");
          String str = input.nextLine();
          String strUserUppercase = userUppercase(str);
          String strBuiltIn = str.toUpperCase();
          System.out.println("The user defined method String to lowercase is " + strUserUppercase);
          System.out.println("The builtin method String to lowercase is " + strBuiltIn);
          //closing the input object.
          input.close();
     }
}