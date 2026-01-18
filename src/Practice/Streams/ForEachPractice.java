package Practice.Streams;

import java.util.stream.Stream;

public class ForEachPractice {

	public static void main(String[] args) {
		
		Stream.of("cat", "dog", "elephant", "fox", "rabbit", "duck").takeWhile(n -> n.length() % 2 != 0).forEach(System.out::println);
		Stream.of("cat", "dog", "elephant", "fox", "rabbit", "duck").dropWhile(n -> n.length() % 2 != 0).forEach(System.out::println);
		
	}
}
