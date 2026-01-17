package Practice.DataStructures.BitManupulationpractice;

public class GenerateAllPossibleSubSets {
		
	
	static void possibleSubSets(char[] a,int N) {
		
		for(int i=0;i<(1<<N);++i) {
			System.out.print("{");
			for(int j = 0;j < N;++j)
		   if((i&(1<<j))!=0) 
			   System.out.print(a[j]);
			
			System.out.println("}");
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		char[] A = {'a', 'b', 'c'};
		int n=A.length;
		possibleSubSets(A,n);
		
	}
}
