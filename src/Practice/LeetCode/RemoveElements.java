package Practice.LeetCode;

import java.util.Arrays;

public class RemoveElements {
	  public static int removeElement(int[] nums, int val) {
	      int i=0;
	      int j=nums.length-1;
	     while(i<=j) {
	    	 if(nums[i]==val) {
	    		 int temp=nums[i];
	    		 nums[i]=nums[j];
	    		 nums[j]=temp;
	    		 j--;
	    	 }else {
	    		 i++;
	    	 }
	     }
		  return j+1;
	    }
	public static void main(String[] args) {
		int[] s={3,2,2,3,4,4,4,4,3,5,3,2};
		System.out.println(removeElement(s,3));
		System.out.println(Arrays.toString(s));
	}

}
