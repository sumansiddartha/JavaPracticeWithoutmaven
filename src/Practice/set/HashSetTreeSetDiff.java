package Practice.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTreeSetDiff {

	public static void main(String[] args) throws NullPointerException{
		Set<String> tset = new TreeSet<String>();
		Set<String> hset = new HashSet();
		tset.add("Mango");
		tset.add("Apple");
		tset.add("Pineapple");
		tset.add("zebra");
		tset.add("grapes");
		hset.add(null);
		System.out.println(tset.size());
		System.out.println(tset);
		System.out.println("This is first element in the list:::"+ ((TreeSet<String>) tset).pollFirst());
		System.out.println("This is first item in the list:::"+ ((TreeSet<String>) tset).first());
		System.out.println("This is last element in the list:::"+ ((TreeSet<String>) tset).pollLast());
//		System.out.println("This is ceiling/least element in the list:::"+((TreeSet<String>) tset).ceiling());
		
		Scanner scanner=new Scanner(System.in);
		
		hset.add("Mango");
		hset.add("Apple");
		hset.add("Pineapple");
		hset.add("grapes");
		hset.remove(scanner.next());
//		hset.clear();
		
		System.out.println(hset);
		
		 Iterator<String> itr = hset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
//			hset.remove("grapes");  if it is the case the ConcurrentModificationException
			
			if(itr.next().equals("grapes"))
				itr.remove();
		}
//		performance of a HashSet is affected mainly by two parameters – its Initial Capacity and the Load Factor.

	}

}
