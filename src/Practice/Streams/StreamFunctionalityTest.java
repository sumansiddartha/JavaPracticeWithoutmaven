package Practice.Streams;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamFunctionalityTest {
	public Stream<String> streamOf(List<String> list){
		return list==null||list.isEmpty()?Stream.empty():list.stream();
	}
	public static void main(String[] args) throws IOException {
		//Creating empty Streams
		Stream<Object> empty = Stream.empty();
		//StreamBuilder
//		When builder is used, the desired type should be additionally specified in the right part of the statement
	Stream.<String>builder().add("a").add("b").add("c").build();
	
//	The generate() method accepts a Supplier<T> for element generation.
//	As the resulting stream is infinite, the developer should specify the desired size, or the generate() method will work until it reaches the memory limit:
	Stream.generate(()->"element").limit(10);
//	Another way of creating an infinite stream is by using the iterate() method
	Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
	
//	Stream of Primitives
//	Java 8 offers the possibility to create streams out of three primitive types: 
//	int, long and double
	 IntStream.range(1, 3);
	 LongStream.rangeClosed(1, 3);
//	 We can also use String as a source for creating a stream with the help of the chars() method of the String class. 
//	 Since there is no interface for CharStream in JDK, we use the IntStream to represent a stream of chars instead.
	 IntStream streamOfChars = "abc".chars();
//	 
//	 2.9. Stream of File
//	 Furthermore, Java NIO class Files allows us to generate a Stream<String> of a text file through the lines() method. Every line of the text becomes an element of the stream:
//	 Path path = Paths.get("C:\\file.txt");
//	 Stream<String> streamOfStrings = Files.lines(path);
//	 Stream<String> streamWithCharset = 
//	   Files.lines(path, Charset.forName("UTF-8"));
//	 ======================================================3. Referencing a Stream============================
//	 We can instantiate a stream, and have an accessible reference to it, as long as only intermediate operations are called. Executing a terminal operation makes a stream inaccessible
	 Stream<String> stream = 
			  Stream.of("a", "b", "c").filter(element -> element.contains("b"));
	 Optional<String> anyElement = stream.findAny();
//	 However, an attempt to reuse the same reference after calling the terminal operation will trigger the IllegalStateException:
//	 Optional<String> firstElement = stream.findFirst();

	 //	 As the IllegalStateException is a RuntimeException, a compiler will not signalize about a problem. So it is very important to remember that Java 8 streams can’t be reused.

//	 This kind of behavior is logical. We designed streams to apply a finite sequence of operations to the source of elements in a functional style, not to store elements.
	 List<String> elements =
			  Stream.of("a", "b", "c").filter(element -> element.contains("b"))
			    .collect(Collectors.toList());
			Optional<String> anyElement1 = elements.stream().findAny();
			Optional<String> firstElement = elements.stream().findFirst();
			System.out.println(anyElement+"======"+firstElement);
			
//			4.Stream Pipeline
//			To perform a sequence of operations over the elements of the data source and aggregate their results, we need three parts: 
//			the source, intermediate operation(s) and a terminal operation.
//			Intermediate operations return a new modified stream. For example, to create a new stream of the existing one without few elements, the skip() method should be used
			Stream<String> onceModifiedStream =
					  Stream.of("abcd", "bbcd", "cbcd").skip(1);
			
//			If we need more than one modification, we can chain intermediate operations
//			Let’s assume that we also need to substitute every element of the current Stream<String> with a sub-string of the first few chars. 
//			We can do this by chaining the skip() and map() methods:
			Stream<String> stream2 =
					  Stream.of("abcd", "bbcd", "cbcd");
			Stream<String> twiceModifiedStream =
					  stream2.skip(1).map(element -> element.substring(0, 3));
//			The correct and most convenient way to use streams is by a stream pipeline, which is a chain of the stream source, intermediate operations, and a terminal operation:
			List<String> list = Arrays.asList("abc1", "abc2", "abc3");
			long size = list.stream().skip(1)
			  .map(element -> element.substring(0, 3)).sorted().count();
	
	}

}
