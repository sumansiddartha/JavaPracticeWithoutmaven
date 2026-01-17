package Practice.DataStructures.queue;

public interface Queue<E> {
	public int size();
	public void enque(E element);
	public E deque() throws EmptyQueueException;
	public E front() throws EmptyQueueException;

}
