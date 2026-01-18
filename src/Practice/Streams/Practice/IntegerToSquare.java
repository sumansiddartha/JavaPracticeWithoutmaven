package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerToSquare {
	public static void main(String[] args) {
//		Write a program to convert a list of integers to a list of their squares using Java Stream API.
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> collect = numbers.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(collect);
	}

}
