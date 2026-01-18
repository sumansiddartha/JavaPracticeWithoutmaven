package Practice.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetPractice {

	
	
	public static void main(String[] args) {
		Set<String> hashset=new HashSet<>();
		hashset.add("String added");
		hashset.add("String added1");
		hashset.add("String added2");
		hashset.add("String added3");
		hashset.add("String added4");
		hashset.add("String added5");
		//hashset.remove("String added");
		System.out.println(hashset);
		Iterator<String> itr=hashset.iterator();
		if(itr.hasNext()) {
			
			hashset.remove("String added1");
		}
		System.out.println(hashset);
		
		hashset.clear();
		System.out.println("hash set after clear");
		System.out.println(hashset);
		
		
		Set<String> hashset2 = new HashSet<>();
	    hashset2.add("First");
	    hashset2.add("Second");
	    hashset2.add("Third");
	    Iterator<String> itr1 = hashset.iterator();
	    while (itr1.hasNext()) {
	        itr1.next();
	        hashset2.remove("Second");
	    }
	    
	    
	    HashSet hashSet3 = new HashSet();
        
	    hashSet3.add(new Employee(3, "John"));
	    hashSet3.add(new Employee(5, "Mike"));
	    hashSet3.add(new Employee(2, "Bob"));
	    hashSet3.add(new Employee(1, "Tom"));
	    hashSet3.add(new Employee(4, "Johnny")); 
	    TreeSet treeset=new TreeSet<>(hashSet3);
	    System.out.println(treeset);
	}
}
