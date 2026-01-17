package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleSpecificNumbers {
public static void main(String[] args) {
//	Write a program to filter out all the elements divisible by 3 and 5 from a list of integers using Java Stream API.
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
	
	List<Integer> collect = numbers.stream().filter(n->(n%3==0&&n%5==0)).collect(Collectors.toList());
	System.out.println(collect);

}
}
