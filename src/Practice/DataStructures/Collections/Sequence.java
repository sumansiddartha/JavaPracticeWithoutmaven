package Practice.DataStructures.Collections;

import java.util.Deque;

import Practice.DataStructures.ArrayList.IndexList;
import Practice.DataStructures.ExceptionHandling.InvalidPositionException;
import Practice.DataStructures.NodeList.Position;
import Practice.DataStructures.NodeList.PositionList;
import Practice.DataStructures.Trees.BoundaryViolationException;

/***
 * A sequence is an ADT that supports all of the methods of the deque ADT ,
 *  the array list ADT , and the node list ADT . 
 *  That is, it provides explicit 
 * access to the elements in the list either by their indices or by their positions.
 * 
 * 
 * 
 * ****/
public interface Sequence<E> extends Deque<E>,IndexList<E>,PositionList<E>{
	/***
	 * Returns the position containing the element at given index
	 * ****/
	public Position<E> atIndex(int r) throws BoundaryViolationException;
	/***
	 * Returns the index of element stored at given position
	 * ****/
	public int indexOf(Position<E> p) throws InvalidPositionException;

}
