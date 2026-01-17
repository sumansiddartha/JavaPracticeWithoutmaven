




package Practice.Threads.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



public class ExecuterServiceExample {
//	ExecutorService is a complete solution for asynchronous processing
//	It manages an in-memory queue and schedules submitted tasks based on thread availability.
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.submit(()->{
			   System.out.println("Task 1 is running by " + Thread.currentThread().getName());
	            try {
	                Thread.sleep(2000); // Simulating a task that takes some time
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
		});
		executorService.submit(()->{
			System.out.println("Task 2 is running by " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000); // Simulating a task that takes some time
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		});
		
		executorService.submit(()->{
			System.out.println("Task 3 is running by "+Thread.currentThread().getName());
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			Thread.currentThread().interrupt();
		}
		
		});
		
		//executorService.shutdown();
		//executorService.shutdownNow();
		executorService.awaitTermination( 20l, TimeUnit.NANOSECONDS );
		
	}

}
