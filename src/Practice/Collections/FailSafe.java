/**
 * 
 */
package Practice.Collections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 */
public class FailSafe {

	/**
	 * In the code snippet above, we’re using Fail-Safe Iterator. 
	 * Hence, even though a new element is added to the Collection during the iteration, it doesn’t throw an exception
	 *Iterators on Collections from java.util.concurrent package such as ConcurrentHashMap, CopyOnWriteArrayList, etc. are Fail-Safe in nature.
	 */
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("First", 10);
		map.put("Second", 20);
		map.put("Third", 30);
		map.put("Fourth", 40);

		Iterator<String> iterator = map.keySet().iterator();

		while (iterator.hasNext()) {
		    String key = iterator.next();
		    map.put("Fifth", 50);
		}
		System.out.println(map);
	}
//	The default iterator for the ConcurrentHashMap is weakly consistent. 
//This means that this Iterator can tolerate concurrent modification, traverses elements as they existed when Iterator was constructed and may (but isn’t guaranteed to) reflect modifications to the Collection after the construction of the Iterator.
//	Hence, in the code snippet above, the iteration loops five times, which means it does detect the newly added element to the Collection.
}
