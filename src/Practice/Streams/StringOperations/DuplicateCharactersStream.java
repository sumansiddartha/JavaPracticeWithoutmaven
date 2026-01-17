package Practice.Streams.StringOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersStream {
public static void main(String[] args) {
	String str="My name is suman siddartha";
	str.chars().forEach(System.out::println);
	str.chars()
	.mapToObj(i->(char)i).forEach(System.out::print);
	System.out.println();
	str.chars().mapToObj(i->(char)i)
	.collect(Collectors.groupingBy(i->i,Collectors.counting())).forEach((k,v)->System.out.println(k+"->"+v));
//	str.stream().map(i->i.toCharArray());
	
	List<Integer> asList = Arrays.asList(1,2,10,12,13);
	asList.stream().filter(n->String.valueOf(n).contains("1")).forEach(System.out::println);
	
	String xyz="Welcome to Java";
	Map<Character, Long> collect = xyz.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	;
	collect.forEach((k,v)->System.out.println(k+"=="+v));
	collect.entrySet().stream().filter(x->x.getValue()>1).collect(Collectors.toList()).forEach(System.out::println);;
}
}
