package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AlphabeticalOrderSorting {
public static void main(String[] args) {
	 List<String> strings = Arrays.asList("banana", "orange", "apple", "grape");
	 strings.stream().map(n->new StringBuffer(n).reverse()).sorted().collect(Collectors.toList()).forEach(System.out::println);

}
}
