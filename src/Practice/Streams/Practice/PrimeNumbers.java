package Practice.Streams.Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {

	private static boolean getPrimeNumber(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
			return false;	
			}
		}
		return true;
	} 
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		List<Integer> collect = numbers.stream().filter(PrimeNumbers::getPrimeNumber).collect(Collectors.toList());
		System.out.println(collect);
//		missingNumbers which are primes
		
		List<Integer> numbers2 = Arrays.asList(2, 3, 4,  8, 9, 10, 11);
		Set<Integer> set=new HashSet<>(numbers2);
		List<Integer> collect2 = IntStream.rangeClosed(0, 12).filter(n->!set.contains(n)).filter(PrimeNumbers::getPrimeNumber).boxed().collect(Collectors.toList());
	
	System.out.println(collect2);
	}
	
}
