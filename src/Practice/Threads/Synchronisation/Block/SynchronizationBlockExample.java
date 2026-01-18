package Practice.Threads.Synchronisation.Block;

public class SynchronizationBlockExample {

//	Synchronized block can be used to perform synchronization 
//	on any specific resource of the method.

//	Suppose we have 50 lines of code in our method, but we want to 
//	synchronize only 5 lines, in such cases, we can use synchronized block.

	/**Points to Remember*/
//	Synchronized block is used to lock an object for any shared resource.
//	Scope of synchronized block is smaller than the method.
//	A Java synchronized block doesn't allow more 
//	than one JVM, to provide access control to a shared resource
//	The system performance may degrade because of the slower working of synchronized keyword.
//	Java synchronized block is more efficient than Java synchronized method.
	public static void main(String[] args) {
		
		
		Table1 t=new Table1();
		Thread1 th1=new Thread1(t);
		Thread2 th2=new Thread2(t);
		th1.start();
		th2.start();
	}
	
	
	
	
	
}
