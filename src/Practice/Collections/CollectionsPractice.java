package Practice.Collections;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionsPractice {
	public static void main(String[] args) {
		
		
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(12);
		ll.add(15);
		ll.add(17);
		ll.add(19);
		ll.add(120);
		ll.add(112);
		ll.addFirst(50);
		ll.add(3,10);
		List list=Collections.synchronizedList(ll);
		System.out.println(ll);
//		System.out.println(list);
		String[] array = { "apple", "banana", "date" , "cherry"};
		LinkedList<String> linkedList = new LinkedList<>();
		
		ArrayList<String>  al=new ArrayList<>();
		
	 Collections.addAll(al, array);
		System.out.println(al);
		Collection<Integer> numbers = IntStream.range(0, 10).boxed().collect(Collectors.toSet());
		List<Integer> list1 = new ArrayList<>(numbers);
		ListIterator<Integer> listIterator = list1.listIterator();
		ArrayList a = new ArrayList<>();
		a.add(new Integer(10));
		a.add(new String("Hello"));
		a.add(new Double(11.6));
		List<Integer> result = new ArrayList<>();
		while (listIterator.hasPrevious()) {
			
			result.add(listIterator.previous());
		}
		System.out.println(result);
		Collections.reverse(list1);
		System.out.println(list1);
		 List<Integer> unmodifiableList =Collections.unmodifiableList(list1);
		 unmodifiableList.add(10);
		  CopyOnWriteArrayList<Integer> numbers1
	      = new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8});

	    Iterator<Integer> iterator = numbers1.iterator();
	    while (iterator.hasNext()) {
	        iterator.remove();
	    }
	}

}
