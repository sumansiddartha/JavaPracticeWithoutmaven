package Practice.FunctionalInterfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunctionalInterfaceMain {
public static void main(String[] args) {
	int[] fibs = {0, 1};
	
	//supplier example
	Stream<Integer> fibonacci=Stream.generate(()->{
		
		int result = fibs[1];
	    int fib3 = fibs[0] + fibs[1];
	    fibs[0] = fibs[1];
	    fibs[1] = fib3;
	    return result;
	});
	
	
//	Notice that to be useful as a generator, the Supplier usually needs some sort of external state. 
//	In this case, its state comprises the last two Fibonacci sequence numbers.
	Stream<String> stream = 
			  Stream.of("a", "b", "c").filter(element -> element.contains("c"));
			Optional<String> anyElement = stream.findAny();
			
	
	System.out.println(anyElement);
	
//	To implement this state, we use an array instead of a couple of variables 
//	because all external variables used inside the lambda have to be effectively final
	System.out.println(fibonacci);
	fibonacci.limit(20).forEach(System.out::println);
	/**
	 * Consumers
	 * As opposed to the Supplier, the Consumer accepts a 
	 * generified argument and returns nothing
	 * It is a function that is representing side effects.
	 * */
	
	Map<String, Integer> nameMap = new HashMap<>();
//	nameMap.put("suman", 3);
	Integer value=nameMap.computeIfAbsent("suman", s -> s.length());
	IntStream streamOfChars = "abc".chars();
	streamOfChars.mapToObj(c->(char)c).forEach(System.out::println);;
	System.out.println(nameMap);
	
	
	List<String> names = Arrays.asList("John", "Freddy", "Samuel");
	names.forEach(name -> System.out.println("Hello, " + name));
	
//	BIConsumer interface
	Map<String, Integer> ages = new HashMap();
	ages.put("John", 25);
	ages.put("Freddy", 24);
	ages.put("Samuel", 30);

	ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));
	
//	Predicates
	//it returns a boolean value
//case of the Predicate lambda is to filter a collection of values
	
	List<String> names2 = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");
	List<String> namesWithA=names2.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
	System.out.println(namesWithA);
	
//	Operators
//	Operator interfaces are special cases of a function that receive and return the same value type

	
//	One of the most interesting use cases of a BinaryOperator is a reduction operation
//	we want to aggregate a collection of integers in a sum of all value
//	Stream API, we could do this using a collector, but a more generic way to do it would be to use the reduce method:
	List<Integer> values = Arrays.asList(3, 5, 8, 9, 12);
	
	int sum = values.stream()
			  .reduce(0, (i1, i2) -> i1 + i2);
	System.out.println(sum);
	
	


}
}
