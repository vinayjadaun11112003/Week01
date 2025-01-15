import java.util.*;
class CheckEquals{
      public static boolean equals(String first, String second){
            //comparing each charactor of both the string
            for(int i = 0;i<Math.min(first.length(),second.length());i++){
                 if(first.charAt(i) != second.charAt(i)){
                        return false;
                  }
            }return true;
      }
      public static void main(String[] args){
            //creating scanner class object 
            Scanner input = new Scanner(System.in);
            //taking input of first and second string
            System.out.println("Enter the input for the first String : ");
            String first = input.nextLine();
            System.out.println("Enter the input for the second String : ");
            String second = input.nextLine();
            //storing the result of method of equals 
            Boolean equals = equals(first,second);
            if(equals){
                System.out.println("Both are equals");
             }else{
                System.out.println("Both are different");
             }
            //closing the scanner class object
            input.close();
      }
}