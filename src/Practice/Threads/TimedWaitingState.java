package Practice.Threads;

public class TimedWaitingState {

	
	/*
	 * A thread is in TIMED_WAITING state when it’s waiting for another thread to
	 * perform a particular action within a stipulated amount of time.
	 * 
	 * According to JavaDocs, there are five ways to put a thread on TIMED_WAITING
	 * state:
	 * 
	 * thread.sleep(long millis) wait(int timeout) or wait(int timeout, int nanos)
	 * thread.join(long millis) LockSupport.parkNanos LockSupport.parkUntil
	 */
	
	public static void main(String[] args) throws InterruptedException {
		DemoTimedWaitingState runnable=new DemoTimedWaitingState();
		Thread t1=new Thread(runnable);
		t1.start();
	    // The following sleep will give enough time for ThreadScheduler
        // to start processing of thread t1
        Thread.sleep(1000);
        System.out.println(t1.getState());

	}

}
