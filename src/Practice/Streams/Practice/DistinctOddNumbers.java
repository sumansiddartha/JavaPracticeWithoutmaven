package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctOddNumbers {
	
	public static boolean oddNumbers(int num) {
		if(num%2==0) {
			return false;
		}
		return true;
	}

	
	public static void main(String[] args) {
//		 Given a list of integers, write a program to find and print the distinct odd numbers using Java Stream API.
	
		List<Integer> numbers = Arrays.asList(1, 2, 3,3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> collect = numbers
		.stream()
		.filter(DistinctOddNumbers::oddNumbers)
		.distinct()
		.collect(Collectors.toList());
		System.out.println(collect);
//		Given a list of integers, write a program to find and print the sum of all odd numbers using Java Stream API.
		int sum = numbers.stream().filter(num->num%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
	
	}
}
