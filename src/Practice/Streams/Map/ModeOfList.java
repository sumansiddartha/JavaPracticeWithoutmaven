package Practice.Streams.Map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ModeOfList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 5);
		Map<Integer, Long> frequencyMap = numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//Map<Integer, Long> collect2 = numbers.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		frequencyMap.entrySet().stream().filter(v->v.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList()).forEach(System.out::println);;
	System.out.println(frequencyMap);
	//System.out.println(collect2);
	long maxFrequency = frequencyMap.values().stream().mapToLong(Long::longValue).max().orElse(0);
	System.out.println(maxFrequency);
	List<Integer> collect = frequencyMap.entrySet().stream()
	.filter(entry->entry.getValue()==maxFrequency)
	.map(Map.Entry::getKey).collect(Collectors.toList());
	System.out.println(collect);
	}
	
	

}
