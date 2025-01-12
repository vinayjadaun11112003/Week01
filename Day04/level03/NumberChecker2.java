import java.util.*;
public class NumberChecker2 {
    
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
    public static int sumOfDigit(int number){
        int []digits=digitInNumber(number);
		int sum=0;
		for(int i=0;i<digits.length;i++){
			sum=sum+digits[i];
		}
		return sum;
    }
    public static double sumOfSquareOfDigit(int number){
        int []digits=digitInNumber(number);
		double sum=0;
		for(int i=0;i<digits.length;i++){
			sum=sum+Math.pow(digits[i],2);
		}
		return sum;
    }
    public static boolean checkHarshad(int number){
        int sumOfDigit=sumOfDigit(number);
		if(number%sumOfDigit==0){
				return true;
		}
		return false;
    }

    public static int[][] frequencyOfDigit(int number){
        
        int [][]digits=new int[10][2];
		for(int i=0;i<digits.length;i++){
			int digit=number%10;
            digits[digit][1]++;
            digits[digit][0]=digit;
            number=number/10;
		}
		return digits;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int number=input.nextInt();
    

        int countOfDigits=countDigit(number);	//calling of method countDigit
        int[]digitInNumber=digitInNumber(number);//calling of method mean
        int sumOfDigit=sumOfDigit(number);
        double sumOfSquareOfDigit=sumOfSquareOfDigit(number);
        boolean checkHarshad=checkHarshad(number);
        int[][]frequencyOfDigit=frequencyOfDigit(number);


        System.out.println("Count of digits is "+countOfDigits);

        System.out.println("Digits in number are ");
        for(int i=0;i<digitInNumber.length;i++){
            System.out.println(digitInNumber[i]);
        }
        System.out.println("Sum  of digits is "+sumOfDigit);

        System.out.println("Sum of Square of digits are "+sumOfSquareOfDigit);

        System.out.println("The number is Harshad number ? "+checkHarshad);
        
        for(int i=0;i<10;i++){
            System.out.println("Digit "+frequencyOfDigit[i][0]+" frequency "+frequencyOfDigit[i][1]);
        }
    
    }
}