package Practice.Capgemenai;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImmutabilityTest {
public static void main(String[] args) {
   String name=new String("suman");
	String name1=new String("suman");
	String intern = name1.intern();
	System.out.println("suman"==name1);
	System.out.println(name.equals(name1));
	String[] strings = {"I'm", "running", "out", "of", "pangrams!"};
	String join = String.join(" ", strings);
	System.out.println(join);
	List<String> awesomeAnimals = Arrays.asList("Shark", "Panda", "Armadillo");
	String collect = awesomeAnimals.stream().collect(Collectors.joining(", "));
	System.out.print(collect);
	System.out.println("");
	
	///Stirn iteration
	collect.chars().mapToObj(c->(char)c).forEach(System.out::println);
	
	CharacterIterator it=new StringCharacterIterator(collect);
	while(it.current()!=CharacterIterator.DONE) {
		System.out.print(it.current());
		it.next();
	}
	//check for palindrome
	System.out.println("somtthing");
	String str="pop";
	StringBuilder strB=new StringBuilder(str).reverse();
	String string = strB.toString();
	Arrays.sort(string.toCharArray());
	System.out.println("xxxxx"+string);
	System.out.println("xxxxx"+string.equals(str));
	if(string.equals(str)) {
		System.out.println("String is a palindrome");
	}
	//reversing string
	String stringToReverse="This is a check for string revarsal";
	String collect2 = Stream.of(stringToReverse).map(stri->new StringBuilder(stri).reverse()).collect(Collectors.joining());
		System.out.println(collect2);
}
}
