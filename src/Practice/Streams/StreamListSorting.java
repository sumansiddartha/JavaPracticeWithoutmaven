package Practice.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList();
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Banana");
		fruits.add("Lichi");
		fruits.add("Apple");
		List<String> collect = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		List<String> collectWithCompareTo = fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
		List<String> collectReverse = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		List<String> collectReverseCompareTo= fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
		
		
		System.out.println(collectWithCompareTo);
		System.out.println(collect);
		System.out.println(collectReverse);
		System.out.println(collectReverseCompareTo);
		
		
	}
	
	
}
