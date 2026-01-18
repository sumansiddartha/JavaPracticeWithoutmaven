package Practice.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ComparatorMainCheck {
	public static void main(String[] args) {
		List<Employee> listemp=new ArrayList<>();
		listemp.add(new Employee("John", 25, 3000.0, 9922001));
		listemp.add(new Employee("Ace", 22, 4000.0, 5924001));
		listemp.add(new Employee("Ace", 22, 3000.0, 5924001));
		listemp.add(new Employee("Keith", 35, 3000.0, 3924401));
		
		
 Comparator.comparing(Employee::getName);
 

	listemp.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
	System.out.println(listemp.stream().map(Employee::getAge).collect(Collectors.toList()));
	//Collections.sort(listemp,Comparator.comparing(Employee::getName,Comparator.reverseOrder()));
	
		
//		with multiple conditions
		listemp
		.sort(Comparator.
						comparing(Employee::getName)
						.thenComparing(Employee::getSalary)
						.reversed());

	System.out.println(listemp);
		
		
//		System.out.println(comparing);
	Integer[] nums= {1,1,2,2,3,5};

	 Set<Integer> numSet=new HashSet(Arrays.asList(nums));
	 for(Integer n:numSet) {
		 System.out.println(n);
	 }

	
		System.out.println(numSet.toArray());
		
		String s="suman";
		StringBuilder sb=new StringBuilder();
		
		
	}

}
