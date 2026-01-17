package Practice.Threads.Synchronisation;

public class JoiningPracticeMain {
	/*
	 * When we invoke the join() method on a thread, the calling thread goes into a
	 * waiting state. It remains in a waiting state until the referenced thread
	 * terminates.
	 */
	
public static void main(String[] args) throws InterruptedException {
	Thread t1=new SampleThreadForJoin(1);
	System.out.println("Thread started");
	t1.start();
	System.out.println("Thread started join");
	t1.join();
	System.out.println("Thread started join end");
}
}
