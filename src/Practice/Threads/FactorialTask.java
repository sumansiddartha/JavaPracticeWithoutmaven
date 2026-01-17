package Practice.Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialTask implements Callable<Integer> {
	int number;
	
	
	public FactorialTask(int number) {
		super();
		this.number = number;
	}


	@Override
	public Integer call() throws Exception {
		
		 int fact = 1;
	        // ...
	        for(int count = number; count > 1; count--) {
	            fact = fact * count;
	        }

	        return fact;
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FactorialTask task = new FactorialTask(5);
		ExecutorService executorService=Executors.newFixedThreadPool(1000);
		Future<Integer> future = executorService.submit(task);
		System.out.println(future.get().intValue());
	}

}
