package Practice.DataStructures.DoubleLinkedList;

import java.util.Iterator;

import Practice.DataStructures.ExceptionHandling.EmptyListException;
import Practice.DataStructures.ExceptionHandling.InvalidPositionException;
import Practice.DataStructures.Iterator.ElementIterator;
import Practice.DataStructures.NodeList.Position;
import Practice.DataStructures.NodeList.PositionList;
import Practice.DataStructures.Trees.BoundaryViolationException;

public class NodePositionList<E> implements PositionList<E>{

//	Number of Elements in the List
	protected int numElem;
//	Special sentinals
	protected DNode<E> header,trailer;
	
	/***
	 * Check if the position in the list is valid or not
	 * if it is valid then add it in the DNode else 
	 * throw Invalid Position Exception
	 * time complexity O(1)
	 * 
	 * **/
	protected DNode<E> checkPosition(Position<E> p) throws InvalidPositionException{
		try {
			
			DNode<E> temp=(DNode<E>) p;
			if(p==null ) throw new InvalidPositionException("Null position passed into the node list");
			if(p==header ) throw new InvalidPositionException("Invalid header position");
			if(p==trailer ) throw new InvalidPositionException("Invalid trailer position");
			
			if(temp.getPrev()==null||temp.getNext()==null) throw new InvalidPositionException("Position does not belong to valid node list");
			return temp;
			
		} catch (ClassCastException e) {
			throw new InvalidPositionException("Position is wrong for the list");
			
		}
		
		
	}
	
	
	
	public NodePositionList() {
		numElem=0;
		this.header=new DNode<E>(null,null,null);
		this.trailer=new DNode<E>(header,null,null);
		header.setNext(trailer);
}

	@Override
	public int size() {
		// return number of Elements
		return numElem;
	}
	@Override
	public boolean isEmpty() {
		// Check if the given elements has any size or not
		return (numElem==0);
	}

	@Override
	public Position<E> first() throws EmptyListException{
		if(isEmpty()) throw new EmptyListException("List is Empty");
		
		return header.getNext();
	}

	@Override
	public Position<E> last() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> next(Position<E> p) throws InvalidPositionException, BoundaryViolationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Position<E> previous(Position<E> p) throws InvalidPositionException, BoundaryViolationException {
		DNode<E> checkPosition = checkPosition(p);
		DNode<E> prev = checkPosition.getPrev();
		if(prev==header) throw new BoundaryViolationException("cannot advance past the beginning of the list");
		return prev;
	}

	@Override
	public void addFirst(E e) {
	numElem++;
	DNode<E> v=new DNode<E>(header,header.getNext(),e);
	header.getNext().setPrev(v);
	header.setNext(v);
		
	}

	@Override
	public void addLast(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAfter(Position<E> p, E e) throws InvalidPositionException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBefore(Position<E> p, E e) throws InvalidPositionException {
		
		DNode<E> checkPosition = checkPosition(p);
		numElem++;
		DNode<E> newNode=new DNode<E>(checkPosition.getPrev(), checkPosition, e);
		checkPosition.getPrev().setNext(newNode);
		checkPosition.setPrev(newNode);
	}

	@Override
	public E remove(Position<E> p) throws InvalidPositionException {
		DNode<E> v = checkPosition(p);
		numElem--;
		DNode<E> vPrev = v.getPrev();
		DNode<E> vNext = v.getNext();
			vPrev.setNext(vNext);
			vNext.setPrev(vPrev);
			E vElement = v.Element();
			v.setNext(null);
			v.setPrev(null);
			
		
		return vElement;
	}

	@Override
	public E set(Position<E> p, E e) throws InvalidPositionException {
		DNode<E> v = checkPosition(p);
		E oldElement = v.Element();
		v.setElement(e);
		
		return oldElement;
	}



	@Override
	public Iterator<E> iterator() {
		
		return new ElementIterator<>(this);
	}



	@Override
	public Iterable<Position<E>> positions() {
		PositionList<Position<E>> P=new NodePositionList<Position<E>>();
		if(!isEmpty()) {
			Position<E> p=first();
			while(true) {
				P.addLast(p);
				if(p==last())
					break;
			    try {
					p=next(p);
				} catch (InvalidPositionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (BoundaryViolationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return P;
	}

	

}
