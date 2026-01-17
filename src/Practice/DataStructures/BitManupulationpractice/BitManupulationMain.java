package Practice.DataStructures.BitManupulationpractice;

public class BitManupulationMain {
	
	
	static boolean isPowerOfTwo(int n) {
		if(n==0)
			return false;
		else 
			while(n%2==0) n/=2;
			return n==1;
	}
	
	static boolean isPowerOfTwoUsingXandXminus1(int x) {
		System.out.println("This is a check=="+(x&(x-1)));
		
		return false;
	}

	public static void main(String[] args) {
		isPowerOfTwoUsingXandXminus1(6);
		System.out.println("Checking x power:::"+isPowerOfTwo(8));
		int a=20;
		int b=15;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("This is a :::"+a);
		System.out.println("This is b :::"+b);
	}
	
	
}
