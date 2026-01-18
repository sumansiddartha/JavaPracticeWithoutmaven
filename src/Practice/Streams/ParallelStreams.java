package Practice.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreams {

	public static void main(String[] args) {
//		the emergence of the ExecutorService and the ForkJoin simplified a developer’s life a little bit, but it was still worth remembering how to create a specific executor, how to run it, and so on. Java 8 introduced a way of accomplishing parallelism in a functional style.
//		The API allows us to create parallel streams, which perform operations in a parallel mode. When the source of a stream is a Collection or an array, it can be achieved with the help of the parallelStream() method:
		List<Product> productList=Arrays.asList(new Product(23, "potatoes"),
				  new Product(14, "orange"), new Product(13, "lemon"),
				  new Product(23, "bread"), new Product(13, "sugar"));
		Stream<Product> streamOfCollection = productList.parallelStream();
		boolean isParallel = streamOfCollection.isParallel();
		System.out.println("checking parallel===>"+isParallel);
		boolean bigPrice=streamOfCollection.map(prod->prod.getPrice()*12).anyMatch(price->price>120);
		System.out.println("bigPrice====>"+bigPrice);
		
//		If the source of a stream is something other than a Collection or an array, the parallel() method should be used:
		IntStream intStreamParallel=IntStream.range(1, 150).parallel();
		boolean isParallel2=intStreamParallel.isParallel();
//		Under the hood, Stream API automatically uses the ForkJoin framework to execute operations in parallel. 
//		By default, the common thread pool will be used and there is no way (at least for now) to assign some custom thread pool to it. This can be overcome by using a custom set of parallel collectors.
		
//		The stream in parallel mode can be converted back to the sequential mode by using the sequential() method:
		IntStream intStreamSequential = intStreamParallel.sequential();
		boolean isParallel3 = intStreamSequential.isParallel();
	}

}
