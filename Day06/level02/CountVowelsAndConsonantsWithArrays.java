import java.util.*;
class CountVowelsAndConsonantsWithArrays{
      //method to create 2d array which can store array of vowel, consonant and special character.
      public static char[][] countVowels(String str){
            int counter = 0;
            int counterr = 0;
            int counterrr =0;
            char[][] charArr = new char[3][26];
            for(int i=0;i<str.length();i++){
                if((int)str.charAt(i) == 97 || (int)str.charAt(i) == 101 || (int)str.charAt(i) == 105 || (int)str.charAt(i) == 111 || (int)str.charAt(i) == 117){
                      charArr[0][counter]=str.charAt(i);
                      counter++;
                  }
                  else if(((int)str.charAt(i)>122) || ((int)str.charAt(i)<97)){
                      charArr[1][counterr]=str.charAt(i);
                      counterr++;
                  }
                  else if((int)str.charAt(i) != 97 || (int)str.charAt(i) != 101 || (int)str.charAt(i) != 105 || (int)str.charAt(i) != 111 || (int)str.charAt(i) != 117){
                      charArr[2][counterrr]=str.charAt(i);
                      counterrr++;
                  }
            }
            return charArr;
      }
    
      public static void main(String[] args){
            //Scanner object to take input
            Scanner input = new Scanner(System.in);
            //take input of string
            System.out.println("Enter the string : ");
            String str = input.nextLine().toLowerCase();
            //call method and store 2d array into 2d array
            char[][] countVowels = countVowels(str);
            System.out.println(Arrays.deepToString(countVowels));
            //close scanner object
            input.close();
      }
}
