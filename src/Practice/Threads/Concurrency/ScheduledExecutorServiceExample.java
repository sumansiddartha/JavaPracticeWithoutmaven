package Practice.Threads.Concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
public static void main(String[] args) {
	/*
	 * Executor and ExecutorService‘s methods are scheduled on the spot without
	 * introducing any artificial delay. Zero or any negative value signifies that
	 * the request needs to be executed instantly.
	 */
	ScheduledExecutorService executorService=Executors.newScheduledThreadPool(2);
	
	Runnable delayedTask=()->{
		System.out.println("Delayed Task executed at " + System.currentTimeMillis());
	};
	executorService.schedule(delayedTask, 2, TimeUnit.SECONDS);
	   // Task to run periodically with a fixed rate (every 3 seconds)
    Runnable periodicTask = () -> {
        System.out.println("Periodic Task executed at " + System.currentTimeMillis());
    };
    // Schedule the task to run every 3 seconds, starting immediately
    executorService.scheduleAtFixedRate(periodicTask, 0, 3, TimeUnit.SECONDS);

    // Task to run periodically with a fixed delay (every 3 seconds after completion)
    Runnable fixedDelayTask = () -> {
        System.out.println("Fixed Delay Task executed at " + System.currentTimeMillis());
    };
    
    executorService.scheduleWithFixedDelay(fixedDelayTask, 0, 3, TimeUnit.SECONDS);

    // Shutdown the ScheduledExecutorService after some time
    try {
        // Let the tasks run for 10 seconds before shutting down
        Thread.sleep(10000);
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }

    // Shutdown the executor service gracefully
    executorService.shutdown();
}
}

