package Practice.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreamsMain {
	
	public static void main(String[] args) {
		Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 2);
		System.out.println(infiniteStream);
		List<Integer> collect = infiniteStream
				  .limit(10)
				  .collect(Collectors.toList());
		System.out.println(collect.equals(Arrays.asList(0, 2, 4, 6, 8, 10, 12, 14, 16, 18)));
	
		Supplier<UUID> randomUUIDSupplier = UUID::randomUUID;
		Stream<UUID> infiniteStreamOfRandomUUID = Stream.generate(randomUUIDSupplier);
		List<UUID> randomInts = infiniteStreamOfRandomUUID
				  .skip(10)
				  .limit(10)
				  .collect(Collectors.toList());
		
		
//		Do-While – the Stream Way
		int i = 0;
		while (i < 10) {
		    System.out.println(i);
		    i++;
		}
	
		
		Stream<Integer> integers = Stream
				  .iterate(1, j -> j + 1);
		integers.limit(10).forEach(System.out::print);
		
	
	}

}
