package Practice.DataStructures.BitManupulationpractice;

public class CountNumberofOnesInBinaryRepresentation {

	static int count_one(int n) {
		int count=0;
		while(n!=0) {
			  n = n&(n-1);
              count++;
			
		}
		return count;
	}
	
//	Check if the ith bit is set in the binary form of the given number.
	static boolean check(int N,int i) {
//		if(N&(1<<i)) {
//			
//		}
		System.out.println("----"+(N&(1<<i)));
		
		
		
		
		return false;
	}
	
	public static void main(String[] args) {
		check(20,2);
		System.out.println("====="+count_one(20));
		
	}
}
