package Practice.Sorting;

import java.util.Arrays;

public class BubbleSortMain {

	//bubble sort for integers
	static void bubble_sort(int A[],int n) {
		int temp;
		for(int k=0;k<n-1;k++) {
			for(int i=0;i<n-k-1;i++) {
				if(A[i]>A[i+1]) {
					temp=A[i];
					A[i]=A[i+1];
					A[i+1]=temp;
				}
				
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] s={ 7, 4, 5, 2};
		bubble_sort(s,s.length);
		System.out.println(Arrays.toString(s));
		

	}

}
