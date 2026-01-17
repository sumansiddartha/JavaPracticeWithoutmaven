package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PrintNthLargestNumber {
public static void main(String[] args) {
	 //Given a list of integers, write a program to find and print the second largest number using Java Stream API.

	List<Integer> numbers = Arrays.asList(4, 2, 8, 6, 10);
	Integer findFirst = numbers.stream().sorted((n1,n2)->n2-n1).skip(1).findFirst().orElseThrow();
	System.out.println(findFirst);
}
}
