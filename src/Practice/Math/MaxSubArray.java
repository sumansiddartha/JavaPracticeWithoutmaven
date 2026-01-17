package Practice.Math;

public class MaxSubArray {

	public static int maxSubArray(int[] nums) {
		int n = nums.length;
		int maxSubArraySum=Integer.MIN_VALUE;
		int start=0;
		int end=0;
		for(int left=0;left<n;left++) {
			int runningWindowSum=0;
			for(int right=left;right<n;right++) {
				runningWindowSum+=nums[right];
				if(runningWindowSum>maxSubArraySum) {
					maxSubArraySum=runningWindowSum;
					start=left;
					end=right;
				}
			}
		}
//		int newArraylength=end-start;
//		int[] newArray=new int[newArraylength];
//		for(int i=start;i<end;i++) {
//			for(int j=0;j<newArray.length;i++) {
//				newArray[j]=nums[i];
//				System.out.println(newArraylength);
//				
//			}
//		}
//		System.out.println(newArray);
		
		System.out.printf("Found Maximum Subarray between %d and %d", start, end);
		return maxSubArraySum;
	}
	
	//Using Kundane's Algorithm
	
	public static int maxSubArrayKundane(int[] arr) {
		int size=arr.length;
		int start=0;
		int end=0;
		int maxSoFar=arr[0],maxEndingHere=arr[0];
		
	} 
	
	
	public static void main(String[] args) {
		int[] arr = {-3, 1, -8, 4, -1, 2, 1, -5, 5};
		int x=maxSubArray(arr);
		System.out.println("==========="+x);
	}
}
