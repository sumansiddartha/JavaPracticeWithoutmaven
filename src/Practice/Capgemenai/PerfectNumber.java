package Practice.Capgemenai;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PerfectNumber {
	
	public static boolean isPerfectBruteForce(int number) {
		int sum=0;
		for(int i=1;i<=number/2;i++) {
			if(number%i==0) {
				sum+=i;
			}
		}
		return number==sum;
	}
	
	public static boolean isPerfectStream(int number) {
		int sum = IntStream.rangeClosed(2, (int)Math.sqrt(number))
		.filter(test->number%test==0)
		.reduce(1,(s,test)->s+test+(number/test));
	return sum==number;	
	}
	
	
	public static boolean isPerfectEuclidEuler(int number) {
		int p=2;
		int perfectnumber=(int)(Math.pow(2, p-1)*(Math.pow(2, p)-1));
		while(perfectnumber<=number) {
			if(perfectnumber==number) {
				return true;
			}
			p++;
			perfectnumber=(int)(Math.pow(2, p-1)*(Math.pow(2, p)-1));
		}
		return false;
	}
	public static boolean isPerfectEuclidEulerUsingShift(int number) {
		int p=2;
		int perfectnumber=(int)(2<< (p-1))*((2<< p)-1);
		while(perfectnumber<=number) {
			if(perfectnumber==number) {
				return true;
			}
			p++;
			perfectnumber=(int)(2<< (p-1))*((2<< p)-1);
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number for perfect number:");
		int number=in.nextInt();
		
		boolean perfectBruteForce = isPerfectBruteForce(number);
		boolean isPerfectStream = isPerfectStream(number);
		boolean isPerfectEuclidEuler = isPerfectEuclidEuler(number);
		boolean isPerfectEuclidEulerUsingShift = isPerfectEuclidEulerUsingShift(number);
		
		if(perfectBruteForce) {
			System.out.println("Given number is a perfect number");
		}else {
			System.out.println("Given number is not a perfect number");
		}
		if(isPerfectStream) {
			System.out.println("Given number is a perfect number");
		}else {
			System.out.println("Given number is not a perfect number");
		}
		if(isPerfectEuclidEuler) {
			System.out.println("Given number is a perfect number");
		}else {
			System.out.println("Given number is not a perfect number");
		}
		if(isPerfectEuclidEulerUsingShift) {
			System.out.println("Given number is a perfect number");
		}else {
			System.out.println("Given number is not a perfect number");
		}
	}

}
