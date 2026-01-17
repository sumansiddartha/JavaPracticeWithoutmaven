package Practice.Streams.GroupBy;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByPracticeGeneral {
public static void main(String[] args) {
	String[] str= {"sdfas","adfaf","dfafasdfd","dsadfsafdsfd","sdfas","xsdmlmfdssdalm","dsadfsafdsfd"};
	Stream<String> distinct = Stream.of(str);
	distinct.collect(Collectors.groupingBy(String::length,Collectors.toSet())).forEach((k,v)->System.out.println(k+","+v));;
	
	
}
}
