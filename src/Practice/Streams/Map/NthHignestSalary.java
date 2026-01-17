package Practice.Streams.Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class NthHignestSalary {
	
	
	public static void main(String[] args) {
		Map<String,Integer> map1=new HashMap<>();
		map1.put("anil", 25000);
		map1.put("shekar", 25100);
		map1.put("deleep", 25020);
		map1.put("Nagurguan", 45000);
		map1.put("shyam", 17000);
		map1.put("naveen", 5000);
		map1.put("Ravi", 55000);
		map1.put("Srinivas", 75000);
		map1.put("suman", 95000);
		map1.put("nagi", 94000);
		map1.put("prakash", 96000);
		map1.put("shiva", 25200);
		Map<String,Integer> mapWithDuplicateSalaries=new HashMap<>();
		mapWithDuplicateSalaries.put("anil", 25000);
		mapWithDuplicateSalaries.put("shekar", 25100);
		mapWithDuplicateSalaries.put("deleep", 25020);
		mapWithDuplicateSalaries.put("Nagurguan", 45000);
		mapWithDuplicateSalaries.put("shyam", 17000);
		mapWithDuplicateSalaries.put("naveen", 5000);
		mapWithDuplicateSalaries.put("Ravi", 55000);
		mapWithDuplicateSalaries.put("Srinivas", 75000);
		mapWithDuplicateSalaries.put("suman", 95000);
		mapWithDuplicateSalaries.put("Krishna", 95000);
		mapWithDuplicateSalaries.put("Raj", 95000);
		mapWithDuplicateSalaries.put("nagi", 94000);
		mapWithDuplicateSalaries.put("shekar", 95000);
		mapWithDuplicateSalaries.put("prakash", 96000);
		mapWithDuplicateSalaries.put("shiva", 25200);
		mapWithDuplicateSalaries.put("Akhil", 96000);
		mapWithDuplicateSalaries.put("sachin", 96000);
		 
System.out.println(getNthHighestSalaryEvenIfDuplicatesAllowed(4,mapWithDuplicateSalaries));

List<Integer> integerList=Arrays.asList(1,5,5,6,9,7,66,35,43);
Collections.sort(integerList);
Set<Integer> collect = integerList.
							stream().
							sorted(Comparator.reverseOrder())
							.collect(Collectors.toCollection(LinkedHashSet::new));
collect.forEach(System.out::println);

Object[] array = collect.toArray();
System.out.println((Integer) array[1]);


		 System.out.println(getNthHighestSalary(1,map1));

	}
	//if the salary is distinct
	public static Map.Entry<String, Integer> getNthHighestSalary(int num,Map<String,Integer> map){
		Entry<String, Integer> entry = map.entrySet().stream()
									.sorted(Collections
											.reverseOrder(Map.Entry.comparingByValue()))
									.collect(Collectors.toList()).get(num-1);
	return entry;
	}

	public static Map.Entry<Integer, List<String>> getNthHighestSalaryEvenIfDuplicatesAllowed(int num,Map<String,Integer> map){
		//here key becomes salary
		Map<Integer, List<String>> collect = map.entrySet()
				.stream().
				collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())));


Entry<Integer, List<String>> entry = collect.entrySet()
												.stream()
												 .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
												 .collect(Collectors.toList()).get(num-1);
	return entry;	
	}
}
