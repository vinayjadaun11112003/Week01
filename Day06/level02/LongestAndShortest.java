import java.util.*;
class LongestAndShortest{
      //method to get the longest string word
       public static int longest(String[][] arr){
             int longestSize = 0;
             for(int i = 0;i<arr.length;i++){
                  if(Integer.parseInt(arr[i][1]) > Integer.parseInt(arr[longestSize][1])){
                        longestSize = i;
                   }
             }
             return longestSize;
       }
       //method to get the smallest string word
       public static int smallest(String[][] arr){
             int smallestSize = 0;
             for(int i = 0;i<arr.length;i++){
                  if(Integer.parseInt(arr[i][1])<Integer.parseInt(arr[smallestSize][1])){
                        smallestSize = i;
                   }
             }
             return smallestSize;
       }
       //method to split the string using method
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
              //take input from user.
              System.out.println("Enter the String : ");
              String str = input.nextLine();
              //call the method and store the 2d array for output
              String[][] wordAndLength = userSplitTwo(str);
              System.out.println("Printing each word with its length" + Arrays.deepToString(wordAndLength));
              int longest = longest(wordAndLength);
              int smallest = smallest(wordAndLength);
              System.out.println("Array - " + Arrays.deepToString(wordAndLength));
              System.out.println("Longest word in an array is => " + wordAndLength[longest][0] + " with size of =>  " + wordAndLength[longest][1]);
              System.out.println("Smallest word in an array is => " + wordAndLength[smallest][0] + " with size of =>  " + wordAndLength[smallest][1]);
              //close the scanner object
              input.close();
              
       }
}