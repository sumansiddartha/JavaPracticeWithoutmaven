package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestString {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
		Optional<String> max = strings.stream().max((s1,s2)->s1.length()-s2.length());
		System.out.println("Longest String:"+(max.isPresent()?max.get():"N/A"));
		
		
//		Given a list of strings, write a program to find and print the strings with length greater than a specified value 5 using Java Stream API.
		List<String> collect = strings.stream().filter(n->n.length()>5).collect(Collectors.toList());
		System.out.println(collect);
		
//		Given a list of strings, write a program to find and print the strings with thCharactere maximum length using Java Stream API
		String string = strings.stream().max(Comparator.comparingInt(String::length)).toString();
	System.out.println(string);
	
	String x="java";
	Entry<Character,Long> findFirst = x.chars().mapToObj(y->(char)y)
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	.entrySet().stream().filter(z->z.getValue()>1).findFirst().orElseThrow();
	System.out.println(findFirst.getKey());
	
	}

}
