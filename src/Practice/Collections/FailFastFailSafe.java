package Practice.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFastFailSafe {
	public static void main(String[] args) {
//		failFast
		ArrayList<Integer> numbers=new ArrayList(List.of(1,2,3,4));
		Iterator<Integer> iterator=numbers.iterator();
		while(iterator.hasNext()) {
			
			Integer number=iterator.next();
//			numbers.add(50);   //not allowed in failfast approach
			if(number==3) {
				iterator.remove();
			}
			
		}
	}

}
