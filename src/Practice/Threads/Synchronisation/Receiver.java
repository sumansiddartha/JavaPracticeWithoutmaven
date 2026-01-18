package Practice.Threads.Synchronisation;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable{
	private Data load;

	public Receiver(Data load) {
		super();
		this.load = load;
	}

	public Receiver() {
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
		for(String loadReceive=load.receive();!"End".equals(loadReceive);loadReceive=load.receive()) {
			System.out.println(loadReceive);
			//Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                System.err.println("Thread Interrupted"); 
            }
		}
		
	}
	
}
