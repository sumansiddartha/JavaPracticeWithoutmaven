package Practice.Capgemenai;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		List<Employee> employee=new ArrayList<>();
		employee.add(new Employee("ABC", 30, "FEMALE", "HR"));
		employee.add(new Employee("PQR", 25, "MALE", "IT"));
		employee.add(new Employee("LMN", 30, "MALE", "HR"));
		employee.add(new Employee("XYZ", 28, "FEMALE", "HR"));
		
		
		
		
		//find Distinct department
		  employee.stream().map(Employee::getDepartment).distinct().
		  forEach(p->System.out.println(p));	
		//find the count of employees working in each department
		Map<String, Long> collect = employee.
				stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(collect);
		//Average age of all the employees male and female
		Map<String, Double> collect2 = employee.stream()
		.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
	
		Double collect3 = employee.stream()
				.collect(Collectors.averagingInt(Employee::getAge));
		
	System.out.println(collect2);
	System.out.println(collect3);
	
	ClassA x=new ClassB();
	x.xyz();
	
	short a=10;
	//System.out.println(a*5);
	
	}
	
	
}
