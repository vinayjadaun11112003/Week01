import java.util.*;
class CheckSubstringEquals{
     public static boolean isEquals(String str, int start, int end){
         //checking the condition of equals.
         StringBuilder sb = new StringBuilder();
         for(int i=start;i<=end;i++){
                sb.append(str.charAt(i));
           }
         if(sb.toString() == str) return true;
         return false;
     }
     public static void main(String[] args){
          //creating scanner object of class
          Scanner input = new Scanner(System.in);
          //taking input of main string and substring indices
          System.out.println("Enter the String : ");
          String str = input.nextLine();
          System.out.println("Enter start index of substring : ");
          int start = input.nextInt();
          System.out.println("Enter end index of substring : ");
          int end = input.nextInt();
          //checking by calling method and printing output according to it.
          Boolean isEquals = isEquals(str,start,end);
          if(isEquals){
               System.out.println("The substring are same as the original string");
            }else{
               System.out.println("The substring are not same as the original string");
            }
           //closing the object of scanner class 
          input.close();
     }
}