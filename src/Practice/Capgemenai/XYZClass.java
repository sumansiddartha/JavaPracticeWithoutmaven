package Practice.Capgemenai;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class XYZClass {
	
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(6);
		list.add(3);
		list.add(5);
		 List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
//		Collections.sort(list);
		System.out.println(collect);
		int size = list.size();
//		list.get(size-2);
//		System.out.println(list.get(size-2));
		System.out.println(collect.get(collect.size()-2));
		for(int i=0;i<list.size();i++) {
		}
		
//		Arrays.stream(list).sort().max();
	}


}
