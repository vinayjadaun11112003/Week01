import java.util.*;
class ConvertCharArrays{
       public static char[] userDefined(String str){
             //converting character to array.
             char[] charArray = new char[str.length()];
             for(int i=0;i<str.length();i++){
                 charArray[i] = str.charAt(i);
             }
             return charArray;
       }
       public static void main(String[] args){
             //creating scanner object to take input
             Scanner input = new Scanner(System.in);
             //taking input of the string and converting char array by methods
             System.out.println("Enter the new String : ");
             String str = input.nextLine();
             char[] userDefined = userDefined(str);
             char[] builtIn = str.toCharArray();
             
             System.out.println("Printing char Arrays userdefined " + Arrays.toString(userDefined));
             System.out.println("Printing char Arrays build in " + Arrays.toString(builtIn));
             //closing the scanner object
             input.close();
       }
}