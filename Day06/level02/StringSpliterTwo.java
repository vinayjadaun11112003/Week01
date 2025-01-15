import java.util.*;
class StringSpliterTwo{
       //method to store each word and their length
       public static String[][] userSplitTwo(String str){
            
              int wordcount = 1;
              for(int i=0;i<str.length();i++){
                   if(str.charAt(i)==' '){
                         wordcount++;
                    }
              }
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
              String[][] star = new String[strArray.length][2];
              for(int i=0;i<strArray.length;i++){
                    star[i][0] = strArray[i];
                    star[i][1] = Integer.toString(strArray[i].length());
              }
               return star;
           
       }
       public static void main(String[] args){
              //Scanner object to take input 
              Scanner input = new Scanner(System.in);
              //take input from user
              System.out.println("Enter the String : ");
              String str = input.nextLine();
              //method calling and store the 2d array from it
              String[][] wordAndLength = userSplitTwo(str);
              System.out.println("Printing each word with its length" + Arrays.deepToString(wordAndLength));
              //close the scanner object
              input.close();
              
       }
}