package Practice.BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import Practice.Streams.Employee;

public class PracticeClass {
	
	
	 public static int findSecondLargest(int[] nums) {
		   System.out.println(nums.length);
		   List<int[]> asList = Arrays.asList(nums);
	        Set<Integer> set=new HashSet();
	      List<Integer> list=new ArrayList<Integer>(set);
	       
//	        	Iterator<Integer> iterator = set.iterator();
	      System.out.println(set.size());
	      
	      
	         return 0;
	    }
	
	public static void main(String[] args) {
		 int[] test1 = {5, 2, 8, 1, 9, 3};
	        int[] test2 = {1, 1, 1, 1};
	        System.out.println(findSecondLargest(test1)); // Should print 8
	        System.out.println(findSecondLargest(test2)); // Should print 1
	        
	        
	        
	}

}
