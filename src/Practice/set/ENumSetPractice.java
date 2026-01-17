package Practice.set;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class ENumSetPractice {
	
	static Color color;
	
public ENumSetPractice(Color color) {
		super();
		this.color = color;
	}

public static void main(String[] args) {
	

	
	
//	System.out.println(color.compareTo(Color.RED));
	
	EnumSet<Color> allOf = EnumSet.allOf(Color.class);
	System.out.println(allOf);
	EnumSet<Color> noneOf = EnumSet.noneOf(Color.class);
	System.out.println(noneOf);
//	EnumSet is a public abstract class that contains multiple static factory methods 
//	RegularEnumSet and
//	JumboEnumSet
//	JumboEnumSet uses an array of long elements as a bit vector. 
//	This lets this implementation store more than 64 elements
	
	
	EnumSet<Color> range = EnumSet.range(Color.YELLOW, Color.BLUE);
	System.out.println(range);
	
	
	/**
	 * Another useful factory method is the complementOf() 
	 * that allows us to exclude the elements passed as parameters.
	 * 
	 * 
	 * */
	
	EnumSet<Color> complementOf = EnumSet.complementOf(EnumSet.of(Color.BLACK, Color.WHITE));
	System.out.println(complementOf);
	
	
	
	List<Color> colorsList = new ArrayList<>();
	colorsList.add(Color.RED);
	EnumSet<Color> listCopy = EnumSet.copyOf(colorsList);
	System.out.println(listCopy);
	
	
	EnumSet<Color> set = EnumSet.noneOf(Color.class);
	set.add(Color.RED);
	set.add(Color.YELLOW);
	
	set.remove(Color.RED);
	set.forEach(System.out::println);
}
}
