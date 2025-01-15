import java.util.*;
class CountVowelsAndConsonants{
      //method to count the count of vowel, consonant and other special character with the use of ASCII 
      public static int[] countVowels(String str){
            int counter = 0;
            int counterr = 0;
            int counterrr =0;
            for(int i=0;i<str.length();i++){
                if((int)str.charAt(i) == 97 || (int)str.charAt(i) == 101 || (int)str.charAt(i) == 105 || (int)str.charAt(i) == 111 || (int)str.charAt(i) == 117){
                      counter++;
                  }
                  else if(((int)str.charAt(i)>122) || ((int)str.charAt(i)<97)){
                     counterrr++;
                  }
                  else if((int)str.charAt(i) != 97 || (int)str.charAt(i) != 101 || (int)str.charAt(i) != 105 || (int)str.charAt(i) != 111 || (int)str.charAt(i) != 117){
                      counterr++;
                  }
            }
            return new int[]{counter,counterr,counterrr};
      }
    
      public static void main(String[] args){
            //Scanner to take input
            Scanner input = new Scanner(System.in);
            //take input from user
            System.out.println("Enter the string : ");
            String str = input.nextLine().toLowerCase();
            //create countVowel which count vowel,consonant and other special character
            int[] countVowels = countVowels(str);
            System.out.println("The Total count of vowels are " + countVowels[0]);
            System.out.println("The Total count of consonants are " + countVowels[1]);
            System.out.println("The Total count of charactor which are not vowels or consonants are " + countVowels[2]);
            //close scanner object
            input.close();
      }
}
