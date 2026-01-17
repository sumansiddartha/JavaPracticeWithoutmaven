package Practice.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStreamMain {

	public static void main(String[] args) {
		String sentence="This is suman siddartha";
		String collect = sentence.
						 chars().
						 filter(c->!Character.isWhitespace(c))
						 .mapToObj(c->String.valueOf((char)c))
						 .collect(Collectors.joining());
		 Stream.of(sentence).map(n->n.replaceAll("\\s", "")).forEach(System.out::print);
//		System.out.println(map+":::::::");
//		
//		System.out.println(collect);
//		sentence=sentence.replaceAll("\\s", "");
//		System.out.println(sentence);
//		String[] split = sentence.split("\\t");
//	for(String s:split) {
//		System.out.print(s);
//	}
	
//		 List<Integer> list= Arrays.of();
		 
		 String inputString = "BBaaeelldduunngg";
		 	///distinct characters
		 
		 inputString.chars().mapToObj(c->(char)c).collect(Collectors.toSet()).forEach(System.out::println);
		 
		 
		 
	}

}
