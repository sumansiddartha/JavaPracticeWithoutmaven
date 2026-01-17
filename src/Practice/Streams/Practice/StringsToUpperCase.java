package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsToUpperCase {

	public static void main(String[] args) {
//		Write a program to convert a list of strings to uppercase using Java Stream API.
		List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
		List<String> collect = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
	}

}
