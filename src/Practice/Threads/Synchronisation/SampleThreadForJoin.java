package Practice.Threads.Synchronisation;


import java.util.logging.Logger;
public class SampleThreadForJoin extends Thread{
	private static Logger logger=Logger.getGlobal();
	 public int processingCount = 0;

	public SampleThreadForJoin(int processingCount) {
		super();
		this.processingCount = processingCount;
	logger.info("Thread Created 2"+processingCount);
	}
	 
	   @Override
	    public void run() {
		   logger.info("Thread " + this.getName() + " started");
	        while (processingCount > 0) {
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	            	logger.info("Thread " + this.getName() + " interrupted");
	            }
	            processingCount--;
	            logger.info("Inside Thread " + this.getName() + ", processingCount = " + processingCount);
	        }
	        logger.info("Thread " + this.getName() + " exiting");
	   }
	
}
