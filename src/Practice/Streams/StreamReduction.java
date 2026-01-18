package Practice.Streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduction {
	private static final Logger log=Logger.getLogger(StreamReduction.class.getName());
	public static void main(String[] args) {
//		The API has many terminal operations which aggregate a stream to a type or to a primitive: 
//		count(), max(), min(), and sum().
//		However, these operations work according to the predefined implementation. So what if a developer needs to customize a Stream’s reduction mechanism? 
//				There are two methods which allow us to do this, the reduce() and the collect() methods
		
//		There are three variations of this method, which differ by their signatures and returning types.
	
		
//		identity – the initial value for an accumulator, or a default value if a stream is empty and there is nothing to accumulate
//
//		accumulator – a function which specifies the logic of the aggregation of elements. As the accumulator creates a new value for every step of reducing, the quantity of new values equals the stream’s size and only the last value is useful. This is not very good for the performance.
//
//		combiner – a function which aggregates the results of the accumulator. We only call combiner in a parallel mode to reduce the results of accumulators from different threads.
		OptionalInt reduced =
				  IntStream.range(1, 4).reduce((a, b) -> a + b);
		System.out.println(reduced);
		int reducedTwoParams =
				  IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
		System.out.println(reducedTwoParams);
		int reducedParams = Stream.of(1, 2, 3)
				  .reduce(10, (a, b) -> a + b, (a, b) -> {
				     log.info("combiner was called");
				     return a + b;
				  });
//		The result will be the same as in the previous example (16), and there will be no login, which means that combiner wasn’t called. To make a combiner work, a stream should be parallel:
	System.out.println(reducedParams);
	int reducedParallel = Stream.of(1, 2, 3).parallel()
			  .reduce(10, (a, b) -> a + b, (a, b) -> {
			     log.info("combiner was called");
			     return a + b;
			  });
	System.out.println(reducedParallel);
	
	int reducedParallel2 = Arrays.asList(1, 2, 3).parallelStream()
		    .reduce(10, (a, b) -> a + b, (a, b) -> {
		       log.info("combiner was called ss");
		       return a + b;
		    });
		System.out.println(reducedParallel2);
//	The result here is different (36), and the combiner was called twice. 
//		Here the reduction works by the following algorithm: the accumulator ran three times by adding every element of the stream to identity. These actions are being done in parallel. 
//		As a result, they have (10 + 1 = 11; 10 + 2 = 12; 10 + 3 = 13;). Now combiner can merge these three results. It needs two iterations for that (12 + 13 = 25; 25 + 11 = 36)
	}

}
