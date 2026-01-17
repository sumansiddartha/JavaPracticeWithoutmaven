package Practice.DataStructures.BitManupulationpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Array2DPractice {
	public static void main(String[] args) {
		List<Integer> asList1 = Arrays.asList(5, 12, 17, 9, 3);
		List<Integer> asList2 = Arrays.asList(13, 4, 8, 14, 1,21);
		List<Integer> asList3 = Arrays.asList(9, 6, 3, 7, 21);
		Stream.of(asList1,asList2,asList3).flatMap(List::stream).collect(Collectors.toList()).forEach(System.out::println);;
		
		
		List country = Stream.of(Arrays.
				asList("Colombia", "Finland", "Greece", "Iceland", "Liberia", "Mali","Uzbekistan", "Mauritius"), 
		Arrays.asList("Peru", "Serbia", "Singapore", "Turkey", "Uzbekistan", "Yemen", "Zimbabwe", "Greece", "Iceland")).flatMap(List::stream).collect(Collectors.toList());
		
		
		System.out.println(country);
	}

}
