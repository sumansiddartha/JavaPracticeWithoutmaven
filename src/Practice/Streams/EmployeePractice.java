package Practice.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeePractice {
	
	   
	   public static void main(String[] args) {
		   List<Employee> employees = new ArrayList<Employee>();
		   employees.add(new Employee(10, "Ramesh", 30, 400000));
	        employees.add(new Employee(20, "John", 29, 350000));
	        employees.add(new Employee(30, "Tom", 30, 450000));
	        employees.add(new Employee(30, "Tom", 30, 450000));
	        employees.add(new Employee(40, "Pramod", 29, 500000));
	        employees.add(new Employee(40, "Pramod", 30, 500000));
	        
	      //I am sorting the list based on salary
	        
	        List<Employee> employeesSortedList1 = employees.stream()
	        												.sorted((o1,o2)->(int)(o2.getSalary() - o1.getSalary()))
	        												.collect(Collectors.toList());
	        		System.out.println(employeesSortedList1);
	        	
	 
	   List<Employee> collect = employees.stream().
			   								sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
	   
	   List<Employee> collect2 = employees.stream().collect(Collectors.toMap(Employee::getSalary,e->e,(e1,e2)->e1)).values().stream().
			   sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
	   
	   System.out.println(collect);
	   System.out.println(collect2);
	   }
}
