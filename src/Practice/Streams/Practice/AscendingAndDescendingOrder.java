package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingAndDescendingOrder {

	public static void main(String[] args) {
//		Write a program to check if a list of integers is sorted in ascending order using Java Stream API.
		List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4);
		List<Integer> collect = numbers.stream().sorted().collect(Collectors.toList());
		List<Integer> collect2 = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println(collect2);
	}
}
