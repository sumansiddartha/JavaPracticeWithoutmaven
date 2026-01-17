package Practice.Streams.GroupBy;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class GroupByPracticeMain {
//	groupingBy(classifier)
//	groupingBy(classifier, collector)
//	groupingBy(classifier, supplier, collector)
	
	
/******************PARALLEL PROCESSING******************************/
//	groupingByConcurrent(classifier)
//	groupingByConcurrent(classifier, collector)
//	groupingByConcurrent(classifier, supplier, collector)
	
	public static void main(String[] args) {
		
		
		List<Person> persons = List.of(
			    new Person(1, "Alex", 100d, new Department(1, "HR")),
			    new Person(2, "Brian", 200d, new Department(1, "HR")),
			    new Person(3, "Charles", 900d, new Department(2, "Finance")),
			    new Person(4, "David", 200d, new Department(2, "Finance")),
			    new Person(5, "Edward", 200d, new Department(2, "Finance")),
			    new Person(6, "Frank", 800d, new Department(3, "ADMIN")),
			    new Person(7, "George", 900d, new Department(3, "ADMIN")));
		
		Map<Department, List<Person>> collect = persons.
														stream().
																collect(Collectors.groupingBy(Person::department));
		System.out.println(collect);
		
//		group on distinct departments and salary pairs
		Map<Map<Double, Department>, List<Person>> collect6 = persons.stream().
																			collect(Collectors.groupingBy(person->Collections.singletonMap(person.salary(),person.department())));
	
		System.out.println("--------------------------------------");
		System.out.println("-------------collect6-----------------\n"+collect6);
		System.out.println("--------------------------------------");
		
		
		//Grouping by counting
		
		Map<Department, Long> collect2 = persons.
											stream().
											collect
											(Collectors.
													groupingBy(Person::department,Collectors.counting()));
			System.out.println(collect2);
			
//			Grouping with average
			
			Map<Department, Double> collect3 = persons.stream().
					collect(Collectors.groupingBy(Person::department,Collectors.averagingDouble(Person::salary)));
			
	    System.out.println("This is average salary of a persson in department \n"+collect3);
	    
	    //grouping with filtering
	    Map<Department, Long> collect4 = persons.stream()
	    										.filter(p->p.salary()>300d)
	    										.collect(Collectors.groupingBy(Person::department,Collectors.counting()));
	    	System.out.println(collect4);
	    	
	    	//Grouping with MIN/Max
	    	Map<Department, Optional<Person>> collect5 = persons
	    													.stream()
	    													.collect(
	    															Collectors.groupingBy(Person::department,
	    															Collectors.maxBy(Comparator.comparing(Person::salary))));
	    		System.out.println(collect5);
	}
	
	
}
