package Practice.FunctionalInterfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FunctionalInterfacePractice {

	
	public static void main(String[] args) {
		Map<String, Integer> nameMap = new HashMap();
		nameMap.put("John", 10);
		Integer value = nameMap.computeIfAbsent("John", s -> s.length());
		System.out.println(nameMap);
		Function<Integer,String> intToString=Object::toString;
		Function<String,String> quote=s->"'" + s + "'";
		Function<Integer,String> quoteIntToString=quote.compose(intToString);
		System.out.println(quoteIntToString.apply(6));
		
		
//		Primitive Function Specializations
		short[] array = {(short) 1, (short) 2, (short) 3};
		byte[] transformedArray = transformArray(array, s -> (byte) (s * 2));

		byte[] expectedArray = {(byte) 2, (byte) 4, (byte) 6};
		
		System.out.println(Arrays.equals(transformedArray, expectedArray));
		
//		Two-Arity Function Specializations
		Map<String, Integer> salaries = new HashMap<>();
		salaries.put("John", 40000);
		salaries.put("Freddy", 30000);
		salaries.put("Samuel", 50000);
		System.out.println(salaries);
		salaries.replaceAll((name,oldValue)->
			name.equals("Freddy")?oldValue:oldValue+1000
		);
		System.out.println(salaries);
		//Supplier Example
		  Supplier<Double> lazyValue = () -> {
	            try {
	                // Sleep for 1000 milliseconds (1 second)
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                // Handle the interruption if needed
	                Thread.currentThread().interrupt(); // Restore the interrupt status
	            }
	            return 9d;  // Return the value
	        };
	        squareLazy(lazyValue);
	        Double valueSquared = squareLazy(lazyValue);
	        System.out.println(valueSquared);
	        
	        int[] fibs = {0, 1};
	        Stream<Integer> fibonacci = Stream.generate(() -> {
	            int result = fibs[1];
	            int fib3 = fibs[0] + fibs[1];
	            fibs[0] = fibs[1];
	            fibs[1] = fib3;
	            return result;
	        });
	       
	        
	        
	}
	
	
	public static byte[] transformArray(short[] array, ShortToByteFunction function) {
	    byte[] transformedArray = new byte[array.length];
	    for (int i = 0; i < array.length; i++) {
	        transformedArray[i] = function.applyAsByte(array[i]);
	    }
	    return transformedArray;
	}
	
	//Supplier Example
	public static double squareLazy(Supplier<Double> lazyValue) {
	    return Math.pow(lazyValue.get(), 2);
	}
	
}
