package Practice.DataStructures.DoubleLinkedList;

import Practice.DataStructures.ExceptionHandling.InvalidPositionException;
import Practice.DataStructures.NodeList.Position;

public class DNode<E> implements Position<E>{
   private DNode<E> prev,next;
   private E element;
	
	
	
	public DNode(DNode<E> newPrev, DNode<E> newNext, E element) {
	super();
	this.prev = newPrev;
	this.next = newNext;
	this.element = element;
}
	
	



	@Override
	public E Element() throws InvalidPositionException {
		if(prev==null && next==null) throw new InvalidPositionException("Position not in the list");
		
		return element;
	}



	public DNode<E> getPrev() {
		return prev;
	}



	public void setPrev(DNode<E> prev) {
		this.prev = prev;
	}



	public DNode<E> getNext() {
		return next;
	}



	public void setNext(DNode<E> next) {
		this.next = next;
	}



	public E getElement() {
		return element;
	}



	public void setElement(E element) {
		this.element = element;
	}

	
	


}
