package Practice.Maths.NumberTheory;

public class ModularExponentation {
//	x^n
	
	static int recursivePower(int x,int n) {
		if(n==0)
			return 1;
		return x*recursivePower(x,n-1);
	}
	
	
	public static void main(String[] args) {
		System.out.println(recursivePower(3,10));
	}
}
