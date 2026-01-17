package Practice.Threads.Concurrency.countDownLatch;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class WaitingWorker implements Runnable{

	  private List<String> outputScraper;
	    private CountDownLatch readyThreadCounter;
	    private CountDownLatch callingThreadBlocker;
	    private CountDownLatch completedThreadCounter;
	    
	
	
	
	public WaitingWorker(List<String> outputScraper, CountDownLatch readyThreadCounter,
				CountDownLatch callingThreadBlocker, CountDownLatch completedThreadCounter) {
			super();
			this.outputScraper = outputScraper;
			this.readyThreadCounter = readyThreadCounter;
			this.callingThreadBlocker = callingThreadBlocker;
			this.completedThreadCounter = completedThreadCounter;
		}




	@Override
	public void run() {
//		if (true) {
//	        throw new RuntimeException("Oh dear, I'm a BrokenWorker");
//	    }
		readyThreadCounter.countDown();
		try {
			callingThreadBlocker.await();
			doSomeWork();
			outputScraper.add("Counted down");	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			completedThreadCounter.countDown();
		}
	
		
	}
	public void  doSomeWork() {
		System.out.println("This is some work");
		/*
		 * for(int i=0;i<200;i++) { System.out.println("I am here to print "+i); }
		 */
	}

}
