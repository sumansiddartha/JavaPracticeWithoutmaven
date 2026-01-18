package Practice.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamReduction2 {

	public static void main(String[] args) {
//		7.2. The collect() Method
//		The reduction of a stream can also be executed by another terminal operation, the collect() method.
//		It accepts an argument of the type Collector, which specifies the mechanism of reduction
//		There are already created, predefined collectors for most common operations.
		List<Product> productList=Arrays.asList(new Product(23, "potatoes"),
				  new Product(14, "orange"), new Product(13, "lemon"),
				  new Product(23, "bread"), new Product(13, "sugar"));
//		Converting a stream to the Collection (Collection, List or Set):
		List<String> collectorCollection = 
				  productList.stream().map(Product::getName).collect(Collectors.toList());
		collectorCollection.stream().forEach(System.out::println);
//		Reducing to String:
		String listToString = productList.stream().map(Product::getName).collect(Collectors.joining(",","[","]"));
		System.out.println(listToString);
//		The joining() method can have from one to three parameters (delimiter, prefix, suffix).
//		The most convenient thing about using joining() is that the developer doesn’t need to check if the stream reaches its end to apply the suffix and not to apply a delimiter. Collector will take care of that.

		//		Processing the average value of all numeric elements of the stream:	
		double averagePrice=productList.stream().collect(Collectors.averagingInt(Product::getPrice));
		System.out.println(averagePrice);
//		Processing the sum of all numeric elements of the stream:
		double summingPrice=productList.stream().collect(Collectors.summingDouble(Product::getPrice));
		System.out.println(summingPrice);
//		The methods averagingXX(), summingXX() and summarizingXX() can work with primitives (int, long, double)
//		One more powerful feature of these methods is providing the mapping. As a result, the developer doesn’t need to use an additional map() operation before the collect() method.

		IntSummaryStatistics statistics = productList.stream()
				  .collect(Collectors.summarizingInt(Product::getPrice));
		System.out.println(statistics.toString());
//		By using the resulting instance of type IntSummaryStatistics, the developer can create a statistical report by applying the toString() method. The result will be a String common to this one “IntSummaryStatistics{count=5, sum=86, min=13, average=17,200000, max=23}.”
	
//		It is also easy to extract from this object separate values for count, sum, min, average, and max by applying the methods getCount(), getSum(), getMin(), getAverage(), and getMax(). All of these values can be extracted from a single pipeline.
		long count = statistics.getCount();
		System.out.println(count);
		
//		Grouping of stream’s elements according to the specified function:
		Map<Integer, List<Product>> collectorMapOfLists  = productList.stream().collect(Collectors.groupingBy(Product::getPrice));
		System.out.println(collectorMapOfLists);
//		Dividing stream’s elements into groups according to some predicate:
		Map<Boolean, List<Product>> mapPartioned  = productList.stream().collect(Collectors.partitioningBy(element->element.getPrice()>15));
		System.out.println(mapPartioned);
		
//		Pushing the collector to perform additional transformation:
		Set<Product> unmodifiableSet  = productList.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));
//		
//		Custom collector:
//
//			If for some reason a custom collector should be created, the easiest and least verbose way of doing so is to use the method of() of the type Collector.
		Collector<Product,?,LinkedList<Product>> toLinkedList=Collector.of(LinkedList::new, LinkedList::add,
				(first,second)->{
			first.addAll(second);
			return first;
		});
		LinkedList<Product> linkedListOfPersons =
				  productList.stream().collect(toLinkedList);
//		in this example, an instance of the Collector got reduced to the LinkedList<Persone>.
		
	}

}
