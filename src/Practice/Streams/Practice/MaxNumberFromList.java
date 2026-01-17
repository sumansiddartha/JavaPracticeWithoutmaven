package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaxNumberFromList {

	public static void main(String[] args) {
		//write a program to find and print the maximum element using Java Stream API
		List<Integer> numbers = Arrays.asList(2, 4, 8,22, 6, 10);
		  int max = numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
		  System.out.println(max);
		  
	}

}
