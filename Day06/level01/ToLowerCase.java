import java.util.*;
class ToLowerCase{
     public static String userLowercase(String str){
           //making new string with stringbuilder with ascii value addition to each character. This will convert each character to lowercase
           StringBuilder sb = new StringBuilder();
           for(int i=0;i<str.length();i++){
               sb.append((char)((int)str.charAt(i)+32));
                
           }
           return sb.toString();
     }
     public static void main(String[] arg){
          //creating scanner object
          Scanner input = new Scanner(System.in);
          //taking input and converting it by calling method of built in and user defined.
          System.out.println("Enter the String in Lowercase : ");
          String str = input.nextLine();
          String strUserLowercase = userLowercase(str);
          String strBuiltIn = str.toLowerCase();
          System.out.println("The user defined method String to lowercase is " + strUserLowercase);
          System.out.println("The builtin method String to lowercase is " + strBuiltIn);
          //closing the input object.
          input.close();
     }
}