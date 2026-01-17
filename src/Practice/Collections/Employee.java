package Practice.Collections;

public class Employee implements Comparable<Employee> {
	  private int employeeId;
	    private String employeeName;
	
	
	
	
	
	
	public Employee(int employeeId, String employeeName) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
		}






	@Override
	public int compareTo(Employee o) {
		if(this.employeeId==o.employeeId) {
			System.out.println("employee id equal"+this.employeeId+"=="+o.employeeId );
			return 0;
		}else if(this.employeeId<o.employeeId) {
			System.out.println(this.employeeId+" is less than "+o.employeeId);
			return 1;
		}else {
			return -1;
		}
		
	}






	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]\n";
	}
	

}
