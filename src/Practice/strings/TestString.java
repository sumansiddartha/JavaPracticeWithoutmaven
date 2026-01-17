package Practice.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestString {
	
	public void xyz(Object o) {
		
		System.out.println("This is Object"+o);
	}
	
	public void xyz(String s) {
		System.out.println("this is string"+s);
	}
	
	public static String reverseWords(String s) {
		String[] str=s.split(" ");	      
	       StringBuilder sb=new StringBuilder();
	       for(int i=str.length;i>0;i--){
	    	   System.out.println(str[i-1]);
	    	  if(!str[i-1].isEmpty()) {
	        sb.append(str[i-1].trim());
	        
                sb.append(" ");
           
	    	  }
	       }
	       
	       return sb.toString().trim();
	}
	
public static void main(String[] args) {
	System.out.println("========"+reverseWords("a good   example")+"---sssssss");
	
	TestString tst=new TestString();
	
	tst.xyz((Object)"suman");
	
	
//	List<String> liststr = Arrays.asList("abc", "pqr", "xyz");
//	
//	String collect = liststr.stream().collect(Collectors.joining(","));
//	System.out.println(collect);
//	Map<Integer, String> map=new HashMap<>();
//	map.put(1, "suman");
//	
//	
//	
//	Set<Integer> set=new HashSet<>();
//	set.add(1);
//	set.add(2);
//	set.add(3);
//	set.add(4);
//	set.add(5);
//	set.add(1);
//	set.add(1);
//	set.add(1);
//	set.add(1);
//	set.add(1);
//	set.add(1);
//	set.add(1);
//	set.add(1);
//	set.add(1);
//	set.add(1);
//	set.add(1);
//	set.add(1);
//	set.add(14);
}
}
