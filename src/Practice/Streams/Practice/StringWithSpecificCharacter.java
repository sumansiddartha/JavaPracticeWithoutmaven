package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;

public class StringWithSpecificCharacter {

	public static void main(String[] args) {
//		Given a list of strings, write a program to count the number of strings containing a specific character ‘a’ using Java Stream API.
		List<String> strings = Arrays.asList("apple", "banana", "orange", "grape","mgd");
		long count = strings.stream().filter(n->n.contains(String.valueOf("a"))).count();
		System.out.println(count);

	}

}
