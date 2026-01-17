package Practice.Capgemenai;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyChecker {

	public static void main(String[] args) {
		//Alphabet Frequency
		String input = "example string to calculate frequency";
		
		Map<Character,Long> frequencyMap=input.
										chars()
										.filter(Character::isLetter)
										.mapToObj(c->(char)c)
										.collect(
												Collectors
												.groupingBy(
														Function.identity(),Collectors.counting()));
		frequencyMap.forEach((k,v)->System.out.println(k+" : "+v));
		
		Float pi=new Float(3.14f);
		if(pi<5) {
			System.out.println("fgsfgffgdfg");
		}else {
			System.out.println("suman");
			
		}
		
	}

}
