package Practice.Threads.Synchronisation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import Practice.Threads.Concurrency.ExecuterService.ExecuterService;

public class SynchronisedMethodsTest {

	public static void main(String[] args) throws InterruptedException {
	
		ExecutorService service=Executors.newFixedThreadPool(3);
		SynchronisedMethods summation=new SynchronisedMethods();
		//synchronizedBlocks synchronizedBlocks = new SynchronizedBlocks();
		IntStream.range(0, 1000).forEach(count->service.submit(summation::calculate));
		service.awaitTermination(1000, TimeUnit.MILLISECONDS);
System.out.println(summation.getSum());
Object lock = new Object();
synchronized (lock) {
    System.out.println("First time acquiring it");

    synchronized (lock) {
        System.out.println("Entering again");

         synchronized (lock) {
             System.out.println("And again");
         }
    }
}
//IntStream.range(0, 1000)
//.forEach(count -> 
//  service.submit(synchronizedBlocks::performSynchronisedTask));




	}
	

}
