package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringList {

	
	public static void main(String[] args) {
//		 Write a program to reverse a list of strings using Java Stream API.
		List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
		strings.stream().map(n->new StringBuilder(n).reverse().toString()).forEach(System.out::println);
	Collections.reverse(strings);
	System.out.println(strings);
	
	
	}
}
