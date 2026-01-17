package Practice.Streams.Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeePracticeMain {
	
	public static void main(String[] args) {
		Employee emp1=new Employee(200000.00,"suman"); 
		Employee emp2=new Employee(21000.00,"phrakash"); 
		Employee emp3=new Employee(250000.00,"rakesh"); 
		Employee emp4=new Employee(325000.00,"Radha"); 
		Employee emp5=new Employee(230000.50,"suman sidd"); 
		Employee emp6=new Employee(230000.10,"suman1"); 
		Employee emp7=new Employee(250000.00,"sudha");
		List<Employee> emplist=Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7);
		System.out.println(emplist);
		//emplist.stream().collect(Collectors.groupingBy(Employee::salary,Collectors.));
		 Map<String, Double> collect = emplist.stream().collect(Collectors.groupingBy(
			        Employee::getName,
			        Collectors.summingDouble(e -> (double) e.getSalary())
			    ));
		 
		 emplist.stream().collect(Collectors.groupingBy(e->e.getSalary()));
		 Map<String, Long> collect3 = emplist.stream().collect(Collectors.groupingBy(
				 Employee::getName,
				 Collectors.summingLong(e -> (long) e.getSalary())
				 ));
		 
//		 Entry<String, Double> entry3 = collect.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(1);
//		 System.out.println(entry3);
//		 //salary with list of names
//		 Map<Double, List<String>> collect4 = collect.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
//		 Entry<Double, List<String>> entry4 = collect4.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(1);
//		 System.out.println(entry4);
		 collect.entrySet().stream().sorted(Map.Entry.comparingByValue());
		 System.out.println(collect);
		 
		 
		 Entry<String, Double> entry3 = collect.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(0);
		
		 System.out.println(entry3);
		 
		 Entry<String, Double> entry = collect.entrySet().
													stream().
													sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
													.collect(Collectors.toList()).get(0);
	
		
		Map<Double, List<String>> collect2 = collect.entrySet().stream().
		collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
	
	Entry<Double, List<String>> entry2 = collect2.entrySet().stream()
			.sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(0);
	System.out.println(entry2);
	
	
	}

}
