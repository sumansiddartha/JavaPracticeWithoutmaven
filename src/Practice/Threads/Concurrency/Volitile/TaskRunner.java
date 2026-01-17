package Practice.Threads.Concurrency.Volitile;

public class TaskRunner {
	 private volatile static int number;
	    private volatile static boolean ready;

	    private static class Reader extends Thread {

	        @Override
	        public void run() {
	            while (!ready) {
	            	try {
						Thread.sleep(100000000000000000l);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                Thread.yield();
	            }

	            System.out.println(number);
	        }
	    }

	    public static void main(String[] args) {
	        new Reader().start();
	        number = 42;
	        ready = true;
	    }

}
