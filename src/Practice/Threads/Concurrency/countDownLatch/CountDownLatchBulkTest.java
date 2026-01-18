package Practice.Threads.Concurrency.countDownLatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDownLatchBulkTest {
public static void main(String[] args) throws InterruptedException {
	List<String> outScaper=Collections.synchronizedList(new ArrayList<>());
	CountDownLatch readyThreadCounter=new CountDownLatch(5);
	CountDownLatch callingThreadbBlocker=new CountDownLatch(1);
	CountDownLatch completedThreadCounter=new CountDownLatch(4);
	
	List<Thread> workers = Stream
	.generate(()->new Thread(new WaitingWorker(outScaper, readyThreadCounter, callingThreadbBlocker, completedThreadCounter)))
	.limit(5).collect(Collectors.toList());
	workers.forEach(Thread::start);
	readyThreadCounter.await();
	outScaper.add("Worker Ready");
	callingThreadbBlocker.countDown();
	completedThreadCounter.await();
	outScaper.add("Workers Completed");
	System.out.println("------------------------------------------------------");
	System.out.println(outScaper);
}
}
;