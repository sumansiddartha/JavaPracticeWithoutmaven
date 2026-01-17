package Practice.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		Employee1	emp1=new Employee1(12,"xys",23413.00);
		Employee1 emp2=new Employee1(13,"xyr",43411.00);
		Employee1 emp3=new Employee1(14,"xyre",33411.00);
		
		List<Employee1> emp=Arrays.asList(emp1,emp2,emp3);
		Collections.sort(emp);
		System.out.println(emp);
	}

}
