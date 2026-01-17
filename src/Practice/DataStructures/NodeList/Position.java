package Practice.DataStructures.NodeList;

import Practice.DataStructures.ExceptionHandling.InvalidPositionException;

public interface Position<T> {
	
	
	/**Return the element stored in the position***/
	
	T Element() throws InvalidPositionException;

}
