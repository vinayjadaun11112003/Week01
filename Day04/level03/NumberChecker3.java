import java.util.Scanner;

public class NumberChecker3 {
    public static int countDigit(int number){
		int count=0;
		while(number!=0){
			count++;
			number=number/10;
		}
		return count;
	}
    public static int[]digitInNumber(int number){
		int countDigit=countDigit(number);
		int []digits=new int[countDigit];
		int i=0;
		while(number!=0){
			digits[i]=number%10;
			number=number/10;
			i++;
		}
		return digits;
    }
    public static int[]reverseDigits(int number){
		
		int []digits=digitInNumber(number);
        int size=digits.length;
        int []reverse=new int[size];
		for(int i=0;i<size;i++){
            reverse[i]=digits[size-i-1];
        }
		return reverse;
    }
    public static boolean checkPalindrome(int number){
        int []digits=digitInNumber(number);
        int []reverse=reverseDigits(number);
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=reverse[i])
                return false;

        }
        return true;
    }
    public static boolean checkDuck(int number){
        int []digits=digitInNumber(number);
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0)
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int number=input.nextInt();
    

        int countOfDigits=countDigit(number);	//calling of method countDigit
        int[]digitInNumber=digitInNumber(number);//calling of method mean
        // int[]reverseDigits=reverseDigits(number);
        boolean checkPalindrome=checkPalindrome(number);
        boolean checkDuck=checkDuck(number);


        System.out.println("Count of digits is "+countOfDigits);

        System.out.println("Digits in number are ");
        for(int i=0;i<digitInNumber.length;i++){
            System.out.println(digitInNumber[i]);
        }

        System.out.println("The number is Duck  number ? "+checkDuck);

        System.out.println("The number is Palindrome number ? "+checkPalindrome);
    
    }
}
