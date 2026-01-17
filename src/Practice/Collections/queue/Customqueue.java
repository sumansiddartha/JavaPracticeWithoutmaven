package Practice.Collections.queue;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;

import org.w3c.dom.views.AbstractView;

public class Customqueue<E> extends AbstractQueue<E>{

	private LinkedList<E> elements;
	
	@Override
	public boolean offer(E e) {
		if(e==null) return false;
		elements.add(e);
		return true;
	}

	@Override
	public E poll() {
	  Iterator<E> itr=elements.iterator();
		E e=itr.next();
		if(e!=null) {
			itr.remove();
			return e;
		}
		return null;
	}

	@Override
	public E peek() {
		
		return elements.getFirst();
	}

	@Override
	public Iterator<E> iterator() {
		
		return elements.iterator();
	}

	@Override
	public int size() {
		
		return elements.size();
	}

}
