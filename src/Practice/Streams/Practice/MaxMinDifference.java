package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaxMinDifference {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(10, 5, 7, 18, 3, 15);
	int max = numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
	int min = numbers.stream().mapToInt(Integer::intValue).min().getAsInt();
	int diff=max-min;
	System.out.println(diff);
}
}
