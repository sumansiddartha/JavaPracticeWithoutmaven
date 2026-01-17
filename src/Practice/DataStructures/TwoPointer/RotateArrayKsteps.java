package Practice.DataStructures.TwoPointer;

import java.util.Arrays;

public class RotateArrayKsteps {
	public static void rotate(int[] input,int step) {
		step%=input.length;
		//reversing all the elements in the array
		reverse(input,0,input.length-1);
		//reversing the first k elements
		reverse(input,0,step-1);
		reverse(input,step,input.length-1);
		
	}
	private static void reverse(int[] input,int start,int end) {
		
		while(start<end) {
			int temp=input[start];
			input[start]=input[end];
			input[end]=temp;
			start++;
			end--;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		int[] array1= {1, 2, 3, 4, 5, 6, 7};
		rotate(array1,4);
		System.out.println(Arrays.toString(array1));
		
	}

}
