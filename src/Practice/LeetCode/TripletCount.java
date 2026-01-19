package Practice.LeetCode;

import java.util.Arrays;

public class TripletCount {
	 public static long countTriplets(int[] d, int t) {
		 int n=d.length;
		 Arrays.sort(d);
		 long count=0;
		 for(int i=0;i<n-2;i++) {
			 int left=i+1;
			 int right=n-1;
			 while(left<right) {
				 long sum=(long)d[i]+d[left]+d[right];
				 if(sum<=t) {
					 // All triplets (i, left, left+1 ... right) are valid
					 count += (right - left);
	                    left++;
				 }else {
					 right--; 
				 }
			 }
		 }
		 return count;
	 }
public static void main(String[] args) {
	 int t = 8;
     int[] d = {1, 2, 3, 4, 5};

     System.out.println(countTriplets(d, t));
}
}
