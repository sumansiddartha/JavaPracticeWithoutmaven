package Practice.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainForEmployeeTest {

	public static void main(String[] args) {
		
//		 private int id;
//		    private String name;
//		    private int age;
//		    private long salary;
		
		List<Employee> emplist=Arrays.asList(new Employee(1, "suman", 34, 25333),
				new Employee(1, "siddartha", 28, 27698),
				new Employee(3, "sharat", 29, 30000));
		System.out.println(emplist);
		
//		 emplist.stream()
//			    .collect(Collectors.groupingBy(
//			        Employee::salary,Collectors.mapping(e->e.getName(),Collectors.toList())));
			        
			   
	}

}
