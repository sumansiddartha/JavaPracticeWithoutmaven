package Practice.Threads.Synchronisation;

public class Data {
private String packet;
private boolean transfer=true;

/*
 * The Sender is supposed to send a data packet to the Receiver. The Receiver
 * cannot process the data packet until the Sender finishes sending it.
 * Similarly, the Sender shouldn’t attempt to send another packet unless the
 * Receiver has already processed the previous packet.
 */

public synchronized  void Send(String packet) {
	while(!transfer) {
		 try { 
             wait();
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt(); 
             System.err.println("Thread Interrupted");
         }
	}
	transfer=false;
	this.packet=packet;
}

public synchronized String receive() {
	while(transfer) {
		try {
			wait();
		} catch (Exception e) {
			Thread.currentThread().interrupt();
			System.err.println("Thread Interrupted");
		}
	}
	transfer=true;
	String returnPacket=packet;
	/*
	 * notifyAll() to wake up other threads to specify that a significant event has
	 * occurred and they can check if they can continue execution.
	 */
	notifyAll();
	return returnPacket;
}
}
