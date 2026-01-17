package Practice.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import Practice.DataStructures.LinkedList.LinkedList;

public class OrderingInStream {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("B", "A", "C", "D", "F");
		
	    Set<String> set = new TreeSet<>(list);
	    
	    System.out.println(list);
	    System.out.println(set);
	    Object[] listOutput = list.stream().toArray();
	    Object[] setOutput = set.stream().toArray();
	    System.out.println(Arrays.toString(listOutput));
	    System.out.println(Arrays.toString(setOutput));
	    Set<Integer> set2 = new TreeSet<>(
	    		  Arrays.asList(-9, -5, -4, -2, 1, 2, 4, 5, 7, 9, 12, 
	    				  13, 16, 29, 23, 34, 57, 102, 230));
	
	    Object[] array = set2.stream().unordered().parallel().limit(5).toArray();
	    System.out.println(Arrays.toString(array));
	}

}
