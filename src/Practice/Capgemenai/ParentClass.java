package Practice.Capgemenai;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ParentClass {
	private int x;
	private String y;
	public ParentClass(int x, String y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	
	
	public void xyz() {
		System.out.println("I am showing inheritence"+x+"  "+y);
		
		
		
	}
	public static void main(String[] args) {
		Set<Integer> hash1=new HashSet<>();
		hash1.add(1);
		hash1.add(2);
		hash1.add(3);
		hash1.add(4);
		hash1.add(4);
		System.out.println(hash1);
		Map<String, Integer> map=new HashMap<>();
		map.put(null, null);
		map.put("suman", 1);
		map.put("Suman", 2);
		System.out.println(map);
	}
	

}
