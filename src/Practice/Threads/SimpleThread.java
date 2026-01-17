package Practice.Threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import Practice.Threads.Concurrency.ExecuterService.ExecuterService;

public class SimpleThread extends Thread{
	private String message;
	private static Logger log=Logger.getGlobal();
	
	public SimpleThread(String message) {
		super();
		this.message = message;
	}
	@Override
	public void run() {
		log.info(message);
	}
public static void main(String[] args) throws InterruptedException, ExecutionException {
	Thread thread=new  SimpleThread("Simple thread running");
	thread.start();
	thread.join();
	ExecutorService  executorService=Executors.newFixedThreadPool(10);
	executorService.submit(new SimpleThread(
		      "SimpleThread executed using ExecutorService")).get();

}

}
