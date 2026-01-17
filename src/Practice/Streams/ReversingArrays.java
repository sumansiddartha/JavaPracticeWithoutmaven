package Practice.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReversingArrays {
	public static void main(String[] args) {
		
		String a="apples";
		String b="pinapples";
		String[] fruits = {"apples", "tomatoes", "bananas", "guavas", "pineapples"};
		List<String> asList = Arrays.asList(fruits);
		Collections.reverse(asList);
		System.out.println(asList);
		
		List<String> strings = new ArrayList<>();
		strings.add("BB");
		strings.add("AA");
		strings.add(null);
		strings.add("EE");
		strings.add("DD");
		Comparator<String> nullsLastComparator = Comparator.nullsLast(Comparator.naturalOrder());
		Collections.sort(strings,nullsLastComparator);
		System.out.println(strings);
	}

}
