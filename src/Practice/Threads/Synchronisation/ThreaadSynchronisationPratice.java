package Practice.Threads.Synchronisation;

public class ThreaadSynchronisationPratice {
//	Synchronization in Java is the capability to control
//	the access of multiple threads to any shared resource.
	public static void main(String[] args) {
		
//		The synchronization is mainly used to
//
//		To prevent thread interference.
//		To prevent consistency problem
		
		
//		Types of synchronisation
//		1. Process Synchronisation
//		2.ThreadSynchronisation
		
		
		
//		Thread Synchronisation
//		Mutually exclusive
		
		Table1 tab=new Table1();
		Thread1 t1=new Thread1(tab);
		Thread2 t2=new Thread2(tab);
		t1.start();
		t2.start();
		
		
		
	}

}
