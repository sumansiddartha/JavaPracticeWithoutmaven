package Practice.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetPractice {
public static void main(String[] args) {
	
	/**
	 * 
	 * . Operations like add, remove and search take O(log n) time 
	 * while operations like printing n elements in sorted order require O(n) time.
	 * 
	 * */
	
	
	
	
//	lets us define the order in which the elements get sorted by using a Comparable or Comparator:
	Set<String> treeSet = new TreeSet<>(Comparator.comparing(String::length));
	
//	Although TreeSet isn’t thread-safe, it can be synchronized externally using the Collections.synchronizedSet() wrapper
	Set<String> syncTreeSet = Collections.synchronizedSet(treeSet);
	
	
	
	 SortedSet<Integer> treeSet1 = new TreeSet<>();
	    treeSet1.add(1);
	    treeSet1.add(2);
	    treeSet1.add(3);
	    treeSet1.add(4);
	    treeSet1.add(5);
	    treeSet1.add(7);
	    
	    treeSet1.add(6);
	    
	    Set<Integer> expectedSet = new TreeSet<>();
	    expectedSet.add(2);
	    expectedSet.add(3);
	    expectedSet.add(4);
	    expectedSet.add(5);

	    Set<Integer> subSet = treeSet1.subSet(2, 6);
	    Set<Integer> headSet = treeSet1.headSet(6);
	System.out.println(headSet);
	
	
	 NavigableSet<Integer> ntreeSet = new TreeSet<>();
	    ntreeSet.add(1);
	    ntreeSet.add(2);
	    ntreeSet.add(3);
	    ntreeSet.add(4);
	    ntreeSet.add(5);
	    ntreeSet.add(6);
	    Set<Integer> nsubSet = ntreeSet.tailSet(4);
	    System.out.println(nsubSet);
	
}
}
