package Practice.Collections.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronisedAndConcurrentHashMapPrectice {
	
	//We are handling differences between Them
	
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		 map.put(1, "baeldung");
		    map.put(2, "HashMap");
		    Map<Integer, String> syncMap=Collections.synchronizedMap(map);
		    Iterator<Entry<Integer, String>> iterator = syncMap.entrySet().iterator();
		    //Map modification not allowed in synchronised Map while iteration
		    
//		    while(iterator.hasNext()) {
//		    	syncMap.put(3,"Modification");
//		    	iterator.next();
//		    }
		    
		    
		    
		    
		    Map<Integer, String> concHashMap2=new ConcurrentHashMap<>(syncMap);
		    Iterator<Entry<Integer, String>> iterator3 = concHashMap2.entrySet().iterator();
		    while(iterator3.hasNext()) {
		    	concHashMap2.put(3, "Modification");
		    	iterator3.next();
		    }
		    System.out.println("======================");
		    System.out.println(concHashMap2);
		    System.out.println("======================");
		    Map<Integer, String> concHashMap=new ConcurrentHashMap<>();
		    
		    concHashMap.put(1, "Suman");
		    concHashMap.put(2, "Pavan");
		    concHashMap.put(3, "Praveen");
		    concHashMap.put(4, "Santosh");
		    
		    Iterator<Entry<Integer,String>> itr1=concHashMap.entrySet().iterator();
		    while (itr1.hasNext()) {
		    	 concHashMap.put(6, "satish");
		    	 itr1.next();
			}
		    System.out.println(concHashMap);
		    
		    
		    
		    ///Null keys and values
		   // concHashMap.put(null, "kkkkk");
		    //Here it is not allowed
//		    System.out.println(concHashMap);
		    
		    
		    syncMap.put(null, "siddartha");
		    System.out.println("Synchronised hash map");
		    System.out.println(syncMap);
		    Set ccc=new TreeSet<>();
		    ccc.add("2");
		    ccc.add(3);
		    ccc.add("1");
		    Iterator it4=ccc.iterator();
		    while(it4.hasNext()) {
		    	System.out.println(it4.next()+" ");
		    }
		    
	}
	
	

}
