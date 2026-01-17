package Practice.Threads.Volitile;

public class VolitileCheckMain {
//	The compiler, runtime, or processors may apply all sorts of optimizations.
	
//	Although these optimizations are usually beneficial, typically without necessary synchronizations, they can cause subtle issues in the form of unexpected results.
	
//	Caching and reordering are few of the optimizations that may surprise us
//	Java and the JVM provide many ways to control memory order, and a volatile field is one of them.
//	as CPUs can carry many instructions per second, fetching from RAM isn’t ideal for them. 
//	To improve this situation, processors use tricks like Out of Order Execution, Branch Prediction, Speculative Execution, and Caching.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
