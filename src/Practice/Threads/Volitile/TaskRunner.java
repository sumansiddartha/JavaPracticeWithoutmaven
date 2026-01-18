package Practice.Threads.Volitile;

public class TaskRunner {
	 private static int number;
	    private static boolean ready;
//	    Cache Coherence Challenges
		/*
		 * The TaskRunner class maintains two simple variables. Its main method creates
		 * another thread that spins on the ready variable as long as it’s false. When
		 * the variable becomes true, the thread prints the number variable.
		 */
	    
	    public static class Reader extends Thread{
	    	@Override
	        public void run() {
	            while (!ready) {
	                Thread.yield();
	            }

	            System.out.println(number);
	        }
	    }
	    public static void main(String[] args) throws InterruptedException {
	    	new Reader().start();
	    	Thread.sleep(1000);
	        number = 42;
	        ready = true;
		}
		/*
		 * Many may expect this program to print 42 after a short delay; however, the
		 * delay may be much longer. It may even hang forever or print zero.
		 * 
		 * The cause of these anomalies is the lack of proper memory visibility and
		 * reordering. Let’s evaluate them in more detail.
		 */
	    
	    
	    
	    
}
