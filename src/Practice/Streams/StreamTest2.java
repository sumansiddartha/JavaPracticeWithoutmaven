package Practice.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamTest2 {
public static void main(String[] args) {
	List list=new ArrayList<>();
	list.stream();
	list.add(1);
	list.add(3);
	list.add(2);
	list.add(5);
	list.add(6);
	list.add(6);
	list.add(10);
	list.add(6);
	list.add(6);
	list.add(3);
	long count = list.stream().distinct().count();
	System.out.println(count);
	list.parallelStream().forEach(element->doWork(element));
	
}
static int doWork(Object num) {
	if(num instanceof Integer) {
return 2*(Integer)num;
	}
	else {
		throw new IllegalArgumentException("Input must be a String.") ;
	}
}
}
