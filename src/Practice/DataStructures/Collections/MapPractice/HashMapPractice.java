package Practice.DataStructures.Collections.MapPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		Map<String, Product> productsByName = new HashMap<>();
		Product eBike = new Product("E-Bike", "A bike with a battery");
		Product roadBike = new Product("Road bike", "A bike for competition");
		productsByName.put(eBike.getName(),eBike);
		productsByName.put(roadBike.getName(),roadBike);
		productsByName.put(null,roadBike);
		
		//System.out.println(productsByName);
		
		
		productsByName.forEach( (key, product) -> {
		    System.out.println("Key: " + key + " Product:" + product.getDescription());
		    //do something with the key and value
		});
		System.out.println("========================");
		for (Map.Entry<String, Product> entry : productsByName.entrySet()) {
			String key = entry.getKey();
			Product val = entry.getValue();
			System.out.println("Key: " + key + " Product:" + val.getDescription());
			
		}
	}
	
	
	
}
