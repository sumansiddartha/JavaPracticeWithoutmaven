package Practice.Threads.Concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureExample {
	
	
	//create a future instance:
	/*
	 * Future is used to represent the result of an asynchronous operation. It comes
	 * with methods for checking if the asynchronous operation is completed or not,
	 * getting the computed result, etc.
	 */
	
	
	public static void main(String[] args) {
		
		ExecutorService executorService=Executors.newFixedThreadPool(10);
		Future<String> future=executorService.submit(()->{
			Thread.sleep(10000l);
	        return "Hello world";
		});
		if(future.isDone()&&!future.isCancelled()) {
			try {
				String str = future.get();
				System.out.println("Task completed with result: " + str);
			} catch (InterruptedException | ExecutionException e) {
				System.out.println("This is the error for the exception :::");
				e.printStackTrace();
			}
		}
		try {
		    String result = future.get(10, TimeUnit.SECONDS);
		    System.out.println("Task completed with result in 10 sec: " + result);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			System.out.println("This is the error for the exception after 10sec :::");
		    e.printStackTrace();
		}
		
	}

}
