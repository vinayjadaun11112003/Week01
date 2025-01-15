import java.util.*;
class WordSpliterOne{
       //method to check equality of string array
       public static boolean isBothEquals(String[] strArrayOfBuiltIn, String[] strArrayOfUserDefined){
              for(int i=0;i<strArrayOfUserDefined.length;i++){
                     if(strArrayOfUserDefined[i].equals(strArrayOfBuiltIn[i])){
                            continue;
                     }else{
                            return false;
                     }
              }return true;

       }
       //method to split the word of string into array
       public static String[] userSplit(String str){
            
              int wordcount = 1;
              for(int i=0;i<str.length();i++){
                   if(str.charAt(i)==' '){
                         wordcount++;
                    }
              }
              System.out.println("wordcount" + wordcount);
              int index = 0;
              String[] strArray = new String[wordcount];
              int low = 0;
              int high = 0;
              for(int i = 0;i<str.length();i++){
                    
                    if(str.charAt(i) != ' '){
                         high++;
                        
                         
                     }else{
                            strArray[index] = str.substring(low,high);
                            index++;
                            high = high +1;
                            low = high;
                     }
              }
              strArray[index] = str.substring(low,high);
              System.out.println("The array is " + Arrays.toString(strArray));
              return strArray;
       }
       public static void main(String[] args){
              //Scanner object to take input
              Scanner input = new Scanner(System.in);
              //take input from user
              System.out.println("Enter the String : ");
              String str = input.nextLine();
              //spliting by built in method
              String[] strArrayOfBuiltIn = str.split(" ");
              //spliting by user defined method
              String[] strArrayOfUserDefined = userSplit(str);
              //printing the result and boolean value 
              System.out.println("Value of User Defined method " + Arrays.toString(strArrayOfBuiltIn));
              System.out.println("Value of Built in method " + Arrays.toString(strArrayOfUserDefined));
              System.out.println("Both are equal ==> " + isBothEquals(strArrayOfBuiltIn,strArrayOfUserDefined));
              //close the input scanner
              input.close();

              
       }
}