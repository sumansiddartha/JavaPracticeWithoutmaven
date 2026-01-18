package Practice.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LastElementStreamTest {

	public static void main(String[] args) {
		List<String> valueList = new ArrayList<>();
		valueList.add("Joe");
		valueList.add("John");
		valueList.add("Sean");
		valueList.add("Sean2");
		System.out.println(valueList);
		
		Stream<String> stream=valueList.stream();
		String orElse = stream.reduce((first,second)->second).orElse(null);
		System.out.println(orElse);
		///Skip function
		long count = valueList.stream().count();
		Stream<String> stream1 = valueList.stream();
		System.out.println(count);
		Stream<Integer> stream3 = Stream.iterate(0, i -> i + 2);
		Integer orElse2 = stream3.takeWhile(i->i<40).
				reduce((first, second) -> second).orElse(null);
		System.out.println(orElse2);

	}

}
