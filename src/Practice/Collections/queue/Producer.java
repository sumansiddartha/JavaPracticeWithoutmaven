package Practice.Collections.queue;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable{
	private TransferQueue<String> transferqueue;
	private String name;
	private Integer noOfMessagesToProduce;
	public AtomicInteger noOfProducedMessages=new AtomicInteger();
	

	@Override
	public void run() {
		
		
		for(int i=0;i<noOfMessagesToProduce;i++) {
			try {
				boolean added=transferqueue.tryTransfer("A"+i, 4000, TimeUnit.MILLISECONDS);
				if(added) {
					noOfProducedMessages.incrementAndGet();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}


	public Producer(TransferQueue<String> transferqueue, String name, Integer noOfMessagesToProduce,
			AtomicInteger noOfProducedMessages) {
		super();
		this.transferqueue = transferqueue;
		this.name = name;
		this.noOfMessagesToProduce = noOfMessagesToProduce;
		this.noOfProducedMessages = noOfProducedMessages;
	}


	public Producer(TransferQueue<String> transferqueue, String name, Integer noOfMessagesToProduce) {
		super();
		this.transferqueue = transferqueue;
		this.name = name;
		this.noOfMessagesToProduce = noOfMessagesToProduce;
	}


	public Producer() {
		super();
	
	}
	

}
