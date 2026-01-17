package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;

public class ProductOfallElements {

	public static void main(String[] args) {
//		Write a program to find the product of all elements in a list of integers using Java Stream API.
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	
		int intValue = numbers.stream().reduce(1,(a,b)->a*b).intValue();
		System.out.println(intValue);
	}
}
