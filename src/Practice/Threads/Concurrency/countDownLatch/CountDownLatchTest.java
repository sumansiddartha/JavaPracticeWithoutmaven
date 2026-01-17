package Practice.Threads.Concurrency.countDownLatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDownLatchTest {
public static void main(String[] args) throws InterruptedException {
	List<String> outputScraper  = Collections.synchronizedList(new ArrayList<>());
	CountDownLatch countDownLatchList=new CountDownLatch(5);
	List<Thread> workers = Stream.
	generate(()->new Thread(new Worker(outputScraper, countDownLatchList)))
	.limit(5)
	.collect(Collectors.toList());
	workers.forEach(Thread::start);
	 countDownLatchList.await(); 
	outputScraper.add("latch released");
	System.out.println(outputScraper);
}
}
