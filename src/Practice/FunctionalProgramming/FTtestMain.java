package Practice.FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FTtestMain {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(123,45444,5666555,899899,23343322,56677);
		System.out.println(numbers);
		Collections.sort(numbers,(n1,n2)->n1.compareTo(n2));
		System.out.println(numbers);
		
		String data=new SimpleData().setData("Baeldung").getData();
		
		
	}
	
}
