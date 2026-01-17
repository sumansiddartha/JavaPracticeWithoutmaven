package Practice.Streams.LazyInvocation;

import java.lang.System.Logger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyInvocationTest {

private static long counter;
private static void wasCalled() {
	counter++;
}
	
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc1", "abc2", "abc3");
		counter = 0;
		Stream<String> filter = list.stream().filter(element->{
			System.out.println("filter() was called");
			wasCalled();
			return element.contains("2");
		});
	}
}
