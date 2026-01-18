package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatinateString {
public static void main(String[] args) {
//	 Given a list of strings, write a program to concatenate all the strings using Java Stream API.
	 List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
	 String collect = strings.stream().collect(Collectors.joining("-"));
	 System.out.println(collect);
}
}
