package Practice.MinMaxArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxArrayTest {
	
	public static void main(String[] args) {
		int[] integers = new int[] { 20, 98, 12, 7, 35 };
	
	int min=Arrays.stream(integers).min().getAsInt();
	int max=Arrays.stream(integers).max().getAsInt();
	System.out.println(max); 
	
	List<Integer> listInteger=Arrays.asList(1,2,3,5,7,11,13,5,4);
	Collections.sort(listInteger);
	System.out.println(listInteger);
//	int max=listInteger.max().getAsInt();
	}

}
