package Practice.DataStructures.Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import Practice.DataStructures.ExceptionHandling.InvalidPositionException;
import Practice.DataStructures.NodeList.Position;
import Practice.DataStructures.NodeList.PositionList;
import Practice.DataStructures.Trees.BoundaryViolationException;

public class ElementIterator<E> implements Iterator<E>{
	
	//underlying List
	protected PositionList<E> list;
	//next position
	protected Position<E> cursor;

	
	
	
	public ElementIterator(PositionList<E> L) {
		
		this.list = L;
		cursor=(list.isEmpty())?null:list.first();
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return (cursor!=null);
	}

	@Override
	public E next() throws NoSuchElementException{
		if(cursor==null) throw new NoSuchElementException("There is no next element");
		try {
			E toReturn=cursor.Element();
			cursor=(cursor==list.last())?null:list.next(cursor);
			return toReturn;
		} catch (InvalidPositionException | BoundaryViolationException e) {
			// TODO Auto-generated catch block
			
		}
		
		return null;
	}

}
