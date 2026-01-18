package Practice.Streams.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TestClass {
	
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(5,0,1,0,3);
		 List<Integer> zeros = new ArrayList<>();
	        List<Integer> nonZeros = new ArrayList<>();
	        for (int num : asList) {
	            if (num == 0) {
	                zeros.add(num);
	            } else {
	                nonZeros.add(num);
	            }
	        }	
            zeros.addAll(nonZeros);
            System.out.println(zeros);
            
            int[] array = new int[] { 42, 2, 0, 3, 4, 0 };
            int[] result = new int[array.length];
            int index=0;
            for(int n:array) {
            	if(n!=0) {
            		result[index++]=n;
            	}
            	
            }
            
            for(int res:result) {
            	System.out.println(res);
            }
		
	}

}
