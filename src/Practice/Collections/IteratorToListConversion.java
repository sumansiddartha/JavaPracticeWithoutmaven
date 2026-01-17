package Practice.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class IteratorToListConversion {
	public static void main(String[] args) {
		
		Iterator<Integer> iterator=Arrays.asList(1,2,3).iterator();
		
		List actualList=new ArrayList();
//		while(iterator.hasNext()) {
//			actualList.add(iterator.next());
//		}
//		System.out.println(actualList);
		
		//ForEachRemaining
//		List actualListForEachRemaining=new ArrayList();
//		
//		iterator.forEachRemaining(actualListForEachRemaining::add);
//		System.out.println(actualListForEachRemaining);
		
		
		
		//Using Streams
		Iterable<Integer> iterable=()->iterator;
		List<Integer> collect = StreamSupport.stream(iterable.spliterator(), false).collect(Collectors.toList());
		System.out.println(collect);
		
		
		
		List list1=Arrays.asList("1", "2", "3", "4");
		List list2=Arrays.asList("1", "2", "3", "4");
		List list3 = Arrays.asList("1", "2", "4", "3");
		
		System.out.println(list1.equals(list2));
		
		
		List<Integer> givenList = Arrays.asList(1, 2, 3, 4, 5, 6);
		Collections.shuffle(givenList);
		int randomSeriesLength = 3;

	    List<Integer> randomSeries = givenList.subList(0, randomSeriesLength);
		System.out.println(randomSeries);
		
		
	}

}
