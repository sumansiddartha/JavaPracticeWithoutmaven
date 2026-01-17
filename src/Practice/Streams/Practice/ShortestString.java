package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ShortestString {
public static void main(String[] args) {
//	Given a list of strings, write a program to find and print the shortest string using Java Stream API.

	List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
	String min = strings.stream().min(Comparator.comparingInt(String::length)).orElse(null);
	
	System.out.println(min);
	
}
}
