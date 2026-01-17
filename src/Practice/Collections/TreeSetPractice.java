package Practice.Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetPractice {
	public static void main(String[] args) {
		
		Set<String> treeSet=new TreeSet<>(Comparator.comparing(String::length));
		 
		    treeSet.add("First");
		    treeSet.add("Second");
		    treeSet.add("Thirds");
		    System.out.println("-----------------");
		    System.out.println(treeSet);
		    System.out.println("-----------------");
		System.out.println(treeSet.isEmpty());
		Iterator<String> itr=treeSet.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
			if(string.equals("Second"))
				itr.remove();
			
		}
	System.out.println(treeSet);
	
	SortedSet<Integer> sortedtreeSet = new TreeSet<>();
	sortedtreeSet.add(1);
	sortedtreeSet.add(2);
	sortedtreeSet.add(3);
	sortedtreeSet.add(10);
	sortedtreeSet.add(11);
	sortedtreeSet.add(6);
	Set<Integer> subSet = sortedtreeSet.subSet(2, 10);
	Set<Integer> headSet = sortedtreeSet.headSet(6);
	Set<Integer> tailSet = sortedtreeSet.tailSet(6);
	System.out.println(subSet);
	System.out.println(headSet);
	System.out.println(tailSet);
	}

}
