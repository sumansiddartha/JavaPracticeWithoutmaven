package Practice.Collections.queue;

import java.util.concurrent.TransferQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Consumer implements Runnable{

	private TransferQueue<String> transferQueue;
	private String name;
	private Integer noOfMessagesToConsume;
	public AtomicInteger noOfConsumedMessages=new AtomicInteger();
	
	
	@Override
	public void run() {
		for (int i = 0; i < noOfMessagesToConsume; i++) {
			
			try {
				String element=transferQueue.take();
				longProcessing(element);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
	}
private void longProcessing(String element) throws InterruptedException{
	noOfConsumedMessages.incrementAndGet();
	Thread.sleep(500);
}
public Consumer(TransferQueue<String> transferQueue, String name, Integer noOfMessagesToConsume) {
	super();
	this.transferQueue = transferQueue;
	this.name = name;
	this.noOfMessagesToConsume = noOfMessagesToConsume;
}
public Consumer() {
	super();
	// TODO Auto-generated constructor stub
}


}
