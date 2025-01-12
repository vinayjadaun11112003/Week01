import java.util.*;
public class NumberChecker4 {
   
    public static boolean checkPrime (int number){
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;         
    }

    public static boolean checkNeon(int number){
        double squareOfNumber=Math.pow(number, 2);
        double sumOfDigit=0;
        while(squareOfNumber==0){
            int digit=(int)(squareOfNumber%10);
            sumOfDigit=sumOfDigit+digit;
            squareOfNumber=squareOfNumber/10;
        }
        if(number==sumOfDigit)
            return true;
       
        return false;
    }
    
    public static boolean checkSpy(int number){
        int sumOfDigit=0;
        int productOfDigit=1;
        while(number==0){
            int digit=number%10;
            sumOfDigit=sumOfDigit+digit;
            productOfDigit=productOfDigit*digit;
            number=number/10;
        }
        if(productOfDigit==sumOfDigit)
            return true;
        
            return false;
        }
        public static boolean checkAutomorphic(int number){
            double squareOfNumber=Math.pow(number, 2);        
            if((number%10)==(squareOfNumber%10))
                return true;
           
            return false;
        }
        public static boolean checkBuzz(int number){
                
            if((number%7==0)||(number%10==7))
                return true;
           
            return false;
        }
       
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int number=input.nextInt();

        boolean checkPrime=checkPrime(number);	//calling of method countDigit
        boolean checkNeon=checkNeon(number);//calling of method mean
        boolean checkBuzz=checkBuzz(number);
        boolean checkSpy=checkSpy(number);
        boolean checkAutomorphic=checkAutomorphic(number);

        System.out.println("The number is Prime  number ? "+checkPrime);
        System.out.println("The number is Neon  number ? "+checkNeon);
        System.out.println("The number is Spy  number ? "+checkSpy);
        System.out.println("The number is Automorphic  number ? "+checkAutomorphic);
        System.out.println("The number is Buzz number ? "+checkBuzz);
    
    }
}
