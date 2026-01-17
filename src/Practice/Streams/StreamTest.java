package Practice.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> streamArray = Arrays.stream(arr);
		Stream.of(arr).forEach(System.out::println);;
		streamArray.forEach(System.out::println);
//				Stream<String> stringArray =  Stream.<String>builder().add("a").add("b").add("c").build();
//System.out.println(stringArray);
		List<String> list = Arrays.asList("abc1", "abc2", "abc3");
		list.stream().map(element -> element)
		.skip(1)
		.collect(Collectors.toList()).forEach(System.out::println);
		long size = list.stream().skip(1)
		  .map(element -> element.substring(0, 3))
		  .sorted().count();
		System.out.println(size);
		
		Stream<String> stream = list.stream().filter(element -> {
			wasCalled();
			return element.contains("2");
		});
		stream.forEach(System.out::println);
		
		
		
		List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
				  new Product(14, "orange"), new Product(13, "lemon"),
				  new Product(23, "bread"), new Product(13, "sugar"));
		
				  productList.stream().map(Product::getName).collect(Collectors.toList()).forEach(System.out::println);
	
				  String listToString = productList.stream().map(Product::getName)
						  .collect(Collectors.joining(", ", "[", "]"));
				  System.out.println(listToString);
				  //summing the price
				  Integer collect = productList.stream().collect(Collectors.summingInt(Product::getPrice));	
				   Double collect2 = productList.stream().collect(Collectors.averagingInt(Product::getPrice));	
				  Map<Integer, List<Product>> groupby = productList.stream()
						  									.collect(Collectors.groupingBy(Product::getPrice));	
				  System.out.println(collect2);
				  System.out.println(groupby);
				  Map<Boolean, List<Product>> mapPartioned = productList.stream()
						  .collect(Collectors.partitioningBy(element -> element.getPrice() > 15));
				  System.out.println(mapPartioned);
				  
				  Set<Product> unmodifiableSet = productList.stream()
						  .collect(Collectors.collectingAndThen(Collectors.toSet(),
						  Collections::unmodifiableSet));
				  //custom collectors
				  Collector<Product, ?, LinkedList<Product>> toLinkedList =
						  Collector.of(LinkedList::new, LinkedList::add, 
						    (first, second) -> { 
						       first.addAll(second); 
						       return first; 
						    });
				  LinkedList<Product> linkedListOfPersons =
						  productList.stream().collect(toLinkedList);
				  linkedListOfPersons.forEach(System.out::println);
				  
				  
//				  Parallel Streams
				  
				  Stream<Product> streamOfCollection = productList.parallelStream();
				  boolean isParallel = streamOfCollection.isParallel();
				  boolean bigPrice = streamOfCollection
						  .map(product -> product.getPrice() * 12)
						  .anyMatch(price -> price > 200);
				  
				  
//if the source of a stream is something other than a Collection or an array, 
//				  the parallel() method should be used
				  IntStream intStreamParallel = IntStream.range(1, 150).parallel();
				  boolean isParallel1 = intStreamParallel.isParallel();
				  
	}
private static long counter;
	private static void wasCalled() {
		counter++;
		
	}
}
