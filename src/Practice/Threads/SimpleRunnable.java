package Practice.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class SimpleRunnable implements Runnable{

	private String message;
	private static Logger log=Logger.getGlobal();
	
	public SimpleRunnable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SimpleRunnable(String message) {
		super();
		this.message = message;
	}
	@Override
	public void run() {
		log.info(message);
		
	}
public static void main(String[] args) throws Exception {
	Thread thread=new Thread(new SimpleRunnable("This is an Simple Runnable"));
	
	thread.start();
	thread.join();
	ExecutorService exec=Executors.newFixedThreadPool(1000);
	exec.submit(new SimpleRunnable("Sample runnable executed using ExecutorService")).get();
}
}
