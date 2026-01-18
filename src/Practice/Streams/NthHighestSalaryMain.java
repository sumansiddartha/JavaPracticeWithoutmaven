package Practice.Streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class NthHighestSalaryMain {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap();
		map.put("suman", 75000);
		map.put("srinivas", 65000);
		map.put("ravi", 20000);
		map.put("Naveen", 18000);
		System.out.println(NthHighest(map, 2));

	}
	static Entry<String, Integer> NthHighest(Map<String,Integer> map1,int n) {
		
		Entry<String, Integer> entry = map1.entrySet().stream().
		sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
		.collect(Collectors.toList()).get(n-1);
		for(Map.Entry<String,Integer> a:map1.entrySet()) {
			System.out.println("This is a print "+a.getKey()+" This is the value "+a.getValue());
		}
		
		return entry;
	}

}
