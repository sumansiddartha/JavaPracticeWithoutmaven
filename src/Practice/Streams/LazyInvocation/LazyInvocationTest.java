package Practice.Streams.LazyInvocation;

import java.lang.System.Logger;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LazyInvocationTest {
	private static java.util.logging.Logger log=java.util.logging.Logger.getLogger(LazyInvocationTest.class.getName());
//	5. Lazy Invocation
//	Intermediate operations are lazy. This means that they will be invoked only if it is necessary for the terminal operation execution.
private static long counter;
private static void wasCalled() {
	
	counter++;
}
	
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc1", "abc2", "abc3");
//		counter = 0;
//		As we have a source of three elements, we can assume that the filter() method will be called three times, and the value of the counter variable will be 3.
//		However, running this code doesn’t change counter at all, it is still zero, so the filter() method wasn’t even called once. 
//		The reason why is missing of the terminal operation.
		Stream<String> filter = list.stream().filter(element->{
			System.out.println("filter() was called");
			wasCalled();
			return element.contains("2");
		});
//		Let’s rewrite this code a little bit by adding a map() operation and a terminal operation, findFirst(). 
//		We will also add the ability to track the order of method calls with the help of logging:
		Optional<String> stream = list.stream().filter(element -> {
		    log.info("filter() was called");
		    return element.contains("2");
		}).map(element -> {
		    log.info("map() was called");
		    return element.toUpperCase();
		}).findFirst();
//		The resulting log shows that we called the filter() method twice and the map() method once. 
//		This is because the pipeline executes vertically. 
//		In our example, the first element of the stream didn’t satisfy the filter’s predicate.
//		Then we invoked the filter() method for the second element, which passed the filter.
//		Without calling the filter() for the third element, we went down through the pipeline to the map() method.
//		The findFirst() operation satisfies by just one element. So, in this particular example, the lazy invocation allowed us to avoid one method call for filter().
	
//==================================Order of Execution	
//		From the performance point of view, the right order is one of the most important aspects of chaining operations in the stream pipeline:
	
		long size = list.stream().map(element -> {
		    wasCalled();
		    return element.substring(0, 3);
		}).skip(2).count();
		
//		Execution of this code will increase the value of the counter by three. 
//		This means that we called the map() method of the stream three times, but the value of the size is one.
//		So the resulting stream has just one element, and we executed the expensive map() operations for no reason two out of the three times.
	
//		If we change the order of the skip() and the map() methods, the counter will increase by only one. So we will call the map() method only once:
		long size2 = list.stream().skip(2).map(element -> {
		    wasCalled();
		    return element.substring(0, 3);
		}).count();
		
//		This brings us to the following rule: intermediate operations which reduce the size of the stream should be placed before operations which are applying to each element.
//		So we need to keep methods such as 
//		skip(), filter(), and distinct() at the top of our stream pipeline.
	}
}
