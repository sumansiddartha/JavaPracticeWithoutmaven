package Practice.Math;

import java.util.Arrays;
import java.util.Iterator;

public class PermutatiosPractice {

	
	//I am planning to use heap recursive algorithm
	//-->i need a swapping method form-index to to-index
	//-->i am writing the heap algorithm in method named PrintAllRecursive
	//-->i need attributes like length of the array,array
	private static int count=0;
	public static  <T> void PrintAllRecursive(int k,T[] elements,char delimiter) {
		if(k==1) {
			printArray(elements,delimiter);
		}else {
			for(int i=0;i<k-1;i++) {
				PrintAllRecursive(k-1,elements,delimiter);
				if(k%2==0) {
					swap(elements,i,k-1);
				}else {
					swap(elements,0,k-1);
				}
			}
			PrintAllRecursive(k-1,elements,delimiter);
		}
		
	}
	
	
	
	//I am planning for iterative algorithm for heap
	public static <T> void printAllIterative(int k,T[] elements,char delimiter) {
		int[] indexes=new int[k];
		for(int i=0;i<k;i++) {
			indexes[i]=0;
		}
		
		
		int i=0;
		while(i<k) {
			
			
			
			i++;
		}
	}
	
	private static <T> void swap(T[] elements,int a,int b) {
		
		T temp=elements[a];
		elements[a]=elements[b];
		elements[b]=temp;
		System.out.println(count++);
	}
	private static <T> void printArray(T[] elements,char delimiter) {
		for(int i=0;i<elements.length;i++) {
			if(i==elements.length-1) {
				delimiter='\n';	
			}
			elements.toString().replaceAll(" ", "");
			System.out.print(elements[i]+""+delimiter);
		}
	}
	
	
	public static void main(String[] args) {
		Integer[] array= {1,2,3,4,5};
		String string="abc";
//		swap(array,0,3);
//		printArray(array,'+');
//		System.out.println(Arrays.asList(array));
		PrintAllRecursive(string.length(),string.split(""),' ');
	}
}
