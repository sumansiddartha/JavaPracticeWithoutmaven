package Practice.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPractice {
	
	private static Pattern pattern=Pattern.compile("-?\\d+(\\.\\d+)?");
public static void main(String[] args) {
//System.out.println("This is anempty:::"+StringPractice.isEmptyString("suman"));
//
//String x="somethi is possible";
	String text = "Julia Evans was born on 25-09-1984.		"
			  + "She is currently living in the USA (United States of America).";
	String author = "author";
	String book = "book";
	String duplicateBook = "BOOK";

//System.out.println("This is for reguler expression check::::"+isNumeric(null));
	
	Scanner scanedText=new Scanner(System.in);
	String stringconv=scanedText.nextLine();
System.out.println("This is for compares() check::::"+book.compareToIgnoreCase(duplicateBook));
long count=stringconv.chars().filter(ch -> (char)ch == 'h').count();
System.out.println("count::"+count);
//create a pattern for “dd-mm-yyyy”:

Pattern patternDate=Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
Matcher dateMatcher=patternDate.matcher(text);
String dateM="25-09-1984";
//System.out.println("Matches the date pattern::::"+dateM.equals(dateMatcher.group()));

String[] sentences = text.split("\\t");
System.out.println(new StringBuilder(stringconv).reverse().toString().equals(stringconv));
}

 static boolean isEmptyString(String string) {
		
	boolean emptyCheck = string.isEmpty();
return string == null ||emptyCheck;
}
 
 
 public static boolean isNumeric(String string) {
	 
	 
	 if(string==null) {
		 return false;
	 }
	 return pattern.matcher(string).matches();
 }
 
 
 
 
 
}
