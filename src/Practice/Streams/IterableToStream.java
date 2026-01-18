package Practice.Streams;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IterableToStream {

	public static void main(String[] args) {
//		StreamSupport.stream()
		
		Iterable<String> iterable 
		  = Arrays.asList("Testing", "Iterable", "conversion", "to", "Stream");
		//converting iterable instance to a stream
		Stream<String> stream = StreamSupport.stream(iterable.spliterator(), false);
//		second param in StreamSupport.stream() determines if the resulting Stream 
//		should be parallel or sequential.
//		You should set it true, for a parallel Stream
		stream.map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);;
		
		String xyx="snsnskkssdkdsknkndssnkdsmdsmdsa";
		Map<Character, Long> collect = xyx.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		collect.forEach((k,v)->System.out.println(k+""+v));
		
	}

}
