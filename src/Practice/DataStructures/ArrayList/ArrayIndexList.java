package Practice.DataStructures.ArrayList;

/***
 * 
 * Index List while the size of the array gets doubled
 * 
 * **/
public class ArrayIndexList<E> implements IndexList<E>{
private E[] A;
private int capacity=16;
private int size=0;

	
	
	
	public ArrayIndexList() {
	A=(E[])new Object[capacity];
}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean ieEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(int i, E e) throws IndexOutOfBoundsException {
//		checkIndex(i,size()+1);
		
		if(size==capacity) {
			capacity*=2;
			E[] B=(E[])new Object[capacity];
			for(int j=0;j<size;j++)
					B[j]=A[j];
			A=B;
				
		
		}
		for(int j=size-1;j>=i;j--) {
			A[i+1]=A[i];
		A[i]=e;
		size++;
		}
		
		
	}


	@Override
	public E remove(int i) throws IndexOutOfBoundsException {
	    E temp=A[i];
	    for(int j=i;j<size-1;j++)
	    	A[j]=A[j+1];
	    size--;
		return temp;
	}

	@Override
	public E get(int i) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int i, E e) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

}
