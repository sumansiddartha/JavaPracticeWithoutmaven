package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateListRemoval {
	public static void main(String[] args) {
//		Write a program to remove all the duplicate elements from a list using Java Stream API
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);
		List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}

}
