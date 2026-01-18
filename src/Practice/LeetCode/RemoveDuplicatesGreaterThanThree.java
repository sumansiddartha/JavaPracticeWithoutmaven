package Practice.LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesGreaterThanThree {
	 public static int removeDuplicates(int[] nums) {
		 int k=2;
		 for(int i=2;i<nums.length;i++) {
			 if(nums[i]!=nums[k-2]) {
				 nums[k++]=nums[i];
			 }
		 }
		 return k;
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");		
		int length=sc.nextInt();
		int[] x=new int[length];
		for(int i=0;i<x.length;i++) {
			x[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(x));
		System.out.println(removeDuplicates(x));
		System.out.println(Arrays.toString(x));

	}

}
