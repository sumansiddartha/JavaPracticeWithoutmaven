package Practice.MinMaxArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class CustomMinMaxTest {
public static void main(String[] args) {
	  Car porsche = new Car("Porsche 959", 319);
	    Car ferrari = new Car("Ferrari 288 GTO", 303);
	    Car bugatti = new Car("Bugatti Veyron 16.4 Super Sport", 415);
	    Car mcLaren = new Car("McLaren F1", 355);
	    
	    Car[] fastCars = { porsche, ferrari, bugatti, mcLaren };
	    
	    Car maxBySpeed = Arrays.stream(fastCars)
	    	      .max(Comparator.comparing(Car::getTopSpeed))
	    	      .orElseThrow(NoSuchElementException::new);
	    System.out.println(maxBySpeed);
}
	
	
	
}
