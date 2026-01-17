package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixOfCharacter {
	public static void main(String[] args) {
//		Given a list of strings, write a program to find and print the strings starting with a specific prefix ‘a’ using Java Stream API.
		List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear","amazon");
		  String prefix = "a";
		  List<String> collect = strings.stream().filter(s->s.startsWith(prefix)).collect(Collectors.toList());
		  System.out.println(collect);
	
	
	}

}
