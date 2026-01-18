package Practice.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetInitializtion {
public static void main(String[] args) throws UnsupportedOperationException{
	Set<String> set = newHashSet("a","b","c");
	System.out.println(set);
	
	Set<String> set1 = new HashSet<>();
	set1.add("Canada");
	set1.add("USA");
	Set<String> unmodifiableSet = Collections.unmodifiableSet(set1);
	unmodifiableSet.add("INDIA");
	System.out.println(unmodifiableSet);
	
//	mmutable Sets in Java 9
//	Set<String> immutable = Set.of();
	
}



public static final <T> Set<T> newHashSet(T... objs) {
    Set<T> set = new HashSet<T>();
    
    
//    Collections.addAll, which accepts the collection object and an 
//    array of values, is best among others because of the low overhead of copying values.
    Collections.addAll(set, objs);
    return set;
}
}
