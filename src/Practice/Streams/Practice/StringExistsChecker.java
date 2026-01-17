package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;

public class StringExistsChecker {
public static void main(String[] args) {
	//Write a program to check if a list of strings contains a specific string using Java Stream API.
	 List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
	 String target = "banana1";
	 boolean anyMatch = strings.stream().anyMatch(s->s.equals(target));
	 System.out.println(anyMatch);

}
}
