package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intersection {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        List<String> list2 = Arrays.asList("banana", "orange", "grape", "watermelon");
        List<String> collect = list1.stream().filter(list2::contains).collect(Collectors.toList());
	System.out.println(collect);
	}

}
