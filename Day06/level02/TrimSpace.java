import java.util.*;
 class TrimSpace {
    //method to trim the extra leading and trailing space
    public static String userDefinedTrim(String str){
        int low = 0;
        int high = str.length()-1;
        while(low<high){
            if(str.charAt(low)==' '){
                low++;
            }else if(str.charAt(high)==' '){
                high--;
            }else{
                break;
            }
        }
        return str.substring(low, high+1);
    }
    public static void main(String[] args) {
        //Scanner object to take input
        Scanner input = new Scanner(System.in);
        //take input from the user
        System.out.println("Please Enter any String with leading and trailing spaces : ");
        String str = input.nextLine();
        //trim by built in method
        String builtInTrim = str.trim();
        //trim by user defined method
        String userDefinedTrim = userDefinedTrim(str);
        //print both the result and boolean value
        System.out.println("This is the output of user defined method to trim --> "+userDefinedTrim);
        System.out.println("This is the out of built in trim method of string --> " +builtInTrim);
        System.out.println("Both are equals ==> "+userDefinedTrim.equals(builtInTrim));
        //close the scanner object
        input.close();
    }
}
