package Practice.Collections;

public class Employee1 implements Comparable<Employee1>{
	  private int employeeId;
	    private String employeeName;
	    private double salary;
	    
		public Employee1(int employeeId, String employeeName, double salary) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.salary = salary;
		}

		@Override
		public int compareTo(Employee1 o) {
			if(o.salary>this.salary) {
				return 1;
			}else {
				return -1;
			}
			//return 0;
		}

		@Override
		public String toString() {
			return "Employee1 [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
					+ "]";
		}
	    
}
