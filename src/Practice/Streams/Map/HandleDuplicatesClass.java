package Practice.Streams.Map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HandleDuplicatesClass {

	public static void main(String[] args) {
		List<String> as=Arrays.asList("ssa","ddfdsa","vasds");
		City city=new City("New York City", "USA",as);
		Map<String, List<String>> collect3 = Stream.of(city).collect(Collectors.toMap(City::getName, City::getXya));
		System.out.println(collect3);
		Map<String, Map<List<String>, List<City>>> collect2 = Stream.of(city).collect(Collectors.groupingBy(City::getName,Collectors.groupingBy(City::getXya)));
		System.out.println(collect2);
		final List<City> CITY_INPUT = Arrays.asList(
				  new City("New York City", "USA"),
				  new City("Shanghai", "China"),
				  new City("Hamburg", "Germany"),
				  new City("Paris", "France"),
				  new City("Paris", "Texas, USA"));
		
		Map<String, List<City>> collect = CITY_INPUT.stream().collect(Collectors.groupingBy(City::getName));
			System.out.println(collect);
			Map<String, City> resultMap1 = CITY_INPUT.stream()
					  .collect(Collectors.toMap(City::getName, Function.identity(), (first, second) -> first));
			System.out.println(resultMap1);
			
		String str="This is suman siddartha";
		char[] charArray = str.toCharArray();
		Stream.of(charArray).forEach(System.out::println);;
	
	}

}
