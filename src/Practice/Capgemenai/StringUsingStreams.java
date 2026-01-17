package Practice.Capgemenai;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUsingStreams {
public static void main(String[] args) {
	List<String> awesomeAnimals = Arrays.asList("Shark", "Panda", "Armadillo");
	List<String> collect = awesomeAnimals.stream().collect(Collectors.toList());
	System.out.println(collect);
	
//	FunctionalInterfaces
	Function<Integer, String> intToString = Object::toString;
	Function<String, String> quote = s -> "'" + s + "'";
	
	Map<String, Integer> nameMap = new HashMap();
	nameMap.put("Suman", 1);
//	nameMap.put("John", 2);
	Integer value = nameMap.computeIfAbsent("John", s -> s.length());
	System.out.println(value);
	Function<Integer, String> quoteIntToString = quote.compose(intToString);
	System.out.println(quoteIntToString.apply(5));
	
	//Two Arity Functions
	Map<String, Integer> salaries = new HashMap<>();
	salaries.put("John", 40000);
	salaries.put("Freddy", 30000);
	salaries.put("Samuel", 50000);

	salaries.replaceAll((name, oldValue) -> 
	  name.equals("John") ? oldValue : oldValue + 10000);
	System.out.println(salaries);
	Stream<Integer> limit = Stream.iterate(40, n->n+2).limit(20);
	System.out.println(limit);

}
}
