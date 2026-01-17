package Practice.Collections.queue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;




public class ProducerWithNoConsumerTest {
	
	public static void main(String[] args) throws InterruptedException {
//		given
		TransferQueue<String> transferQueue=new LinkedTransferQueue<>();
		ExecutorService exService=Executors.newFixedThreadPool(2);
		
		Producer producer=new Producer(transferQueue, "1", 3);
//		withconsumer
		Consumer consumer=new Consumer(transferQueue, "1", 3);
		
		exService.execute(producer);
		exService.execute(consumer);
		
		exService.awaitTermination(5000, TimeUnit.MILLISECONDS);
		exService.shutdown();
		System.out.println(producer.noOfProducedMessages.intValue());
		System.out.println(consumer.noOfConsumedMessages.intValue());
	}

}
