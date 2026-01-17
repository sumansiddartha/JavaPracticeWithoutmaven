package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringsWithVowels {
public static void main(String[] args) {
//	write a program to find and print the strings containing only vowels using Java Stream API.
	List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "oai");
	List<String> collect = strings.stream().filter(s->s.matches("[aeiouAEIOU]+")).collect(Collectors.toList());
	System.out.println(collect);
	
	
//	Given a list of strings, write a program to find and print the strings with the maximum number of vowels using Java Stream API.

	Map<String, Long> collect2 = strings.stream() .collect(Collectors.toMap(Function.identity(), s -> s.chars().filter(c -> "AEIOUaeiou".indexOf(c) != -1).count()));
	System.out.println(collect2);
	List<Entry<String, Long>> collect4 = collect2.entrySet().stream().filter(n->n.getValue()==1).collect(Collectors.toList());
	long maxFrequency = collect2.values().stream().mapToLong(Long::longValue).max().orElse(0);
	List<String> collect3 = collect2.entrySet().stream().filter(entry->entry.getValue()==maxFrequency)
	.map(Map.Entry::getKey)
	.collect(Collectors.toList());
	System.out.println(collect3);
}
}
