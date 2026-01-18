package Practice.Sorting;

import java.util.Arrays;

public class SelectionSortMain {

	
	static void selection_sort(int[] A, int n) {
	    int minimum;
	    
	    for (int i = 0; i < n - 1; i++) {
	        minimum = i;
	        
	        for (int j = i + 1; j < n; j++) {
	            if (A[j] < A[minimum]) {
	                minimum = j;
	            }
	        }
	        
	        // Print debug info
	        
	        
	        // Swap elements
	        if (i != minimum) { // Only swap if the minimum is not already at position i
	            swap(A, i, minimum);
	        }
	    }
	}

	static void swap(int[] A, int i, int j) {
	    int temp = A[i];
	    A[i] = A[j];
	    A[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] s={ 7, 4, 5, 2};
		selection_sort(s,s.length);
		System.out.println(Arrays.toString(s));	
	}
}
