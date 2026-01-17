package Practice.forEach;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class TestForEach {

	
	public static void main(String[] args) {
//		String[] names= {"suman","siddartha","jayarala","muni"};
//		for(String name:names) {
//			System.out.println(name);
//		}
		List<String> names = Arrays.asList("Larry", "Steve", "James");
		names.forEach(System.out::println);
		
		Set<String> uniqueNames = new HashSet<>(Arrays.asList("Larry", "Steve", "James","Larry", "Steve"));
	
//		uniqueNames.forEach(System.out::println);
		
		
		Queue<String> namesQueue = new ArrayDeque<>(Arrays.asList("Larry", "Steve", "James"));

		namesQueue.forEach(System.out::println);
		
		
//		Iterating Over a Map Using Map’s forEach
//		Maps are not Iterable, but they do provide their own variant of forEach that accepts a BiConsumer.
		
		Map<Integer, String> namesMap = new HashMap<>();
		namesMap.put(1, "Larry");
		namesMap.put(2, "Steve");
		namesMap.put(3, "James");	
		
		namesMap.forEach((key, value) -> System.out.println(key + " " + value));
		
		
		namesMap.entrySet().forEach(entry -> System.out.println(
				  entry.getKey() + " " + entry.getValue()));
	}
}
