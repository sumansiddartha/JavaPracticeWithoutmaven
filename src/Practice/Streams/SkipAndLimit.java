package Practice.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SkipAndLimit {
	public static long counter=0;
	public static void wasCalled() {
		counter++;
		System.out.println("printig counter==="+counter);
	}
	
	public static void main(String[] args) {
//		we say that skip() is a stateful operation.
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	    .filter(i -> i % 2 == 0)
	    .skip(2)
	    .forEach(i -> System.out.print(i + " "));

		System.out.println("\n");
		
//		we say that limit() is a short-circuiting operation.
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
		.filter(i -> i % 2 == 0)
		.limit(2)
		.forEach(i -> System.out.print(i + " "));
		
//		Combining skip() and limit()
		
		List<String> givenList = Arrays.asList("a", "bb2", "ccc", "dd");
		
		long size=givenList.stream().skip(2).map(ele->{
			System.out.println("I am executing here");
			wasCalled();
			return ele.substring(0,3);
		}).count();
		System.out.println("size:::::::::"+size);
		System.out.println("count:::::::::"+counter);
		
		
		Map<String, Integer> result = givenList.stream()
				  .collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println("result::::::::"+result);
		Optional<String> result2 = givenList.stream()
				  .collect(Collectors.maxBy(Comparator.naturalOrder()));
		System.out.println(result2);
		Map<Integer, Set<String>> result3 = givenList.stream()
				  	.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
	System.out.println(result3);
	
	Map<Boolean, List<String>> result4 = givenList.stream()
			  .collect(Collectors.partitioningBy(s -> s.length() > 2));
	System.out.println(result4);
	
	
//	Collectors.teeing()
	List<Integer> numbers = Arrays.asList(42, 4, 2, 24);
	Optional<Integer> min = numbers.stream().collect(Collectors.minBy(Integer::compareTo));
	Optional<Integer> max = numbers.stream().collect(Collectors.maxBy(Integer::compareTo));
	// do something useful with min and max
//	numbers.stream().collect(teeing(
//			  minBy(Integer::compareTo), // The first collector
//			  maxBy(Integer::compareTo), // The second collector
//			  (min, max) -> // Receives the result from those collectors and combines them
//			));
	
	}
	

}
