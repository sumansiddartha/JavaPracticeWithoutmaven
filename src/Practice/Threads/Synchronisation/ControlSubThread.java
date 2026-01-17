package Practice.Threads.Synchronisation;

import java.util.concurrent.atomic.AtomicBoolean;

public class ControlSubThread implements Runnable {
//Thread stopping
	
	  private Thread worker;
	    private final AtomicBoolean running = new AtomicBoolean(false);
	    private final AtomicBoolean stopped = new AtomicBoolean(true);
	    private int interval;
	
	    public void interrupt() {
	        running.set(false);
	        worker.interrupt();
	    }

	    boolean isRunning() {
	        return running.get();
	    }

	    boolean isStopped() {
	        return stopped.get();
	    }

	public ControlSubThread(int sleepinterval) {
			super();
			this.interval = sleepinterval;
		}
	 public void start() {
	        worker = new Thread(this);
	        worker.start();
	    }
	 
	 public void stop() {
	        running.set(false);
	    }

	@Override
	public void run() {
		running.set(true);
		stopped.set(false);
		while (running.get()) {
            try { 
            	System.out.println("Thread currently going to sleep");
                Thread.sleep(interval); 
            } catch (InterruptedException e){ 
                Thread.currentThread().interrupt();
                System.out.println(
                  "Thread was interrupted, Failed to complete operation");
            }
            // do something here 
         } 
			/*
			 * Rather than having a while loop evaluating a constant true, we’re using an
			 * AtomicBoolean and now we can start/stop execution by setting it to
			 * true/false.
			 * 
			 * As explained in our introduction to Atomic Variables, using an AtomicBoolean
			 * prevents conflicts in setting and checking the variable from different
			 * threads
			 */
	}
	
	
	
	
	/*
	 * What happens when sleep() is set to a long interval, or if we’re waiting for
	 * a lock that might never be released?
	 * 
	 * We face the risk of blocking for a long period or never terminating cleanly.
	 * 
	 * We can create the interrupt() for these situations, let’s add a few methods
	 * and a new flag to the class:
	 */
}
