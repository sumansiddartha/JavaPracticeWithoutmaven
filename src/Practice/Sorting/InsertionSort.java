package Practice.Sorting;

import java.util.Arrays;

public class InsertionSort {
	
	static void insertion_Sort(int[] A) {
		int n=A.length;
		for(int i=0;i<n;i++) {
			int temp=A[i];
			int j=i;
			while(j>0 && temp< A[j-1]) {
				A[j]=A[j-1];
				j=j-1;
			}
			A[ j ] = temp; 
		}
		
		
		
	}
	
	

	public static void main(String[] args) {
		int[] s={ 7, 4, 5, 2};
		insertion_Sort(s);
		System.out.println(Arrays.toString(s));

	}

}
