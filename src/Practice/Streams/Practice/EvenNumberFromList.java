package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFromList {

	public static void main(String[] args) {
		// filter out all the even numbers from a list using Java Stream API
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,23,24,432,654,66,64,68);
		 numbers.stream().filter(n->n%2==0).sorted().collect(Collectors.toList()).forEach(System.out::println);
	}

}
