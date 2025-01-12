import java.util.Scanner;

public class NumberChecker {

	public static int countDigit(int number) {
		int count = 0;
		while (number != 0) {
			count++;
			number = number / 10;
		}
		return count;
	}

	public static int[] digitInNumber(int number) {
		int countDigit = countDigit(number);
		int[] digits = new int[countDigit];
		int i = 0;
		while (number != 0) {
			digits[i] = number % 10;
			number = number / 10;
			i++;
		}
		return digits;

	}

	public static boolean checkDuck(int number) {
		int[] digits = digitInNumber(number);

		for (int i = 0; i < digits.length; i++) {
			if (digits[i] == 0)
				return false;
		}
		return true;
	}

	public static boolean checkArmstrong(int number) {
		int[] digits = digitInNumber(number);
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			sum = sum + (digits[i] * digits[i] * digits[i]);
		}
		boolean check = (sum == number);
		return check;

	}

	public static int[] largestAndSecondLargest(int number) {

		int[] digits = digitInNumber(number);
		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
		// Finding the largest element
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] > largest)
				largest = digits[i];
		}
		// Finding the second largest element
		for (int i = 0; i < digits.length; i++) {
			// Update second largest if the current element is greater
			// than second largest and not equal to the largest
			if (digits[i] > secondLargest && digits[i] != largest) {
				secondLargest = digits[i];
			}
		}
		int[] largestAndSecondLargest = { largest, secondLargest };

		return largestAndSecondLargest;
	}

	public static int[] smallestAndSecondSmallest(int number) {
		int[] digits = digitInNumber(number);
		int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
		// Finding the largest element
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] < smallest)
				smallest = digits[i];
		}
		// Finding the second largest element
		for (int i = 0; i < digits.length; i++) {
			// Update second largest if the current element is greater
			// than second largest and not equal to the largest
			if (digits[i] < secondSmallest && digits[i] != smallest) {
				secondSmallest = digits[i];
			}
		}
		int[] smallestAndSecondSmallest = { smallest, secondSmallest };

		return smallestAndSecondSmallest;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number");
		int number = input.nextInt();

		int countOfDigits = countDigit(number); // calling of method countDigit
		int[] digitInNumber = digitInNumber(number);// calling of method mean
		int[] smallestAndSecondSmallest = smallestAndSecondSmallest(number);// calling of method shortest
		int[] largestAndSecondLargest = largestAndSecondLargest(number); // calling of method tallest

		System.out.println("Count of digits is " + countOfDigits);

		System.out.println("Digits in number are ");
		for (int i = 0; i < digitInNumber.length; i++) {
			System.out.println(digitInNumber[i]);
		}

		System.out.println("largest And SecondLargest of digits are " + largestAndSecondLargest[0] + " and "
				+ largestAndSecondLargest[1]);

		System.out.println("smallest And SecondSmallest of digits are " + smallestAndSecondSmallest[0] + " and "
				+ smallestAndSecondSmallest[1]);
	     
	    input.close();

	}

}