package Practice.Math;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InterviewClass {

	public static void main(String[] args) {
		//["mahesh,Seth","thoran,K","Adit,Narayan"]
		
		List<String> asList = Arrays.asList("mahesh,Seth","thoran,K","Adit,Narayan");
		List<Integer> asList2 = Arrays.asList(1,2,3);
		
		List<String> collect2 = asList.stream().map(x->x.split(",")).map(y->y[1]).collect(Collectors.toList());
		List<Integer> collect = asList2.stream().map(x->{
			if(x%2==0) {
				x=x*2;
			}
			return x;
		}).collect(Collectors.toList());
	
		collect.forEach(System.out::println);
  System.out.println(collect2);
  
 
  
	}

}
