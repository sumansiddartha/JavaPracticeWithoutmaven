package Practice.Streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamsDetailed {
public static void main(String[] args) {
//	By default, any stream operation in Java is processed sequentially, unless explicitly specified as parallel.
	
//	Sequential streams use a single thread to process the pipeline:
	List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
	listOfNumbers.stream().forEach(number->System.out.println(number+" "+Thread.currentThread().getName()));
//	 Parallel Streams
//	Any stream in Java can easily be transformed from sequential to parallel.
//
//	We can achieve this by adding the parallel method to a sequential stream or by creating a stream using the parallelStream method of a collection:
	System.out.println("===============>running parallel=====>");
	listOfNumbers.parallelStream().forEach(number ->
	    System.out.println(number + " " + Thread.currentThread().getName())
	);
//	Parallel streams enable us to execute code in parallel on separate cores. The final result is the combination of each individual outcome.
//	However, the order of execution is out of our control. It may change every time we run the program:

	//	Fork-Join Framework
//	Parallel streams make use of the fork-join framework and its common pool of worker threads
//	The fork-join framework was added to java.util.concurrent in Java 7 to ==============>handle task management between multiple threads
	
//	3.1. Splitting Source
//	The fork-join framework is in charge of splitting the source data between worker threads and handling callback on task completion.
//	Let’s take a look at an example of calculating a sum of integers in parallel.
//	We’ll make use of the reduce method and add five to the starting sum, instead of starting from zero:
	int sum = listOfNumbers.parallelStream().reduce(5, Integer::sum);
	System.out.println(sum);
	//=====>thread1===>5+1+2
	//=====>thread2===>5+3+4
	//in sequential the ans id 15
	// But since the reduce operation is handled in parallel, the number five actually gets added up in every worker thread:
//	The actual result might differ depending on the number of threads used in the common fork-join pool.
//	In order to fix this issue, the number five should be added outside of the parallel stream:
	int sum2 = listOfNumbers.parallelStream().reduce(0, Integer::sum) + 5;
	System.out.println(sum2);

}
}
