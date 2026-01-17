package Practice.Threads.Synchronisation.InterThreadCommunication;

public class InterThreadCommunicationTest {

//	InterThread Communication allows synchronised threads to communicate
//	with each other
	
//	It has three methods
//	wait()
//	notify()
//	notifyAll()
	public static void main(String[] args) {
	
//		wait(): causes the current thread to relese the lock and wait until either another
//		thread invokes notify() notifyAll() 
		
//		notify():wakes up a single thread that is waiting on this object's monitor.
		
//	 notifyAll():wakes up all threads that are waiting on this object's monitor
		
		final Customer c=new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
		
		
	}
}
