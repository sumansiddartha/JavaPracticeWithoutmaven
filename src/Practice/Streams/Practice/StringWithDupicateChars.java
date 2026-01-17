package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringWithDupicateChars {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "strawberry", "watermelon");
		List<String> collect = strings.stream().filter(s->s.length()==s.chars().distinct().count()).collect(Collectors.toList());
	System.out.println(collect);
	
	}
}
