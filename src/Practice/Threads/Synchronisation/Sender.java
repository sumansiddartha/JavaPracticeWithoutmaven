package Practice.Threads.Synchronisation;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable{
	private Data data;
	
	
	
	public Sender(Data data) {
		super();
		this.data = data;
	}



	public Sender() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * We’re creating some random data packets that will be sent across the network
	 * in packets[] array. For each packet, we’re merely calling send(). Then we’re
	 * calling Thread.sleep() with random interval to mimic heavy server-side
	 * processing.
	 */

	@Override
	public void run() {
		
		String packets[] = {
		          "First packet",
		          "Second packet",
		          "Third packet",
		          "Fourth packet",
		          "End"
		        };
		
		
		 for (String packet : packets) {
	            data.Send(packet);

	            // Thread.sleep() to mimic heavy server-side processing
	            try {
	                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt(); 
	                System.err.println("Thread Interrupted"); 
	            }
	        
	}

}
}
