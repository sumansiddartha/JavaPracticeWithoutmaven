package Practice.Threads.Concurrency.countDownLatch;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable{

	   private List<String> outputScraper;
	    private CountDownLatch countDownLatch;
	
	
	public Worker(List<String> outputScraper, CountDownLatch countDownLatch) {
			super();
			this.outputScraper = outputScraper;
			this.countDownLatch = countDownLatch;
		}


	@Override
	public void run() {
		doSomeWork();
		outputScraper.add("Counted down");
		
		countDownLatch.countDown();
		
	}
	
	public void  doSomeWork() {
		System.out.println("This is some work");
		for(int i=0;i<200;i++) {
			System.out.println("I am here to print "+i);
		}
	}

}
