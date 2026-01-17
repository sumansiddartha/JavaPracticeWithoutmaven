package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllElementsInList {
	//Write a program to find the sum of all elements in a list using Java Stream API
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		 Integer reduce = list.stream().reduce(0,(a,b)->(a+b));
		
		 System.out.println(sum);
		System.out.println(reduce);
	}

}
