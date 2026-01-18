package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfNumbers {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		Double average = list.stream().
				mapToDouble(Integer::doubleValue)
				.average().getAsDouble();
		System.out.println(average);

	}

}
