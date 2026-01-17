package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;

public class IndexOfFirstOccurance {

	public static void main(String[] args) {
//		Given a list of integers, write a program to find and print the index of the first occurrence of a specific number using Java Stream API.
		List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10);
        int targetNumber = 7;
        int indexOf = numbers.indexOf(targetNumber);
        System.out.println(indexOf);
	}

}
