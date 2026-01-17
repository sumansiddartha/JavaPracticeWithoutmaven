package Practice.DataStructures.Trees;

import Practice.DataStructures.ExceptionHandling.InvalidPositionException;
import Practice.DataStructures.NodeList.Position;

public class TreeImp {
	
//	This is for tree traversal algorithms
	
	public static <E> int depth(Tree<E> T,Position<E> v) throws InvalidPositionException, BoundaryViolationException {
		if(T.isRoot(v))
			return 0;
		
		return 1+depth(T,T.parent(v));
	}
	
	
	
	
	public static <E> int height1(Tree<E> T) throws InvalidPositionException, BoundaryViolationException {
		
		int h=0;
		
		for(Position<E> v:T.positions()) {
		   if(T.isExternal(v)) {
			   h=Math.max(h, depth(T,v));
		   }	
		}
		
		return h;
	}
	
	
	public static <E> int height2(Tree<E> T,Position<E> v) throws InvalidPositionException {
		if(T.isExternal(v)) return 0;
		int h=0;
		for(Position<E> w:T.children(v))
			h=Math.max(h, height2(T,w));
		return 1+h;
	}
	
	public static <E> String toStringPreOrder(Tree<E> T,Position<E> v) throws InvalidPositionException {
		String s=v.Element().toString();
		for(Position<E> w:T.children(v)) {
			s+=", "+toStringPreOrder(T, w);
		}
		
		return s;
	}
	
	public static <E> String parentheticRepresentation(Tree<E> T,Position<E> v) throws InvalidPositionException {
		String s=v.Element().toString();
		
		if(T.isInternal(v)) {
			boolean firstTime=true;
			for(Position<E> w:T.children(v))
				if(firstTime) {
					s+="("+parentheticRepresentation(T,w);
					firstTime=false;
				}
				else
					s+=", "+parentheticRepresentation(T,w);
			s+=" )";
		}
		
		return s;
	}
	public static <E> String toStringPostOrder(Tree<E> T,Position<E> v) throws InvalidPositionException {
		String s=" ";
		for(Position<E> w:T.children(v)) {
			s+=toStringPostOrder(T, w)+" ";
		}
		s+=v.Element();
		return s;
	} 
	
	public static void main(String[] args) {
		
	}

}
