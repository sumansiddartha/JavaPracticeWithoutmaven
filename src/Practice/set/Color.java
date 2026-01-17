package Practice.set;

public enum Color {
	RED, YELLOW, GREEN, BLUE, BLACK, WHITE
	
	
	
//	It can contain only enum values and all the values have to belong to the same enum
//	It doesn’t allow to add """null""" values, throwing a NullPointerException in an attempt to do so
//	It’s not thread-safe, so we need to synchronize it externally if required
//	The elements are stored following the order in which they are declared in the enum
//	It uses a fail-safe iterator that works on a copy, so it won’t throw a ConcurrentModificationException if the collection is modified when iterating over it
}
