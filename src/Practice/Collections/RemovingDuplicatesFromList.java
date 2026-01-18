package Practice.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicatesFromList {
	public static void main(String[] args) {
		List<Integer> listWithDuplicates = Arrays.asList(5, 0, 3, 1, 2, 3, 0, 0);
		List<Integer> listWithoutDuplicates=new ArrayList<>(new HashSet<>(listWithDuplicates));
		List<Integer> listWithoutDuplicatesLinkedHash=new ArrayList<>(new LinkedHashSet<>(listWithDuplicates));
		System.out.println(listWithoutDuplicates);
		System.out.println(listWithoutDuplicatesLinkedHash);
		//Using Streams
		List<Integer> collect = listWithDuplicates.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		String name="Suman Siddartha";
		name.chars().distinct().mapToObj(c->(char)c).forEach(System.out::println);
		
		
	}

}
