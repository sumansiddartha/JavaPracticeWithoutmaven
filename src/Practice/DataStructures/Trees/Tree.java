package Practice.DataStructures.Trees;

import java.util.Iterator;

import Practice.DataStructures.ExceptionHandling.EmptyTreeException;
import Practice.DataStructures.ExceptionHandling.InvalidPositionException;
import Practice.DataStructures.NodeList.Position;



public interface Tree<E> {
	public int size();
	public boolean isEmpty();
	/*******Returns an iterator of element s stored in a tree**********/
	public Iterator<E> iterator();
	/*******Returns an iterable collection of nodes**********/
	public Iterable<Position<E>> positions();
	
//	Replace the element stored in given node
	public E replace(Position<E> v,E e) throws InvalidPositionException;
	
//	returns the root of the tree
	public Position<E> root() throws EmptyTreeException;
//	returns the parent of the given node
	public Position<E> parent(Position<E> v) throws InvalidPositionException,BoundaryViolationException;
//	returns an iterable collection of the children of the given node
	public Iterable<Position<E>> children(Position<E> v) throws InvalidPositionException;
//	returns whether a given node is internal
	public boolean isInternal(Position<E> v) throws InvalidPositionException;
//	returns whether a given node is external
	public boolean isExternal(Position<E> v) throws InvalidPositionException;
	
//	returns whether the given node is the root of the tree
	public boolean isRoot(Position<E> v) throws InvalidPositionException;
	
}
 