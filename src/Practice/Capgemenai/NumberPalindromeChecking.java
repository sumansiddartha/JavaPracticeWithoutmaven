package Practice.Capgemenai;

import java.util.Scanner;

public class NumberPalindromeChecking {
	public static boolean IsPalindromeIterative(int number) {
	int originalNumber=number;
	int reversedNumber=0;
	while(number>0) {
		int digit=number%10;
		reversedNumber=reversedNumber*10+digit;
		number/=10;
		
	}
	return originalNumber==reversedNumber;
	}
	
	public static boolean isPalindromeString(int number) {
		String original=String.valueOf(number);
		String reversed=new StringBuilder(original).reverse().toString();
		return original.equals(reversed);
	}
	
	public static boolean isPalindromeRecursive(int number) {
		return  isPalindromeHelper(number,0)==number;
	}
	private static int isPalindromeHelper(int number, int reversedNumber) {
		if(number==0) {
			return reversedNumber;
		}
		reversedNumber=reversedNumber*10+number%10;
		return isPalindromeHelper(number/10, reversedNumber);
	}
	
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a palindrome or not");
		int inputnumber=in.nextInt();
		boolean isPalindromeIterative = IsPalindromeIterative(inputnumber);
		boolean isPalindromeString = isPalindromeString(inputnumber);
		boolean isPalindromeRecursive = isPalindromeRecursive(inputnumber);
		System.out.println(isPalindromeIterative);
		if(isPalindromeIterative) {
			System.out.println("Given number is a palindrome");
		}
		else {
			System.out.println("Given number is not a palindrome");
		}
		if(isPalindromeString) {
			System.out.println("Given number is a palindrome");
		}
		else {
			System.out.println("Given number is not a palindrome");
		}
		if(isPalindromeRecursive) {
			System.out.println("Given number is a palindrome");
		}
		else {
			System.out.println("Given number is not a palindrome");
		}
		
	}

}
