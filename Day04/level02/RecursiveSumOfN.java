
import java.util.Scanner;

class RecursiveSumOfN{
	
	public static int sumRecursive(int number){
		if(number <= 1){
			return number;
		}
		return number + sum(number-1);
	}
	
	public static int sum(int number){
		int total = number * (number+1) / 2;
		return total;
	}
	
	public static void main(String [] args){
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter a natural number :");
		int number = scan.nextInt();
		
		System.out.println("Sum of n natural number by using recursion is :" + sumRecursive(number));
		
		System.out.println("Sum of n natural number by using loop is :" + sum(number));
		
		if(sumRecursive(number) == sum(number)){
			System.out.print("Both results is same :" + sum(number));
		}else{
			System.out.print("results are different ");
		}
		
	}
}
